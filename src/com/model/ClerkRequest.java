package com.model;

public class ClerkRequest {

	private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String status;
	private String level;
	
	
	//constructor of ClerkRequest class
	public ClerkRequest(int id, String name, String address, String contact, String email, String status,
			String level) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.status = status;
		this.level = level;
	}




	//getters of ClerkRequest class
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


	public String getLevel() {
		return level;
	}


	//toString function of ClerkRequest class
	@Override
	public String toString() {
		return "ClerkRequest [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ ", email=" + email + ", status=" + status + ", level=" + level + "]";
	}
	
}
