package com.amit.model;


public class Student {
	private int id;
	private String nameString;
	private String city;
	
	public Student()
	{
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + ", city=" + city + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(int id, String nameString, String city) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.city = city;
	}

}
