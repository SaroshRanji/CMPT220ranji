package Package;

public class E11_05 {
	  public static void main(String[] args) {
	    Course course = new Course("Math 101");
	    course.addStudent("Joe");
	    course.addStudent("Mary");
	    course.addStudent("April");
	    course.addStudent("Meryl");

	    String[] students = course.getStudents();
	    for (int i = 0; i < students.length; i++) {
	      System.out.println(students[i]);
	    }

	    System.out.println();

	    course.dropStudent("Mary");
	    students = course.getStudents();
	    for (int i = 0; i < students.length; i++) {
	      System.out.println(students[i]);
	    }
	  }
	}