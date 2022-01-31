package com.nt.dao;

import java.util.List;

import com.nt.beans.StudentBO;

public interface IStudentDao {
public List<StudentBO> getdetailsByCourse(String cond)throws Exception;
}
