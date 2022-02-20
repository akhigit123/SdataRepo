package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaCourse implements ICourseMaterial {
public JavaCourse() {
	System.out.println("JavaCourse.JavaCourse():0-param ");
}
	@Override
	public String courseContent() {
		System.out.println("JavaCourse.courseContent():method");
		String coreContent="oops,stringhandling,collections,object";
		return coreContent;
	}

	@Override
	public float cost() {
		System.out.println("JavaCourse.cost():method");
		return 1200;
	}
	

}
