package Package;
import java.util.Scanner;

public class lab3problem6 {

	public static void main(String[] args) {
		int vowel=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter letters");
		String str=scan.nextLine();
		System.out.println(getVowels(str));

		// . Write a Java program to count the vowels in a string given as input. It should use a The
		//program should use a method that takes the string and returns the count of the vowels.

	}
	public static int getVowels (String str) {
		int count = 0;
		for(int i=0; i<str.length();i++ ) {
			if(str.substring(i, i+1).equals("a")) {
				count ++;
			}
			if(str.substring(i,i+1).equals("e")) {
				count ++;
			}
			if(str.substring(i,i+1).equals("i")) {
				count ++;
			}
			if(str.substring(i,i+1).equals("o")) {
				count ++;
			}
			if(str.substring(i,i+1).equals("u")) {
				count ++;
			}
			}
		return count;
		}
	//System.out.println(getvowels);
	//	return count;
	}

