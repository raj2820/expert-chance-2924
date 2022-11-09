package com.masai.dao;

import java.util.List;

import com.masai.exception.AdminException;
import com.masai.exception.CourseException;
import com.masai.model.Admin;
import com.masai.model.AdminStudentCourseDTO;

public interface AdminDao {
	
	
	public String registerAdmin(Admin admin) throws AdminException ;
	public Admin adminSignin(String username , String password) throws AdminException;
	public List<AdminStudentCourseDTO> getAllStudentsByCourseName(String cname)throws CourseException;
	
	
	
	
	
}
