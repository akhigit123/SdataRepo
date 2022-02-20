package org.proj.repo;

import java.io.Serializable;
import java.util.List;

import org.proj.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity,Serializable>{
	//@Query("from EmployeEntity where empname=:emp ")
	//@Query("from org.proj.entity.EmployeEntity where empname=?1")
//	@Query("from EmployeEntity as ee where ee.empname=?1")
	@Query("select emp from EmployeEntity as emp where emp.empname=?1")
	
	public  List<EmployeEntity> searchbyEmpNameDetalis(String name);
	//public  List<EmployeEntity> searchbyEmpName(@Param("emp")String name);
	
}
