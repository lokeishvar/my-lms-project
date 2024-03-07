package com.example.lms.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.lms.entity.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, String>{

	public AppUser findByTokenAndEmail(String token, String email);
	
	public AppUser findByEmail(String email);
}