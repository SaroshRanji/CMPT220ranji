package Package;

import java.util.Scanner;

import java.util.Random;

public class lab2problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int lowerinput = input.nextInt();
		
		System.out.println("Enter the upper limit");
		int upperinput = input.nextInt();
		
		int upperinputfixed = (upperinput - lowerinput);
		
		int n = (upperinput) + lowerinput;
		
		System.out.println(lowerinput + Math.random() * upperinputfixed);
		
		
		// Write a Java program that asks the user for a lower limit integer, and upper limit and prints
		//three randomly generated integer values between the two limits.

	}

}
