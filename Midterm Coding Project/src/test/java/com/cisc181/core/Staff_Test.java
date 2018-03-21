package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	private static final Date Date1 = new Date(1980, 10, 20);
	private static final Date Date2 = new Date(1880, 5, 14);

	private static Staff Staff1 = new Staff("Bob","J","Smith", Date1,"Address 1", "123-321-4123", "staff1@gmail.com", "T TH 1-2", 1, 80000, Date1, eTitle.MR);
	private static Staff Staff2 = new Staff("Bob","J","Smith", Date2,"Address 1", "123-321-4123", "staff2@gmail.com", "T TH 1-2", 1, 100000, Date1, eTitle.MR);
	private static Staff Staff3 = new Staff("Bob","J","Smith", Date1,"Address 1", "688-123-0192", "staff3@gmail.com", "T TH 1-2", 1, 75000, Date1, eTitle.MR);
	private static Staff Staff4 = new Staff("Bob","J","Smith", Date1,"Address 1", "123-321-4123", "staff4@gmail.com", "T TH 1-2", 1, 50000, Date1, eTitle.MR);
	private static Staff Staff5 = new Staff("Bob","J","Smith", Date1,"Address 1", "123-321-4123", "staff5@gmail.com", "T TH 1-2", 1, 110000, Date1, eTitle.MR);
	
	private static ArrayList<Staff> staffList = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		staffList.add(Staff1);
		staffList.add(Staff2);
		staffList.add(Staff3);
		staffList.add(Staff4);
		staffList.add(Staff5);
	}
	
	public double getAvg(ArrayList<Staff> staffList) {
		double total = 0;
		for (int i = 0; i < staffList.size(); i++) {
			total += staffList.get(i).getSalary();
		}
		return total / staffList.size();
	}
	
	@Test
	public void test() {
		assertTrue(82999.9 <= getAvg(staffList) && getAvg(staffList) <= 83000.1);
		
		
	}	
	

}
