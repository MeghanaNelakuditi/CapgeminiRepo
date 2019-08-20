package com.cg.employee.dto;

public class Address {
	
	private String doorNo;
	private String city;
	private String state;
	private Integer pincode;
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public Address(String doorNo, String city, String state, Integer pincode) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	

}
