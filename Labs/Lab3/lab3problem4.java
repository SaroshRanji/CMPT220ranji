<<<<<<< HEAD
package Package;

public class lab3problem4 {

	public static void main(String[] args) {
		boolean prime = false;
		int max = 15001;
		while(!prime) {
			max--;
			prime=true;
			for(int i = 2; i<max/2; i++) {
				if(max%i==0) {
					prime=false;
				}
				
			}
			
		}
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}
=======
package Package;

public class lab3problem4 {

	public static void main(String[] args) {
		boolean prime = false;
		int max = 15001;
		while(!prime) {
			max--;
			prime=true;
			for(int i = 2; i<max/2; i++) {
				if(max%i==0) {
					prime=false;
				}
				
			}
			
		}
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}
>>>>>>> e75fc2f6796e078601fb50a4d22c9dbf97650bb7
