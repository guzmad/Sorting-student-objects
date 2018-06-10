/******************************************************************************
*  Class Name: StudentClass
*  File Name: StudentClass.java
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
* This class contains the constructor to build new StudentClass objects. Along with
* the accessor methods to return the values of the private fields and a overridden 
* toString.
* 
* Class Methods
* -------------
*    Name                                    Description
* ----------  			----------------------------------------------------------------
* StudentClass()		Constructor
* getlastName()			returns the Student's lastName.
* getFirstName()		returns the Student's first name.
* getstudentId()		returns the Student's Id.
* getgradePercentage()  returns the Student's grade percentage.
* getgrade()			returns the Student's grade.
* toString()			it displays the data in specified format.
******************************************************************************
*/
import java.io.File;
import java.text.DecimalFormat;
import java.util.Comparator;

public class Student {
	private String lastName;
	private String firstName;
	private String studentId;
	private double gradePercentage;
	private String grade;
    ////////Default constructor ////////////
	Student(){
		
	}
	//////// Constructor ////////////
	Student(String lastname, String firstName, String studentId, double gradePercentage, String grade){
		this.lastName = lastname;
		this.firstName = firstName;
		this.studentId = studentId;
		this.gradePercentage= gradePercentage;
		this.grade = grade;
	}
	////////Getters ////////////
	public String getlastName(){
		return lastName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getstudentId(){
		return studentId;
	}
	public double getgradePercentage(){
		return gradePercentage;
	}
	public String getgrade(){
		return grade;
	}
	////////Overriding the toString method ////////////
	public String toString(){
		//The DecimalFormat object formats a decimal value to the specified decimal points
		DecimalFormat df = new DecimalFormat("#.00");
		String percent = df.format(gradePercentage);
		String format = String.format("%-11s %-12s %-10s %-7s %1s",lastName,firstName,studentId,percent,grade);
		//Returning the formatted string
		return format;
	}
}
