package com.example.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lms.entity.Material;
import com.example.lms.repository.MaterialRepository;

@Service
public class MaterialService {
	@Autowired
	private MaterialRepository materialRepository;
	
	public String save(Material material) {
		materialRepository.save(material);
		return "Material saved to database successfullyS";
	}
}
