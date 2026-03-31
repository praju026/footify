package com.footify.service;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {

	private static final String secretKey=
					"aGVsbG9mb290aWZ5c2VjdXJpdHlqd3RzZWNyZXRrZXlob2xkZXIxMjM0NTY3ODkw";
	
	public String generateToken(String username,String role) {
		return Jwts.builder()
				.subject(username)
				.claim("role",role)
				.issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis()+1000*60*60*10))
				.signWith(getKey())
				.compact();
	}

	public String extractUsername(String token) {
		
		return Jwts.parser()
				.verifyWith((javax.crypto.SecretKey) getKey())
				.build()
				.parseSignedClaims(token)
				.getPayload()
				.getSubject();
	}
	
	public boolean validateToken(String username , String token) {
		 String extractedUsername = extractUsername(token);
		return extractedUsername.equals(token) &&! isTokenExpired(token);
	}
	private boolean isTokenExpired(String token) {
		
		 		Date expiration = Jwts.parser()
                .verifyWith((javax.crypto.SecretKey) getKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getExpiration();
        return expiration.before(new Date());
    }

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

	
}
