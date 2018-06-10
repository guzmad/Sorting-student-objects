/******************************************************************************
* Class Name: StudentLastName
*  File Name: StudentLastName.java
*
* Developer: Diego Guzman
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     10/30/2016  Initial Release
*
* File Description
* ----------------
* It compares students last names. 
*
* Class Methods
* -------------
*    Name                                    Description
* ----------  ----------------------------------------------------------------
* compare()	  It compares two students last names.
*
******************************************************************************
*/
import java.util.Comparator;

public class StudentLastName  implements Comparator<Student>{
	@Override
	///compares two student objects by last name
	public int compare(Student student1, Student student2) {
		return student1.getlastName().compareTo(student2.getlastName());
	}
}
