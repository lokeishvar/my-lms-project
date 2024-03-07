package com.example.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lms.entity.Skill;
import com.example.lms.entity.Topic;
import com.example.lms.repository.SkillRepository;

@Service
public class SkillService {

	@Autowired
	private SkillRepository skillRepository;
	
	public Skill save(Skill skill) {
		for(Topic topic: skill.getTopics()) {		// topic entity should have skill attribute with jsonignore
			topic.setSkill(skill);
		}
		return skillRepository.save(skill);
	}
	
	public Iterable<Skill> readall() {
		return skillRepository.findAll();
	}
	
	public Skill readById(Integer id) {
		return skillRepository.findById(id).get();
	}
	
	public Integer deleteById(Integer id) {
		skillRepository.deleteById(id);
		return id;
	}
	
}
