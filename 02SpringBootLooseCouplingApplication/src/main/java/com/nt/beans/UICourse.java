package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ui")
@Primary
public class UICourse implements ICourseMaterial {
public UICourse() {
	System.out.println("UICourse.UICourse():0-param");
}
	@Override
	public String courseContent() {
		System.out.println("UICourse.courseContent():method");
		String coreContent="html,css,javascript";
		return coreContent;
	}

	@Override
	public float cost() {
		System.out.println("UICourse.cost():method");
		return 1600;
	}
	

}
