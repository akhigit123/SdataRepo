package org.proj;

import org.proj.entity.EmployeEntity;
import org.proj.service.EmployeServicemgmnt;
import org.proj.service.EmployeServicemgmntImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
//load target bean
		EmployeServicemgmntImpl bean = ctx.getBean("empService", EmployeServicemgmntImpl.class);
		EmployeEntity entity = new EmployeEntity();
		try {
			// seting values to entity object
			//entity.setEmpid(1234);
			entity.setEmpname("akhila");
			entity.setDesg("javadev");
			entity.setDeptNo(33);
			entity.setCompany("tcs");
			// call service method
			String employeEnrollment = bean.EmployeEnrollment(entity);
			System.out.println(employeEnrollment);
			System.out.println(entity);
		}//try 
		catch (Exception e) {
			e.printStackTrace();
		}
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main

}//class
