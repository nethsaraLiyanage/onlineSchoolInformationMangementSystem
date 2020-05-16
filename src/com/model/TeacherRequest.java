 package com.model;

public class TeacherRequest {

	private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String status;
	private String qualification;
	
	//constructor of TeacherRequest class
	public TeacherRequest(int id, String name, String address, String contact, String email, String status,
			String qualification) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.status = status;
		this.qualification = qualification;
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


	public String getStatus() {
		return status;
	}


	public String getQualification() {
		return qualification;
	}

	//toString function of TeacherRequest class
	@Override
	public String toString() {
		return "TeacherRequest [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", email=" + email + ", status=" + status + ", qualification=" + qualification + "]";
	}


	
}
