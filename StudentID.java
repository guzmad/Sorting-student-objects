/******************************************************************************
* Class Name: StudentID
* File Name: StudentID.java
*
* Developer: Diego Guzman
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     10/30/2016  Initial Release
*   
*
* File Description
* ----------------
* It compares students ID's. 
* 
* Class Methods
* -------------
*    Name                                    Description
* ----------  ----------------------------------------------------------------
* compare()	  It compares two students ID's.
*
******************************************************************************
*/
import java.util.Comparator;

public class StudentID implements Comparator<Student>{
	@Override
	///compares two student objects by studentId
	public int compare(Student student1, Student student2) {
		return student1.getstudentId().compareTo(student2.getstudentId());
	}
}
