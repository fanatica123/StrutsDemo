package com.hqyj.action;

import com.hqyj.bean.Student;
import com.hqyj.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudentAction extends ActionSupport implements ModelDriven<Student>{

	private Student stu ;
	public Student getModel() {
		if(stu==null){
			stu = new Student();
		}
		return stu;
	}	
	
	public String preAdd(){
		return "preAdd";
	}
	
	public String addStudent(){
		return SUCCESS;
	}
}
