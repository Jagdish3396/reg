package com.vision.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genders {
	@Id
	private int genderId;
	private String genderName;
	public int getGenderId() {
		return genderId;
	}
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}
	public String getGenderName() {
		return genderName;
	}
	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	@Override
	public String toString() {
		return "Genders [genderId=" + genderId + ", genderName=" + genderName + "]";
	}
	

}
