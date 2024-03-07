package com.example.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lms.entity.Topic;
import com.example.lms.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public Topic save(Topic topic) {
		return topicRepository.save(topic);
	}
	
	public Iterable<Topic> readall() {
		return topicRepository.findAll();
	}
	
	public Topic readById(Integer id) {
		return topicRepository.findById(id).get();
	}
	
	public Integer deleteById(Integer id) {
		topicRepository.deleteById(id);
		return id;
	}
	
}
