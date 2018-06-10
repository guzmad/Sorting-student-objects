/******************************************************************************
* Class Name: StudentGrade
*  File Name: StudentGrade.java
*
* Developer: Diego Guzman
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     10/30/2016  Initial Release
*
* File Description
* ----------------
* It compares student's grades. 
* 
* Class Methods
* -------------
*    Name                                    Description
* ----------  ----------------------------------------------------------------
* compare()	  It compares student's by grades.
*
******************************************************************************
*/
import java.util.Comparator;

public class StudentGrade implements Comparator<Student>{
	@Override
	///compares two student objects by grade
	public int compare(Student student1, Student student2) {
		return student1.getgrade().compareTo(student2.getgrade());
	}
}
