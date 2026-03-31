package com.footify.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.footify.entity.Users;
import com.footify.repository.userRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private userRepository usersRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 Users user = usersRepository.findByUsername(username)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

	        return new User(
	                user.getUserName(),
	                user.getPassword(),
	                Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + user.getRole()))
	        );	
	        }

}
