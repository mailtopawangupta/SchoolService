package com.springboot.schoolservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.schoolservice.modal.Teacher;

@RestController
public class TeacherController {

	@GetMapping("/teacher/{teacherId}")
	public Teacher getTeacherDetail(@PathVariable Integer teacherId) {
		Teacher t1 = new Teacher(1, "Pawan Gupta","Maths");
		Teacher t2 = new Teacher(2, "Priti Gupta","English");
		Map<Integer, Teacher> teacherMap = new HashMap<Integer, Teacher>();
		teacherMap.put(1, t1);
		teacherMap.put(2, t2);
		Teacher teacher = teacherMap.get(teacherId);
		return teacher;
	}
}
