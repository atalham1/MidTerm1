package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {
	
	public Course C1;
	public Course C2;
	public Course C3;
	public Semester S1;
	public Semester S2;
	public Section SC1;
	public Section SC2;
	public Section SC3;
	public Section SC4;
	public Section SC5;
	public Section SC6;
	public ArrayList<Course> CourseList = new ArrayList<Course>();
	public ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	public ArrayList<Section> SectionList = new ArrayList<Section>();
	
	
	@BeforeClass
	public void setup() {
		CourseList.add(C1);
		CourseList.add(C2);
		CourseList.add(C3);
		SemesterList.add(S1);
		SemesterList.add(S2);
		SectionList.add(SC1);
		SectionList.add(SC3);
		SectionList.add(SC3);
		SectionList.add(SC4);
		SectionList.add(SC5);
		SectionList.add(SC6);
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}