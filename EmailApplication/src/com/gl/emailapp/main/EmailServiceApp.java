package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.service.EmailCredentailServiceImpl;
import com.gl.emailapp.service.EmailCredentialService;

public class EmailServiceApp {

	public static void main(String[] args) {
		
		EmailCredentialService service = new EmailCredentailServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Name");
		String fn = sc.next();
		System.out.println("Ener your Last Name");
		String ln = sc.next();
		Employee employee = new Employee(fn,ln);
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		String department = "";
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			department = "tech";
			break;
		
		case 2:
			department = "admin";
			break;
			
		case 3:
			department = "hr";
			break;
			
		case 4:
			department = "legal";
			break;

		default:
			System.out.println("Please enter valid option");
			break;
		}
		
//		System.out.println(emp.getFirstName());
//		System.out.println(emp.getLastName());
//		System.out.println(department);
		
		String generatedPassword = service.generatePassword();
		String generatedEmail = service.generateEmailAddress(employee, department);
		service.showCredentials(employee, department);
		sc.close();
		
		
		
		
	}

}
