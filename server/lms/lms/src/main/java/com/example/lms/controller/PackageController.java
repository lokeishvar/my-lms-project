package com.example.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lms.service.PackageService;
import com.example.lms.dto.SaveSuccessStatus;
import com.example.lms.entity.Package;


@RestController
@RequestMapping("package")
@CrossOrigin
public class PackageController {
	
	@Autowired
	private PackageService packageService;
	
	@PostMapping("post")
	public ResponseEntity<SaveSuccessStatus> save(@RequestBody Package package1) {
		packageService.save(package1);
		SaveSuccessStatus saveSuccessStatus = new SaveSuccessStatus();
		saveSuccessStatus.setMessage("Data saved successfully");
		saveSuccessStatus.setStatus(true);
		return ResponseEntity.ok(saveSuccessStatus);
	}
	
	@GetMapping("get")
	public Iterable<Package> readAll() {
		return packageService.readAll();
	}
}
