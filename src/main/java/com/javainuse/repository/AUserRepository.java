package com.javainuse.repository;

import com.javainuse.model.AUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AUserRepository extends CrudRepository<AUser, Integer> {
	
	AUser findByUsername( String username);
	
}