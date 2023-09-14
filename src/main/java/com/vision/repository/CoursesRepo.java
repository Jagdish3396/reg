package com.vision.repository;

import org.springframework.data.repository.CrudRepository;

import com.vision.entity.Courses;

public interface CoursesRepo extends CrudRepository<Courses, Integer> {
	

}
