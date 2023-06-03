package com.fusion.institute.core.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProgramRunner {
	//used as local storage
	private static List<Employee> employeeStrorage = new ArrayList<>();
//	static {
//		Collections.synchronizedList(employeeStrorage);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Console Menu
		System.out.println("******************* Welome to Employee Registration System******************");
		int input = 9;
		ProgramRunner runner = new ProgramRunner();
		Scanner sc = new Scanner(System.in);

		// System.out.println("1.show all registerd employees\n2.Register
		// Employee\n3.Update Employee\n4.Remove Employee");
		// input = sc.nextInt();

		while (input != 0) {
			System.out.println("\n\n\nPlease enter any numbers from below: \n");
			System.out.println(
					"1.show all registerd employees\n2.Register Employee\n3.Update Employee\n4.Remove Employee\n0.exit");
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println(runner.getAllEmployees());
				break;
			case 2:
				System.out.println(runner.addEmployee(runner.getEmpFromUser()));
				break;
			case 3:
				System.out.println(runner.updateEmployee(runner.getEmpFromUser()));
				break;
			case 4:
				System.out.println("Please enter emp id to delete: ");
				System.out.println(runner.deleteEmployee(sc.nextInt()));
				break;
			case 0:
				System.exit(0);
				break;
			default:
				input = 0;
				break;

			}

		}

	}

	public List<Employee> getAllEmployees() {

		return this.employeeStrorage;
	}

	public String addEmployee(Employee emp) {

		if (this.employeeStrorage.add(emp)) {
			return "success";
		}
		return "failure";
	}

	public String deleteEmployee(int empid) {
		String result = "Employee deletion failed"; 
		Employee emp= null;
		for (Employee employee : employeeStrorage) {
			if (employee.getEmpId() == empid) {
				emp = employee;
			}
		}
		if(null != emp) {
			employeeStrorage.remove(emp);
			result = "deleted employee with emp id :" + empid;
		}else {
			result = "Employee not found";
		}
		
		return result;

	}

	public String updateEmployee(Employee emp) {
		String result = "Updating employee failed";
		// check if emp exists with provided emp id
		for (Employee employee : employeeStrorage) {
			if (employee.getEmpId() == emp.getEmpId()) {
				employee.setfName(emp.getfName());
				employee.setlName(emp.getlName());
				employee.setMobNumber(emp.getMobNumber());
				result = "Employee updated!!!";
			} else {
				result = "Employee not found in Database";
			}
		}
		return result;

	}

	public Employee getEmpFromUser() {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter emp id: ");
		emp.setEmpId(sc.nextInt());
		
		System.out.println("Please enter First Name: ");
		emp.setfName(sc.next());
		
		System.out.println("Please enter Second Name: ");
		emp.setlName(sc.next());
		
		System.out.println("Please enter Mobile number: ");
		emp.setMobNumber(sc.next());

		return emp;
	}

}
