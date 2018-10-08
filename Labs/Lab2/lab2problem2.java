package Package;

import java.util.Scanner;

public class lab2problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number 1-12 to print the corresponding month");
		int number1 = input.nextInt();
		if(number1 == 1) {
			System.out.println("The first month is January");
		} else if(number1 == 2) {
				System.out.println("The second month is February");
		}
		
		if(number1 == 3) {
			System.out.println("The third month is March");
		} else if(number1 == 4) {
				System.out.println("The fourth month is April");
		}
		

		if(number1 == 5) {
			System.out.println("The fifth month is May");
		} else if(number1 == 6) {
				System.out.println("The sixth month is June");
		}
		

		if(number1 == 7) {
			System.out.println("The seventh month is July");
		} else if(number1 == 8) {
				System.out.println("The eighth month is August");
		}
		
		if(number1 == 9) {
			System.out.println("The ninth month is September");
		} else if(number1 == 10) {
				System.out.println("The tenth month is October");
		}
		
		if(number1 == 11) {
			System.out.println("The eleventh month is November");
		} else if(number1 == 12) {
				System.out.println("The twelth month is December");
		}
		
		
		// repeated if else statements to translate number into month
		//Write a Java program that prompts the user to enter a number for the month, i.e. 1 for January,and prints the name of the month.

	}

}
