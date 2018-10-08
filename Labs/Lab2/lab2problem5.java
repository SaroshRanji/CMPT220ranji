package Package;

import java.util.*;

public class lab2problem5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String st=scan.nextLine();
		String string2 = st.toUpperCase();
		
		System.out.println("Enter another string");
		String str=scan.nextLine();
		String string3 = str.toUpperCase();
		
		if (string2.compareTo(string3) < 0)
			System.out.println("The strings in alphabetical order are " + string2 + " " + string3);
		else
			System.out.println("The strings in alphabetical order are " + string3 + " " + string2);
		
		
		// Write a Java program that prompts the user for two strings, compares them lexicographically 
		//and outputs the string in ascending order. Scanner scan= new Scanner(System.in);

	}

}
