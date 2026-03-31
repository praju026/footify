package com.footify.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.footify.entity.Users;

@Repository
public interface userRepository extends JpaRepository<Users, Long> {
	
	Optional<Users> findByUsername(String username);

}
