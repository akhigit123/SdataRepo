package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dot")
public class DotNetCourse implements ICourseMaterial {
public DotNetCourse() {
	System.out.println("DotNetCourse.DotNetCourse():0-param");
}
	@Override
	public String courseContent() {
		System.out.println("DotNetCourse.courseContent():method");
		String coreContent="oops,stringhandling,collections,object";
		return coreContent;
	}

	@Override
	public float cost() {
		System.out.println("DotNetCourse.cost():method");
		return 1000;
	}
	

}
