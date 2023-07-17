package com.collection;

public class Student {
	private int rollNo;
	private int std;
	private char div;
	
	public Student(int rollNo, int std, char div) {
		super();
		this.rollNo = rollNo;
		this.std = std;
		this.div = div;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", std=" + std + ", div=" + div + "]";
	}
	
	
	
}
