package Package;

import java.util.*;

public class lab2problem6 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = 2 + (int)(Math.random()* 8);
		int b = 1 + (int)(Math.random()* 9);
		int c = rand.nextInt(9) + 1;
		int d = rand.nextInt(9) + 1;
		int e = rand.nextInt(9) + 1;
		int f = rand.nextInt(9) + 1;
		int g = rand.nextInt(9) + 1;
		int h = rand.nextInt(9) + 1;
		int i = rand.nextInt(9) + 1;
		int j = rand.nextInt(9) + 1;
		
		System.out.println("(" + a + b + c + ") " + d + e + f + "-" + g + h + i + j);
		

		
		// Write a Java program that generates and prints a random phone number every time the
		//program is executed. The number should be formatted as (xxx) xxx-xxxx. The phone number
		//may not start with 0 or 1. For example, the result of a run could be (345) 455-8999. 

	}

}
