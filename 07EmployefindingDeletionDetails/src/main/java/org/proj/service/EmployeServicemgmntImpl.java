package org.proj.service;

import java.io.Serializable;
import java.util.Iterator;

import java.util.List;
import java.util.Optional;

import org.proj.entity.EmployeEntity;
import org.proj.repo.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeServicemgmntImpl {
	@Autowired
private EmployeRepository emprepo;
	
	public String savingEmp(EmployeEntity emp) {
		EmployeEntity save = emprepo.save(emp);
		if(save!=null)
			return "saved object";
		else 
			return "not saved object";
	}
	public String deletionById(int id) {
		Optional<EmployeEntity> opt=emprepo.findById(id);
		if(opt.isPresent()) {
		
		emprepo.deleteById(id);
		return "record deleted"+id;
		}
		else
			return "record not found for deletion";
		
	}
		

public String deletionByallId(Iterable<Serializable> ids) {
	Iterable<EmployeEntity> findAllById = emprepo.findAllById(ids);
	
	if(((List)findAllById).size()==((List)ids).size() ) {
		emprepo.deleteAllById(ids);
	return "record deleted"+ids;
	}
	else
		return "record not found for deletion";
	
}
public String deleteByObjectId(EmployeEntity emp) {
	Optional<EmployeEntity> opt=emprepo.findById(emp.getEmpid());
	if(opt.isPresent()) {
	emprepo.delete(emp);
	return "record pointing object is delted";
	}
	else
		return "record is not found";
}
public String deletionAllObjects() {
	long count=emprepo.count();
	if(count!=0)
	emprepo.deleteAll();
	return "all object records are deleted";
	
}
public List<EmployeEntity> fetchAllDetails(String name){
//return 	emprepo.searchbyEmpName(name);
return emprepo.searchbyEmpNameDetalis(name);
}
	}



