package com.kodnest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int sid;
	String sname;      //Same as Database column name present in table
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Student(String sname, int sid) {
		super();
		this.sname = sname;
		this.sid = sid;
	}
	public Student() {
		super();
	}
	

}
