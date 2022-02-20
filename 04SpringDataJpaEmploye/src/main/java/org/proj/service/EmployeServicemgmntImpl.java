package org.proj.service;

import org.proj.entity.EmployeEntity;
import org.proj.repo.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeServicemgmntImpl implements EmployeServicemgmnt {
	@Autowired
	private EmployeRepository repo;

	@Override
	public String EmployeEnrollment(EmployeEntity entity) {
		// TODO Auto-generated method stub
		EmployeEntity entityres = repo.save(entity);
		if (entityres != null)
			return "employe enrolled successfully";
		else
			return " employe is not enrolled";

	}

}
