package com.footify.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.footify.dto.AuthResponseDTO;
import com.footify.dto.LoginRequestDTO;
import com.footify.dto.RegisterRequestDTO;
import com.footify.entity.Users;
import com.footify.repository.userRepository;

@Service
public class AuthService {

	@Autowired
	private userRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JWTService jwtService;
	
	public String register(RegisterRequestDTO dto) {
		Users user = new Users();
		user.setUserName(dto.getUsername());
		user.setPassword(passwordEncoder.encode(dto.getPassword()));
		user.setRole("USER");
		userRepository.save(user);
		return "USER REGISTER SUCCESSFULLY";
	}
	
	public AuthResponseDTO login(LoginRequestDTO requestDTO) {
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						requestDTO.getUsername()
						, requestDTO.getPassword()
						)
				);
		Users user = userRepository.findByUsername(requestDTO.getUsername()).orElseThrow();
		String token = jwtService.generateToken(user.getUserName(), user.getRole());
		return new AuthResponseDTO(token);
	}
}
