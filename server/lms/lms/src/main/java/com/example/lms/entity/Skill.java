package com.example.lms.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Skill {
	@Id
	private Integer id;
	private String skillName;
	
	@ManyToMany
	private List<Package> packages = new ArrayList<Package>();	// skill_packages table --> shows values because we gave skill with package_id mapping values(since this table has the mapped by attribute)
	
	@OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
	private List<Topic> topics = new ArrayList<Topic>();  // so, through which table's attribute we are giving the mapping values for topic and skill, that should not have jsonignore
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public List<Package> getPackages() {
		return packages;
	}
	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	
}





// when you give topic id mapping values along with skill table values, then skill_topics table only will have the value; --> if vise-versa, topic_skill table will have the values

// mappedBy, cascade, jsonIgonre, input values by user --> all are independent 