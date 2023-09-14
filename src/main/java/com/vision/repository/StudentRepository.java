package com.vision.repository;

import org.springframework.data.repository.CrudRepository;

import com.vision.entity.StudentEntity;

public interface StudentRepository extends CrudRepository<StudentEntity, Integer>{


}
