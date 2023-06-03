package com.fusion.institute.core.java;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String fName;
	private String lName;
	private String mobNumber;
	private int birthYear;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param empId
	 * @param fName
	 * @param lName
	 * @param mobNumber
	 */
	public Employee(int empId, String fName, String lName, String mobNumber,int year) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.mobNumber = mobNumber;
		this.birthYear = year;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", mobNumber=" + mobNumber + "BirthYear= "+birthYear+"]";
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(this.birthYear == emp.birthYear) {
			return 0;
		}else if(this.birthYear > emp.birthYear) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
}
