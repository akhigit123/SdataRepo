package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.beans.StudentDTO;
import com.nt.beans.StudentVo;
import com.nt.service.IStudentService;
import com.nt.service.StudentServiceMgntImpl;

@Controller("cont")
public class StudentController {
	@Autowired
	private StudentServiceMgntImpl service;
public List<StudentVo> fetchDetailsBycourse(String[] course)throws Exception{
	List<StudentVo> listvo=new ArrayList();
	//use service
	List<StudentDTO> listdto=service.getDetailsBycourse(course);
	listdto.forEach(dto->{
		StudentVo vo= new StudentVo();
		BeanUtils.copyProperties(dto, vo);
		//add to listvo obect
		listvo.add(vo);
	});
	return listvo;
}
}
