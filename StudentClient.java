/******************************************************************************
* Class Name: StudentClient
* File Name: StudentClient.java
*
* Developer: Diego Guzman
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     10/30/2016  Initial Release
*   1.1     06/09/2018  Added additional comments to the file  
*
* File Description
* ----------------
* This file defines the the class StudentClient, which includes all methods,
* variables, and constant values. Specifically, this class contains the Console
* application entry method, main(), which is a static method.
* 
* Class Methods
* -------------
*    Name                   Description
* ----------  				--------------------------------------------------------------
* main      			    The OS transfers control to this method upon program execution
* BaseCase(); 				It displays for the data in the original format.
* sortLastName(); 			It displays for the data sorted in by last name.
* sortFirstName();			It displays for the data sorted in by first name.
* sortById();				It displays for the data sorted in by student Id.
* sortStudentGrade();		It displays for the data sorted in by grade.
* sortStudentPercentage();  It displays for the data sorted in by student percentage.	
******************************************************************************
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class StudentClient {
	static String lastName;
	static String firstName;
	static String studentId;
	static double gradePercentage;
	static String grade;
	
	public static void main(String[] args) throws FileNotFoundException{
		///Creating an array of student objects	
		Student[] students = new Student [10];
		// The scanner object tokenizes the words in the student records file
		Scanner in = new Scanner(new File("StudentRecords.txt")); 
		int index = 0;
		// Scan the tokanize file line by line 
		while(in.hasNextLine()){
			lastName = in.next();
			firstName = in.next();
			studentId = in.next();
			gradePercentage = in.nextDouble();
			grade = in.next();
			//Add a new student to the students array
			students[index] = new Student(lastName,firstName,studentId,gradePercentage,grade);
			index++;
		}
		/////Methods to display the students in different sorting orders
		BaseCase(students);
		sortLastName(students);
		sortFirstName(students);
		sortById(students);
		sortStudentPercentage(students);
		sortStudentGrade(students);
	}
	public static void format(Student[] students){
		System.out.println("Last Name   First Name     ID     Average  Grade");
		System.out.println("----------  ----------   ------   -------  -----");
		for(int i = 0 ; i <students.length; i++){
			System.out.println(students[i]);
		}
	}
	///Displays the student list in the same order as they were inserted
	public static void BaseCase(Student[] students){
		System.out.println("Student Records, as read from the database");
		format(students);
		System.out.println();
	}
	///Displays the student list sorted by last name
	public static void sortLastName(Student[] students){
		Arrays.sort(students, new StudentLastName());
		System.out.println("Student Records, after sorting by last name:");
		format(students);
		System.out.println();
	}
	///Displays the student list sorted by first name
	public static void sortFirstName(Student[] students){
		Arrays.sort(students, new StudentFirstName());
		System.out.println("Student Records, after sorting by first name:");
		format(students);
		System.out.println();
	}
	///Displays the student list sorted by ID
	public static void sortById(Student[] students){
		Arrays.sort(students, new StudentID());
		System.out.println("Student Records, after sorting by student ID:");
		format(students);
		System.out.println();
	}
	///Displays the student list sorted by grade
	public static void sortStudentGrade(Student[] students){
		Arrays.sort(students, new StudentGrade());
		System.out.println("Student Records, after sorting by average:");
		format(students);
		System.out.println();
	}
	///Displays the student list sorted by grade percentage
	public static void sortStudentPercentage(Student[] students){
		Arrays.sort(students, new StudentPercentage());
		System.out.println("Student Records, after sorting by letter grade:");
		format(students);
		System.out.println();
	}
}
