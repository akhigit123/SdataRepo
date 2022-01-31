package com.nt.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.beans.StudentBO;

@Repository("stdao")
public class StudentDaoimpl implements IStudentDao {
	@Autowired
	private DataSource ds;
	private static final String GET_DETAILS_STUDENT = "SELECT SID ,SNAME,COURSE,GENDER FROM STUDENT22 WHERE COURSE IN ( ";

	@Override
	public List<StudentBO> getdetailsByCourse(String cond) throws Exception {
		List<StudentBO> listbo = null;
		StudentBO bo = null;
		ResultSet rs = null;
		Connection con = null;
		java.sql.Statement st = null;
		try {

			System.out.println("ds class" + ds.getClass());
			// get connection
			con = ds.getConnection();
			// get statement object
			st = con.createStatement();
			rs = st.executeQuery(GET_DETAILS_STUDENT + cond + "ORDER BY COURSE");
			listbo = new ArrayList();
			while (rs.next()) {
				bo = new StudentBO();
				bo.setSid(rs.getInt(1));
				bo.setSname(rs.getString(2));
				bo.setCourse(rs.getString(3));
				bo.setGender(rs.getString(4));
				// add bo object to list
				listbo.add(bo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (st!= null)
					st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (con!= null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//finally
		return listbo;
	}// method

}// class
