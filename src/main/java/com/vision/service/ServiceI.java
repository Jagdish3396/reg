package com.vision.service;

import java.util.List;

import com.vision.binding.Student;
import com.vision.entity.Courses;
import com.vision.entity.Genders;
import com.vision.entity.Timings;

public interface ServiceI {
	
	public List<String> getGenderDetails();
	public List<String> getCoursesDetails();
	public List<String> getTimingDetails();
	public boolean saveStudent(Student student);
	

}
