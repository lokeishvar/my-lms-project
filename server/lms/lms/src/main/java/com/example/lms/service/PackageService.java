package com.example.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lms.repository.PackageRepository;
import com.example.lms.entity.Package;

@Service
public class PackageService {
	
	@Autowired
	private PackageRepository packageRepository;
	
	public Package save(Package package1) {
		return packageRepository.save(package1);
	}
	
	public Iterable<Package> readAll() {
		return packageRepository.findAll();
	}
}
