package view;

import java.util.Scanner;

import controller.maincontroller;
import services.Teacher;

public class view {
	
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		maincontroller controller;
		Teacher teacher;
		
		System.out.println("------ WELCOME TO TEJUCO COLLEGE ------");
		System.out.println("Choose which to manage: [1] Teacher ; [2] Student");
		
		System.out.print("Input number: ");
		int answer = sc.nextInt();
		System.out.println(" ");
		
		switch(answer) {
			
		case 1:
			teachermenu();
			break;
			
		case 2:
			studentmenu();
			break;
		}
		
	}
	
	
	
	public static void teachermenu() {
		System.out.println("---- TEACHER MENU ----");
		System.out.println("[1] Add new Teacher");
		System.out.println("[2] Update Teacher");
		System.out.println("[3] Delete Teacher");
		System.out.println("[4] Calculate Salary of a Teacher");
		System.out.println("[5] Show all Teachers");
		System.out.print("Input which number: ");
		int tAns = sc.nextInt();
		System.out.println(" ");
		
		switch (tAns) {
		case 1:
			System.out.print("ID: ");
			int count=0;
			int ID = count++;
			System.out.println(count++);
			System.out.print("First Name: ");
			String fname = sc2.nextLine();
			System.out.print("Last Name: ");
			String lname = sc2.nextLine();
			System.out.print("Gender(Female/Male): ");
			String gender1 = sc2.nextLine();
			System.out.print("Phone Number: ");
			String phonenum = sc2.nextLine();
			System.out.print("Address: ");
			String address1 = sc2.nextLine();
			System.out.println("Designation [HOF/CO/L]: ");
			String designation = sc2.nextLine();
			System.out.println(" ");
			
			
			try {
				maincontroller.addDetails(ID, fname, lname, gender1, phonenum, address1, designation);
				}
				catch(Exception e) {
					System.out.println(" ");
				  System.out.println("Something went wrong! try again.");
				  System.out.println(" ");
				  teachermenu();
				}
			
			System.out.println("--- Teacher Successfully Registered! ---");
			System.out.println(" ");
			teachermenu();
			
			break;
		
		case 2:
			
		case 5:
			maincontroller.viewallTeachers();
			
			
			
		break;
			
			
			
		}
	}
	
	
	public static void studentmenu() {
		System.out.println("---- STUDENT MENU ----");
		System.out.println("[1] Add new Student");
		System.out.println("[2] Update Student");
		System.out.println("[3] Delete Student");
		System.out.println("[4] Show remaining balance");
		System.out.println("[5] Fee Deposit");
		System.out.println("[6] Display all students with zero balance");
		System.out.println("[7] Display all students with balance");
		System.out.print("Input which number: ");
		int sAns = sc.nextInt();
		System.out.println(" ");
		
		switch (sAns) {
		case 1:
			System.out.print("First Name: ");
			String fname = sc2.nextLine();
			System.out.print("Last Name: ");
			String lname = sc2.nextLine();
			System.out.print("Gender(Female/Male): ");
			String gender1 = sc2.nextLine();
			System.out.print("Phone Number: ");
			String phonenum = sc2.nextLine();
			System.out.print("Address: ");
			String address1 = sc2.nextLine();
			System.out.println(" ");
			System.out.println("--- Student Successfully Registered! ---");
			System.out.println(" ");
			
			studentmenu();
			break;
			
		case 2:
			
		case 5:
			
			break;
			
			
		}
		
	}
		
}
