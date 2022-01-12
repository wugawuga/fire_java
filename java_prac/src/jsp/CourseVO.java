package com.wuga.vo;

public class CourseVO {
	
	private String id;
	private String name;
	private int credit;
	private int lecturer;
	private int week;
	private int start_hour;
	private int end_hour;
	
	private char[] yoil = {'일','월','화','수','목','금','토'};
	
	private String l_name;
	
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getLecturer() {
		return lecturer;
	}
	public void setLecturer(int lecturer) {
		this.lecturer = lecturer;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getStart_hour() {
		return start_hour;
	}
	public void setStart_hour(int start_hour) {
		this.start_hour = start_hour;
	}
	public int getEnd_hour() {
		return end_hour;
	}
	public void setEnd_hour(int end_hour) {
		this.end_hour = end_hour;
	}
	public char getYoil() {
		return yoil[week];
	}
	public void setYoil(int week) {
		this.yoil[week] = yoil[week];
	}
	
}
