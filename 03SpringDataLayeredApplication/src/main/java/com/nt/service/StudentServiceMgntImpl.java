package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.beans.StudentBO;
import com.nt.beans.StudentDTO;
import com.nt.dao.IStudentDao;
import com.nt.dao.StudentDaoimpl;

@Service("stservice")
public class StudentServiceMgntImpl {
	@Autowired
	private StudentDaoimpl dao;

	public List<StudentDTO> getDetailsBycourse(String[] courses) throws Exception {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < courses.length; i++) {
			if (i == courses.length - 1)
				buffer.append("'" + courses[i] + "')");
			else
				buffer.append("'" + courses[i] + "',");
		}//for
		String cond=buffer.toString();
		
		List<StudentBO> listbo=dao.getdetailsByCourse(cond);
		//copying listbo objects to listDto obj
		List<StudentDTO> listdto= new ArrayList();
		listbo.forEach(bo->{
			StudentDTO dto =new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		return listdto;
	}
}
