package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int id = sc.nextInt();
		double salary = sc.nextDouble();
		
		Employee obj = new Employee();
		obj.printName(name);
		obj.printSalary(salary);
		
		
	}

}
