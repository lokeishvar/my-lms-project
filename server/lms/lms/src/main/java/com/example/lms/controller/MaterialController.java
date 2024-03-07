package com.example.lms.controller;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.lms.dto.MaterialUploadStatus;
import com.example.lms.entity.Material;
import com.example.lms.service.MaterialService;

@RestController
@RequestMapping("material")
@CrossOrigin()
public class MaterialController {

	@Autowired
	private MaterialService materialService;
	
	@PostMapping
	public ResponseEntity<MaterialUploadStatus> save(@RequestBody MultipartFile material) throws Exception {
		File file = new File("E:\\feb 2024 project client side\\mylms\\src\\assets\\file\\" + material.getOriginalFilename());
		byte[] bytes = material.getBytes();
		FileOutputStream fout = new FileOutputStream(file);
		fout.write(bytes);
		fout.close();
		
		Material fileName = new Material();
		fileName.setMaterialName(material.getOriginalFilename());
		materialService.save(fileName);
		
		MaterialUploadStatus materialUploadStatus = new MaterialUploadStatus();
		materialUploadStatus.setMessage("Material uploaded successfully");
		materialUploadStatus.setStatus(true);
		return ResponseEntity.ok(materialUploadStatus);
	}
}
