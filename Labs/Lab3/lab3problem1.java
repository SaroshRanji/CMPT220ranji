package Package;

import java.util.*;

public class lab3problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer, the input ends with a 0: ");
		int evens;
		evens = 0;
		int n;
		int sum;
		int div;
		double average;
		sum = 0;
		div = 1;
		n = input.nextInt();
		sum = sum + n;
		if (n % 2 == 0) 
			evens = evens + 1;
		
	
		
		while (n !=0) {
			n = input.nextInt();
			sum = sum + n;
			div = div + 1;
			if (n % 2 == 0) 
				evens = evens + 1;
				
			
				
			
		}
		average = sum / div;
		System.out.println("The number of even numbers: " + evens);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + average);
		
		// calculating the number of even numbers, sum, and average. Stops when user enters 0

	}

}
