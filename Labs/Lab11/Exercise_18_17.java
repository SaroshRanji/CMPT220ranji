package recursion;

import java.util.Scanner;

public class Exercise_18_17 {
	/** Main method */
	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a list of characters
		System.out.print("Enter a list of characters in one line: ");
		String str = input.nextLine();
		char[] chars = new char[str.length() - 1];
		for (int i = 0; i < chars.length; i++)
			chars[i] = str.charAt(i);
		char ch = str.charAt(str.length() - 1);

		// Number of occurrences of the character
		System.out.println("The character \"" + ch + "\" occurs " 
			+ count(chars, ch) + " times in the list \"" + 
			str.substring(0, str.length() - 1) + "\".");
	}

	/** Method counts the occurrences of a 
	  * specified character in an array */
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}

	/** Recursive helper method */
	public static int count(char[] chars, char ch, int high) {
		if (high < 0) // Base case
			return 0;
		else if (chars[high] == ch) 
			return 1 + count(chars, ch, high - 1); // Recursive call
		else
			return count(chars, ch, high - 1); // Recursive call
	}
}