package com.vision.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vision.binding.Student;
import com.vision.entity.Courses;
import com.vision.entity.Genders;
import com.vision.entity.StudentEntity;
import com.vision.entity.Timings;
import com.vision.repository.CoursesRepo;
import com.vision.repository.GenderRepo;
import com.vision.repository.StudentRepository;
import com.vision.repository.TimingRepo;

@Service
public class ServiceImpl implements ServiceI {

	private GenderRepo genderRepo;
	private CoursesRepo coursesRepo;
	private TimingRepo timingRepo;
	private StudentRepository studentRepo;

	@Autowired
	public ServiceImpl(GenderRepo genderRepo, CoursesRepo coursesRepo, TimingRepo timingRepo,
			StudentRepository studentRepo) {
		super();
		this.genderRepo = genderRepo;
		this.coursesRepo = coursesRepo;
		this.timingRepo = timingRepo;
		this.studentRepo = studentRepo;
	}

	@Override
	public List<String> getGenderDetails() {
		List<Genders> genderList = (List<Genders>) genderRepo.findAll();
		List<String> genders = new ArrayList<String>();

		for (Genders G : genderList) {
			genders.add(G.getGenderName());

		}

		return genders;
	}

	@Override
	public List<String> getCoursesDetails() {
		List<Courses> coursesList = (List<Courses>) coursesRepo.findAll();
		List<String> courses = new ArrayList<>();
		for (Courses c : coursesList) {
			courses.add(c.getCourseName());
		}
		return courses;
	}

	@Override
	public List<String> getTimingDetails() {
		List<Timings> timingList = (List<Timings>) timingRepo.findAll();
		List<String> timings = new ArrayList<>();
		for (Timings t : timingList) {
			timings.add(t.getTimingName());
		}

		return timings;
	}

	@Override
	public boolean saveStudent(Student student) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(student.getName());
		studentEntity.setEmail(student.getEmail());
		studentEntity.setPhno(student.getPhno());
		studentEntity.setGender(student.getGender());
		studentEntity.setCourse(student.getCourse());
		studentEntity.setTimings(student.getTimings());
		StudentEntity entity = studentRepo.save(studentEntity);
		return entity !=null && entity.getSid() !=0;
	}

}
