package model;

import java.io.Serializable;

public class Car {
	private String make;
	private String model;
	private int regNo;
	private int millage;
	private int yearMan;

	public Car(String mk, String md, int regNo, int millage, int yearMan) {
		this.make = mk;
		this.model = md;
		this.regNo = regNo;
		this.millage = millage;
		this.yearMan = yearMan;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getMillage() {
		return millage;
	}
	
	public int getYearMan() {
		return yearMan;
	}
	
	public int getRegNo() {
		return regNo;
	}
	
	public String toString() {
		return "Make: " + make + " Model: " + model + " Registration Number: " + regNo + " Millage: " + millage + " Year of Manufacture: " + yearMan;
	}
}