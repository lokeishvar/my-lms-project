package com.example.lms.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Package {
	
	@Id
	private Integer id;
	private String packageName;
	private Integer packageFees;
	private String packageDuration;
	private Integer packageHours;
	
	@ManyToMany(mappedBy = "packages")  // package_skills table --> not needed, so, we told it is mapped by skills table's packages attribute; --> skill_packages;
	@JsonIgnore
	private List<Skill> skills = new ArrayList<Skill>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public Integer getPackageFees() {
		return packageFees;
	}
	public void setPackageFees(Integer packageFees) {
		this.packageFees = packageFees;
	}
	public String getPackageDuration() {
		return packageDuration;
	}
	public void setPackageDuration(String packageDuration) {
		this.packageDuration = packageDuration;
	}
	public Integer getPackageHours() {
		return packageHours;
	}
	public void setPackageHours(Integer packageHours) {
		this.packageHours = packageHours;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
	
	
}
