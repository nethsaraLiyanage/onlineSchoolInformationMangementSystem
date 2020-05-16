package com.model;

public class Teacher {

	private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String userName;
	private String password;
	private String status;
	private String qualification;
	private String timetable;
	private String subject;
	
	//constructor of Teacher class
	public Teacher(int id, String name, String address, String contact, String email, String userName, String password,
			String status, String qualification, String timetable, String subject) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.qualification = qualification;
		this.timetable = timetable;
		this.subject = subject;
	}


	//getters of attributes
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	public String getContact() {
		return contact;
	}


	public String getEmail() {
		return email;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}


	public String getStatus() {
		return status;
	}


	public String getQualification() {
		return qualification;
	}


	public String getTimetable() {
		return timetable;
	}


	public String getSubject() {
		return subject;
	}


	//toString function of Teacher class
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", email="
				+ email + ", userName=" + userName + ", password=" + password + ", status=" + status
				+ ", qualification=" + qualification + ", timetable=" + timetable + ", subject=" + subject + "]";
	}


	
}
