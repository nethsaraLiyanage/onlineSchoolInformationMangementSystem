package com.model;

public class Clerk {

	private int id;
	private String name;
	private String address;
	private String contact;
	private String email;
	private String userName;
	private String password;
	private String status;
	private String level;
	
	//constructor of clerk class
	public Clerk(int id, String name, String address, String contact, String email, String userName, String password,
			String status, String level) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.level = level;
	}

	//getters of clerk class
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

	public String getLevel() {
		return level;
	}

	//to string of clerk class
	@Override
	public String toString() {
		return "Clerk [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", email="
				+ email + ", userName=" + userName + ", password=" + password + ", status=" + status + ", level="
				+ level + "]";
	}
	
	
	
}
