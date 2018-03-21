package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	public Section(UUID courseID, UUID semesterID, int roomID) {
		super();
		this.CourseID = courseID;
		this.SemesterID = semesterID;
		this.RoomID = roomID;
		this.SectionID = UUID.randomUUID();
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
	

}
