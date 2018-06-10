/******************************************************************************
* Class Name: StudentFirstName
*  File Name: StudentFirstName.java
*
* Developer: Diego Guzman
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     10/30/2016  Initial Release  
*
* File Description
* ----------------
* It compares students first names. 
******************************************************************************
*/
import java.util.Comparator;

public class StudentFirstName implements Comparator<Student>{
	@Override
	///compares two student objects by first name
	public int compare(Student student1, Student student2) {
		return student1.getFirstName().compareTo(student2.getFirstName());
	}

}
