package services;

import java.util.Date;
import java.util.LinkedList;


import model.Person;

public class Teacher {
	
	private static Teacher teacher;
	private static LinkedList<Person> teacherlist;
	private Person Person;
	
	public static Teacher getTeacher() {
		
		if(teacher == null)
			teacher = new Teacher();
				
			return teacher;
	}
	
	
	
	//ADD TEACHER
	public boolean addTeacher(int ID, String fname, String lname, String gender1, String phonenum, String address1, String designation) {
		int count= 0;
		boolean isAdded = false;
		//loop through my entire list of person
		for(Person ee: teacherlist) {
			//if the user inputs username is the same as anything in my list get that user information
			
				//set that user with new user input
				ee.setID(++count);
				ee.setFirstname(fname);
				ee.setLastname(lname);
				ee.setGender(gender1);
				ee.setPhonenumber(phonenum);
				ee.setAddress(address1);
				ee.setDesignation(designation);
				//set added as true when successful
				isAdded = true;
			
		}
		//return true when done
		return isAdded;
	}
	
	
	//UPDATE TEACHER
	public void updateTeacher(int ID, String fname, String lname, String address, String designation, int hours, Person person) {
		// TODO: implement
		// Look up for the matching account based on the provided
		// fname, lname then update the matching
		// account with the values provided in updateTeacher
		this.teacherLookUp(ID, fname, lname);
		int index = this.teacherlist.indexOf(person);
		
	}
	
	
	//SEARCH FOR A TEACHER IN LIST
	/**
	 * Looks up for the matching account holder from the list
	 * of teacherlist
	 * 
	 * @param ID
	 * @param fname
	 * @param lname
	 * @return
	 */
	private Person teacherLookUp(int ID, String fname,
			String lname) {
		Person person = new Person();

		for (Person ah: this.teacherlist) {
			if (ah.getID() == ID &&
				ah.getFirstname().equalsIgnoreCase(fname) &&
				ah.getLastname().equalsIgnoreCase(lname)
			) {
				person = ah;
			}
		}

		return person;
	}
	
	
	//DELETION OF TEACHER
	public void deleteTeacher(int ID, String fname,
			String lname) {
		// Get the account holder
		Person = this.teacherLookUp(ID, fname, lname);
		
		// Get the index then remove
		int index = this.teacherlist.indexOf(Person);
		this.teacherlist.remove(index);
	}	

	
	//CALCULATION OF SALARY
	public void calOfSalary(int ID, String fname, String lname, String designation, int hours) {
		
		this.teacherLookUp(ID, fname, lname);
		
		//DESIGNATIONS
		int hof = 8;
		int co = 13;
		int l = 18;
		
		double basesalary = 1200.00;
		int OT = 0; int OThours;		//OVERTIME
		double total = basesalary + OT;	//TOTAL SALARY
		double ha = 0.1; 		//HOUSING ALLOWANCE
		double ma = 0.03; 		//MEDICAL ALLOWANCE
		double ta = 0.05; 		//TRAVELLING ALLOWANCE
		
		double netsalary;
		
		
		if (designation.equalsIgnoreCase("HOF")) {
			System.out.println("Employee ID: " + ID);
			System.out.println("Name: " + fname + " " + lname);
			System.out.println("Designation:" + designation);
			System.out.println("No. of Teaching Hours: " + hours);
			
			OThours = hours - hof;
			OT = OThours * 325;
			System.out.println("Overtime: P" + OT);
			
			total = basesalary + OT;
			System.out.println("Total Salary: P" + (basesalary + OT) );
			
			ha = ha * total;
			ma = ma *total;
			ta = ta * total;
			netsalary = total + ha + ma + ta;
			System.out.println("Net Salary: " + netsalary);
			
			
		}else if (designation.equalsIgnoreCase("CO")) {
			System.out.println("Employee ID: " + ID);
			System.out.println("Name: " + fname + " " + lname);
			System.out.println("Designation:" + designation);
			System.out.println("No. of Teaching Hours: " + hours);
			
			OThours = hours - co;
			OT = OThours * 325;
			System.out.println("Overtime: P" + OT);
			
			total = basesalary + OT;
			System.out.println("Total Salary: P" + (basesalary + OT) );
			
			ha = ha * total;
			ma = ma *total;
			ta = ta * total;
			netsalary = total + ha + ma + ta;
			System.out.println("Net Salary: " + netsalary);
			
		}else if (designation.equalsIgnoreCase("L")) {
			System.out.println("Employee ID: " + ID);
			System.out.println("Name: " + fname + " " + lname);
			System.out.println("Designation:" + designation);
			System.out.println("No. of Teaching Hours: " + hours);
			
			OThours = hours - l;
			OT = OThours * 325;
			System.out.println("Overtime: P" + OT);
			
			total = basesalary + OT;
			System.out.println("Total Salary: P" + (basesalary + OT) );
			
			ha = ha * total;
			ma = ma *total;
			ta = ta * total;
			netsalary = total + ha + ma + ta;
			System.out.println("Net Salary: " + netsalary);
		}
		
		
	}
	

	//SHOW ALL TEACHERS
	public static void allTeachers() {
		System.out.println(teacherlist);
	}
	
	
	private void TeacherDatabase() {
		Person teacher1 = new Person();
		teacher1.setID(1);
		teacher1.setFirstname("John");
		teacher1.setLastname("Kennedy");
		teacher1.setGender("Male");
		teacher1.setPhonenumber("09123456789");
		teacher1.setAddress("Makati City");
		teacher1.setDesignation("HOF");
		teacher1.setHours(9);
		teacherlist.add(teacher1);

		Person teacher2 = new Person();
		teacher1.setID(2);
		teacher2.setFirstname("Clark");
		teacher2.setLastname("Tolosa");
		teacher2.setGender("Male");
		teacher2.setPhonenumber("09987654321");
		teacher2.setAddress("Makati City");
		teacher2.setDesignation("CO");
		teacher2.setHours(16);
		teacherlist.add(teacher2);

	//	this.teacherlist.add(teacher1);
	//	this.teacherlist.add(teacher2);
	}
	
	
	
}
