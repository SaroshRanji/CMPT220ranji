package Package;

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a weight in kilograms");
		double weight = input.nextDouble();
		double energy = weight * 299972458 * 299972458;
		System.out.print(energy + " J");
		

	}

}
