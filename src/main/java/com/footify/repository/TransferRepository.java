package com.footify.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.footify.entity.Transfer;

@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {

	 List<Transfer> findByPlayerId(Long player_Id);
}
