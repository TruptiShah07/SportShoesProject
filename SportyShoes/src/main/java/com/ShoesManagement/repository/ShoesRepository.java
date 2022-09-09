package com.ShoesManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ShoesManagement.Model.Shoe;

@Repository
public interface ShoesRepository extends JpaRepository<Shoe, Integer>{
	
}