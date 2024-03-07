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

import com.example.lms.entity.Topic;
import com.example.lms.service.TopicService;

@RestController
@RequestMapping("topic")
@CrossOrigin
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@PostMapping("post")
	public Topic save(@RequestBody Topic topic) {
		return topicService.save(topic);
	}
	
	@GetMapping("getall")
	public Iterable<Topic> readall() {
		return topicService.readall();
	}
	
	@GetMapping("getById/{id}")
	public Topic readById(@PathVariable Integer id) {
		return topicService.readById(id);
	}
	
	@DeleteMapping("deleteById/{id}")
	public String deleteById(@PathVariable Integer id) {
		topicService.deleteById(id);
		return "Topic with id " + id + " got deleted.";
	}
}
