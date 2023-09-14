package com.vision.binding;

import java.util.Arrays;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Student {

	private int sid;
	private String name;
	private String email;
	private long phno;
	private String gender;
	private String course;

	private String[] timings;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", email=" + email + ", phno=" + phno + ", gender=" + gender
				+ ", course=" + course + ", timings=" + Arrays.toString(timings) + "]";
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
	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
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

//	
	
	
}
