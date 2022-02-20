package org.proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employe11")
@AllArgsConstructor
@NoArgsConstructor
public class EmployeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empid;
	@Column(length = 15)
	private String empname;
	@Column(length = 10)
	private String desg;
	@Column(length = 10)
	private String company;
	@Column
	private Integer deptNo;
}
