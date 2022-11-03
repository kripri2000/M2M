package com.Jpa.M2M.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.JoinColumn;

@Entity
@Table(name="Student_tab")
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private int age;
	private String dept;
	private String name;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="student_course_table",
	joinColumns = {
			@JoinColumn(name="student_id",referencedColumnName="id"
						)},
	inverseJoinColumns = {
			@JoinColumn(name="course_id",referencedColumnName="id"
					)})
	@JsonManagedReference
	private Set<Courses> courses;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
