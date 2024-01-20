package com.prog.Crud_App;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String address;

@Column(name="college_name")
private String CollegeName;
private String email;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, String address, String collegeName, String email) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	CollegeName = collegeName;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCollegeName() {
	return CollegeName;
}
public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", CollegeName=" + CollegeName + ", email="
			+ email + "]";
}

}
