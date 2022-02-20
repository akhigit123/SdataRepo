package org.proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EmployeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empid;
	@Column
	private String empname;
	@Column
	private String desg;
	@Column
	private String company;
	@Column
	private Integer deptNo;
}
