package Package;

public class MyLong {
	static long value;

	
	
	public static long getValue() {
		return value;
	}





	public MyLong(long value) {
		this.value = value;
	}





	public static boolean isEven() {
		if(value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
			
		
	}
	public static boolean isOdd() {
		if(value % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static boolean isPrime() {
		
		for(int i = 2; i <= value /2; i++) {
			if(value % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
	public static boolean isEven(long num) {
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
			
		
	}
	public static boolean isOdd(long num) {
		if(num % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static boolean isPrime(long num) {
		
		for(int i = 2; i <= value /2; i++) {
			if(num % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
	public static boolean isEven(MyLong num) {
		if(num.getValue() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
		
			
		
	}
	public static boolean isOdd(MyLong num) {
		if(num.getValue() % 2 == 1) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static boolean isPrime(MyLong num) {
		
		for(int i = 2; i <= value /2; i++) {
			if(num.getValue() % i == 0) {
				return false;
			}
			
		}
		return true;
		
	}
	public boolean equals(long num, long value) {
		if(num == value) {
			return true;
			
		}
		else {
			return false;
			
		}
	}
	public boolean equals(MyLong num, MyLong value) {
		if(num == value) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public static long parseLong(char[] array) {
		int arrayLength = array.length; 
		int array2[] = new int [arrayLength];
		double power = arrayLength -1;
		long sum = 0;
		for(int a = 0; a < arrayLength; a++) {
			array2[a] = Character.getNumericValue(array[a]);
		}
		for(int b = 0; b < arrayLength; b++) {
			sum += array2[b] * Math.pow(10, power);
			power --;
		}
		return sum;
		
	}
	public static long parseLong(String num) {
		int arrayLength = num.length(); 
		char array[] = new char[arrayLength];
		int array2[] = new int [arrayLength];
		double power = arrayLength -1;
		long sum = 0;
		int i = 0;
		for(i=0; i< arrayLength; i++) {
			array[i] = num.charAt(i);
		}
		for(int a = 0; a < arrayLength; a++) {
			array2[a] = Character.getNumericValue(array[a]);
		}
		for(int b = 0; b < arrayLength; b++) {
			sum += array2[b] * Math.pow(10, power);
			power --;
		}
		return sum;
		
	}

}
