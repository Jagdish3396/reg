package com.vision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vision.binding.Student;
import com.vision.entity.Courses;
import com.vision.entity.Genders;
import com.vision.entity.Timings;
import com.vision.service.ServiceI;

@Controller
public class RegistrationController {

	private ServiceI serviceI;

	@Autowired
	public RegistrationController(ServiceI serviceI) {
		super();
		this.serviceI = serviceI;
	}

	@GetMapping("/getAllData")
	public String getAllFormData(Model model) {
		List<String> courses = serviceI.getCoursesDetails();
		// System.out.println(list);
		List<String> genders = serviceI.getGenderDetails();
		// System.out.println(list2);
		List<String> timings = serviceI.getTimingDetails();
		// System.out.println(list3);
		model.addAttribute("courses", courses);
		model.addAttribute("genders", genders);
		model.addAttribute("timings", timings);

		model.addAttribute("student", new Student());

		return "studentReg";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(Student student) {
		System.out.println(student);
		boolean b = serviceI.saveStudent(student);
		
		
		return null;
		
	}

}
