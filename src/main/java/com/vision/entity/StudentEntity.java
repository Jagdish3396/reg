package com.vision.entity;

import java.util.Arrays;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;

@Entity
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;
	@OrderColumn
	@ElementCollection
	@CollectionTable(name = "student_courseDatails", joinColumns = @JoinColumn(name = "sid"))
	private String[] timings;

	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", name=" + name + ", email=" + email + ", phno=" + phno + ", gender="
				+ gender + ", course=" + course + ", timings=" + Arrays.toString(timings) + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String[] getTimings() {
		return timings;
	}

	public void setTimings(String[] timings) {
		this.timings = timings;
	}

}
