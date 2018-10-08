package Package;

public class lab3problem2 {

	public static void main(String[] args) {
		System.out.println("Numbers 100-500 divisible by 5 and 7");
		
		int i = 0;
		
		for (int a=100; a<500; a++) {
			if ((a%5==0 || a%7==0) && !(a%5==0 && a%7==0)) {
				System.out.print(a + "  ");
				i++;
			}
			if(i%10==0) {
				System.out.println();
			}
		}
		
		// Write a Java program that prints all the numbers from 100 to 500 (10 per line) that are
		//divisible by 5 or 7 but not both. Separate each number with a white space
			
	}

}



