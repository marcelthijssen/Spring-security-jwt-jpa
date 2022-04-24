package com.javainuse.repository;

import com.javainuse.model.AUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AUserRepository extends JpaRepository<AUser, Integer> {
	
	AUser findByUsername( String username);
	
}