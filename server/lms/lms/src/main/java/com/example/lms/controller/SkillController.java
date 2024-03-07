package com.example.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lms.entity.Skill;
import com.example.lms.service.SkillService;

@RestController
@RequestMapping("skill")
@CrossOrigin
public class SkillController {
	
	@Autowired
	private SkillService skillService;
	
	@PostMapping("post")
	public Skill save(@RequestBody Skill skill) {
		return skillService.save(skill);
	}
	
	@GetMapping("getall")
	public Iterable<Skill> readall() {
		return skillService.readall();
	}
	
	@GetMapping("getById/{id}")
	public Skill readById(@PathVariable Integer id) {
		return skillService.readById(id);
	}
	
	@DeleteMapping("deleteById/{id}")
	public String deleteById(@PathVariable Integer id) {
		skillService.deleteById(id);
		return "Skill with id " + id + " got deleted.";
	}
}
