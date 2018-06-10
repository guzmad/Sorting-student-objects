/******************************************************************************
* Class Name: StudentPercentage
* File Name: StudentPercentage.java
*
* Developer: Diego Guzman
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     10/30/2016  Initial Release
*
* File Description
* ----------------
* It compares student's grades averages. 
*
* Class Methods
* -------------
*    Name                                    Description
* ----------  ----------------------------------------------------------------
* compare()	  It compares student's grades averages.
*
******************************************************************************
*/
import java.util.Comparator;

public class StudentPercentage implements Comparator<Student>{
	@Override
	///compares two student objects by grade percentage
	public int compare(Student student1, Student student2) {
		return (int) (student1.getgradePercentage() - student2.getgradePercentage());
	}
}
