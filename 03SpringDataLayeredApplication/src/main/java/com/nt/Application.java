package com.nt;

import java.io.Closeable;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.StudentVo;
import com.nt.controller.StudentController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// reading inputs
		Scanner scn = new Scanner(System.in);
		System.out.println("enter course count");
		int count = scn.nextInt();
		String[] courses = null;
		if (count >= 1) {
			courses = new String[count];
		} else {
			System.out.println("invalid count number");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println("enter ur course" + (i + 1));
			String course = scn.next();
			courses[i] = course;
		} // for
		System.out.println(count);
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		// load target bean
		StudentController controller = ctx.getBean("cont", StudentController.class);
		try {
			List<StudentVo> listvo = controller.fetchDetailsBycourse(courses);
			System.out.println("student list having courses" + Arrays.toString(courses));
			listvo.forEach(vo -> {
				System.out.println(vo);
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("something went wrong...try again" + e.getMessage());
		}
		// close ioc container
		((ConfigurableApplicationContext) ctx).close();
	}// main method

}// class
