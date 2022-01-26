package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	@Autowired
	@Qualifier(value = "ui")
	private ICourseMaterial material;

	public Student() {
		System.out.println("student 0-param constructor");
		
	}
	public void examPreparing(String examname) {
		System.out.println("examination name"+examname);
		String courseContent=material.courseContent();
		float price=material.cost();
		System.out.println("exam course content is::\t"+courseContent);
		System.out.println("exam course price is::\t"+price);
	}
}
