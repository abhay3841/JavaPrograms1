package com.fusion.institute.core.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JdbcRunner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Console Menu
		System.out.println("******************* Welome to Employee Registration System******************");
		int input = 9;
		JdbcRunner runner = new JdbcRunner();
		Scanner sc = new Scanner(System.in);

		// System.out.println("1.show all registerd employees\n2.Register
		// Employee\n3.Update Employee\n4.Remove Employee");
		// input = sc.nextInt();

		while (input != 0) {
			System.out.println("Please enter any numbers from below: \n");
			System.out.println(
					"1.show all registerd employees\n2.Register Employee\n3.Update Employee\n4.Remove Employee\n0.Exit");
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println(runner.getAllEmployees());
				break;
			case 2:
				System.out.println(runner.addEmployee(runner.getEmpFromUser()));
				break;
			case 3:
				System.out.println("Please enter employee id to update :");
				int empid = sc.nextInt();
				Employee empToUpdate = runner.getEmpFromUser();
				empToUpdate.setEmpId(empid);
				System.out.println(runner.updateEmployee(empToUpdate));
				break;
			case 4:
				System.out.println("Please enter emp id to delete: ");
				System.out.println(runner.deleteEmployee(sc.nextInt()));
				break;
			case 0:
				System.out.println("Terminated!!");
				System.exit(0);
				break;
			default:
				input = 0;
				break;

			}

		}
	}

	private String deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		String result = "deletion failed";
		boolean isEmpExist = false;
		List<Employee> existingEmpList = getAllEmployees();
		for (Employee employee : existingEmpList) {
			if (employee.getEmpId() == empid) {
				isEmpExist = true;
			}
		}
		if (isEmpExist) {
			String deleteEmpQuery = "DELETE FROM EMPLOYEE WHERE EMPID=" + empid;
			Connection conn;
			try {
				conn = JDBCUtility.getConnection();
				Statement stmt = conn.createStatement();
				stmt.execute(deleteEmpQuery);
				result = "employee deleted";
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			result = "Employee with id: " + empid + " does not exist!!";
		}
		return result;
	}

	private String updateEmployee(Employee emp) {
		boolean isEmpExist = false;
		String result = "Update failed!!";
		// check if employee exist
		List<Employee> existingEmpList = getAllEmployees();
		for (Employee employee : existingEmpList) {
			if (employee.getEmpId() == emp.getEmpId()) {
				isEmpExist = true;
			}
		}

		if (isEmpExist) {
			String updateEmpQuery = "UPDATE EMPLOYEE SET FNAME='" + emp.getfName() + "',LNAME='" + emp.getlName()
					+ "',MOBNUMBER='" + emp.getMobNumber() + "'";
			Connection conn;
			try {
				conn = JDBCUtility.getConnection();
				Statement stmt = conn.createStatement();
				stmt.execute(updateEmpQuery);
				result = "Employee Updated";
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return result;
			}
		} else {
			result = "Employee not found";
		}
		return result;
	}

	private String addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String addEmpQuery = "INSERT INTO EMPLOYEE(FNAME,LNAME,MOBNUMBER) VALUES('" + emp.getfName() + "','"
				+ emp.getlName() + "','" + emp.getMobNumber() + "')";
		Connection conn;
		try {
			conn = JDBCUtility.getConnection();
			Statement stmt = conn.createStatement();
			stmt.execute(addEmpQuery);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee added";
	}

	private Employee getEmpFromUser() {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter First Name: ");
		emp.setfName(sc.next());
		System.out.println("Please enter Second Name: ");
		emp.setlName(sc.next());
		System.out.println("Please enter Mobile number: ");
		emp.setMobNumber(sc.next());

		return emp;
	}

	private List<Employee> getAllEmployees() {
		String addEmpQuery = "SELECT * FROM EMPLOYEE";
		Connection conn;
		List<Employee> empList = new ArrayList<>();
		try {
			conn = JDBCUtility.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(addEmpQuery);

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("EMPID"));
				emp.setfName(rs.getString("FNAME"));
				emp.setlName(rs.getString("LNAME"));
				emp.setMobNumber(rs.getString("MOBNUMBER"));
				empList.add(emp);

			}
			
			return empList;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;

	}

}
