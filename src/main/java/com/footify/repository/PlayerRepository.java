package com.footify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.footify.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

}
