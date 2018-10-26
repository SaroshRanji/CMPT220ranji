package Package;
import java.util.*;


public class lab5problem3 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double numstudents = 0;
		System.out.print("Enter the number of students");
		numstudents = scan.nextDouble();
		double[] allscores = new double[numstudents];
		String[] studentnames = new String[numstudents];
		int counter = 0
		for(int i = 0; i<numstudents; i ++) {
			counter = i+1;
			System.out.println("Enter student " + counter + "'s name: ");
			studentnames[i] = scan.nextLine();
			System.out.println("Enter student " + counter + "'s score: ");
			allscores[i] = scan.nextDouble();
		}
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
