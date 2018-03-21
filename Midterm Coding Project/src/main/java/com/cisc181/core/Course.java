package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.*;

public class Course {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public UUID getCourseID(){
	    return this.CourseID;
	    }
	
	public Course(String CourseName, int GradePoints, eMajor Major) {
		this.GradePoints = GradePoints;
		this.CourseName = CourseName;
		this.CourseID = UUID.randomUUID();
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	}
	

}
