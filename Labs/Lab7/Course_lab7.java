package Package;
import java.util.*;
public class Course_lab7 {
	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String[] students= new String[5];
		String course = null;
		int numberOfStudents = 0;
		int arrayLength = 5;
		System.out.println("Enter a course name");
		course = keyboard.next();
		System.out.println("Enter the first student's name");
		students[numberOfStudents] = keyboard.next();
		numberOfStudents++;
		System.out.println("Enter the second student's name");
		students[numberOfStudents] = keyboard.next();
		numberOfStudents++;
		System.out.println("Enter the third student's name");
		students[numberOfStudents] = keyboard.next();
		numberOfStudents++;
		
		students[numberOfStudents -1] = null;
		numberOfStudents--;
		System.out.println("The last student has been deleted");
		for(int a = 0; a < numberOfStudents;a++) {
			System.out.println(students[a]);
		}
		
		// TODO Auto-generated method stub

	}

}
