package services;

import model.Person;

public class MainService {
	
	private Person person;
	private Student student = new Student();
	private Teacher teacher = new Teacher();
	
	public MainService() {
		person = new Person();

	}
	
	// TODO: Update this! Require the controller to provide
		// ID and fname and lname
		// Create an implicit lookup for the matching data
		// then assign the matching list to the class variable
		// MainService
		public MainService(Person person) {
			// This is to avoid NullPointedException
			if (person != null) {
				this.person = person;
			}
		}
		/**
		 * Create new Teacher & Student
		 */
		public void addTeacherStudent(Person person) {
			this.teacher.addTeacher(0, null, null, null, null, null, null );
		//	this.student.addStudent(person);
		}

		/**
		 * Read Person ID of Teacher or Student details
		 */
		public Person getPerson(int ID) {
			// TODO: implement
			// return Person
			return this.getPerson(ID);
			
		}

		/**
		 * Update Teacher Student details
		 */
		public void updateTeacherStudent(Person person) {
			// TODO: implement
			// Call the appropriate services that updates the Teacher and Student
			
			
			
		}

		/**
		 * Delete Student or Teacher
		 */
		public void deleteStudentTeacher(Person person) {
			// TODO: implement
			// Call the appropriate services that deletes the Teacher and Student
			//this.student.deleteStudent();
			this.teacher.deleteTeacher(0, null, null);
		}
	}


