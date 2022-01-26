package com.nt;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.beans.Student;

@SpringBootApplication
public class Application {
	

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		// load target bean
		Student st=ctx.getBean("stud",Student.class);
		st.examPreparing("javaExam");
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
