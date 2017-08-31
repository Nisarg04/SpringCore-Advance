package collectionDI;

import java.util.ArrayList;


public class Student {
	
	ArrayList<String> studentsList;

	public void setStudentsList(ArrayList<String> studentsList) {
		this.studentsList = studentsList;
	}
	
	public void displayList()
	{
		System.out.println("Student Name List is : "+studentsList);
	}
	

}
