package controller;

import services.Teacher;

public class maincontroller {
		
		private static Teacher teacher;
		private static maincontroller controller = null;
		
		
		private maincontroller() {
			
			teacher = teacher.getTeacher();
		}
		
		public static maincontroller getMainController() {
			
			if(controller == null)
				controller = new maincontroller();
			
			return controller;
		}
		
		
		public static boolean addDetails( int ID, String fname, String lname, String gender1, String phonenum, String address1, String designation) {
			//Will return true if the user details are added successfully(i.e all other information)
			return teacher.addTeacher( ID, fname, lname, gender1, phonenum, address1, designation);
		}
		
		
		public static void viewallTeachers () {
			teacher.allTeachers();
			
		}
		
		
		
		
}