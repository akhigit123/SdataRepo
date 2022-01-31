package com.nt.service;

import java.util.List;

import com.nt.beans.StudentDTO;

public interface IStudentService {
public List<StudentDTO> getDetailsBycourse(String[] courses)throws Exception;
}
