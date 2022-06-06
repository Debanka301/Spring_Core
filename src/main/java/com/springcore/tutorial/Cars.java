package com.springcore.tutorial;

public class Cars {
	private Employee emp;
	private String carName;
	
	
	public Cars(Employee emp, String carName) {
		super();
		this.emp = emp;
		this.carName = carName;
	}


	@Override
	public String toString() {
		return "Cars [emp=" + emp + ", carName=" + carName + "]";
	}
	
	

}
