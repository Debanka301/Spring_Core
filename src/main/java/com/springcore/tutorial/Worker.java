package com.springcore.tutorial;

public class Worker {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Worker(Address address) {
		super();
		this.address = address;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Worker [address=" + address + "]";
	}
	
	public void showAddress() {
		System.out.println("City:- "+address.getCity()+" District:- "+address.getDistrict());
	}

}
