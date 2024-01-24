package com.example.hr;

public class Employee {
	String name;
	int id;
	double salary;
	
	public void printName(String name) {
		this.name = name;
		System.out.println("employee name : " + name);
		
		
	}public void printSalary(double salary) {
		this.salary = salary;
		System.out.println("employee salary : " + salary);
		
	}

	
	

}
