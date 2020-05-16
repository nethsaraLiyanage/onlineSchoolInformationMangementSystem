package com.model;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private String userName;
	private String password;
	private String cls;
	
	//constructor of student class
	public Student(int id, String name, String address, String userName, String password, String cls) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.userName = userName;
		this.password = password;
		this.cls = cls;
	}
	
	
	
	//getters of student class
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getCls() {
		return cls;
	}



	//to string of student class
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", userName=" + userName
				+ ", password=" + password + ", cls=" + cls + "]";
	}

	
	
	
}
