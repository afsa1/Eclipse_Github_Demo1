package com.lti.com;

public class Employee {

	private int empId;
	private String nameName;
	private double empsal;
	public Employee(int empId, String nameName, double empsal) {
		super();
		this.empId = empId;
		this.nameName = nameName;
		this.empsal = empsal;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getNameName() {
		return nameName;
	}
	public void setNameName(String nameName) {
		this.nameName = nameName;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", nameName=" + nameName + ", empsal=" + empsal + "]";
	}
	
	
}
