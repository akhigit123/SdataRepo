package org.proj;

import java.util.List;

import org.proj.entity.EmployeEntity;
import org.proj.service.EmployeServicemgmntImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		EmployeServicemgmntImpl bean = ctx.getBean("empService", EmployeServicemgmntImpl.class);
		EmployeEntity emp = new EmployeEntity(null, "tausief", "dev", "dell", 24);
		try {
			// System.out.println(bean.savingEmp(emp));
			// System.out.println(bean.deletionByallId(List.of(49,50,51)));
			// System.out.println(bean.deleteByObjectId(emp));
			// System.out.println(bean.deletionAllObjects());
			// System.out.println(bean.fetchAllDetails("akhila"));
			System.out.println(bean.fetchAllDetails("akhila"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
