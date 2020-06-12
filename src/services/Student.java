package services;

import model.Person;

import java.util.LinkedList;

public class Student{
	
	private static Student student;
	private LinkedList<Person> studentlist;
	private Person Person;
	

	public static Student geStudent() {
		
		if(student == null)
			student = new Student();
				
			return student;
	}
	
	
	private void StudentDatabase() {
		Person student1 = new Person();
		student1.setID(01);
		student1.setFirstname("Gabriel");
		student1.setLastname("Cortez");
		student1.setGender("Male");
		student1.setPhonenumber("09111111111");
		student1.setAddress("Makati City");
		studentlist.add(student1);

		Person student2 = new Person();
		student2.setID(02);
		student2.setFirstname("Clark");
		student2.setLastname("Tolosa");
		student2.setGender("Male");
		student2.setPhonenumber("0922222222");
		student2.setAddress("Makati City");
		studentlist.add(student2);

	//	this.teacherlist.add(teacher1);
	//	this.teacherlist.add(teacher2);
	}
		
}
