package com.wissen.studentassignment.model;

public class Student {
	private int rollNo;
	private String name;
	private int standard;
	private String school;
	private int percentage;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", standard=" + standard + ", school=" + school
				+ ", percentage=" + percentage + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getRollNo()==((Student)obj).getRollNo();
	}
}
