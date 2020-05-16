package com.model;

public class Subject {

	private int id;
	private String name;
	private String grade;
	private String periods;
	
	//constructor of Subject class
	public Subject(int id, String name, String grade, String periods) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.periods = periods;
	}


	//getters of subject class
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public String getPeriods() {
		return periods;
	}


	//to string of subject class
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", grade=" + grade + ", periods=" + periods + "]";
	}
	
	
	
}
