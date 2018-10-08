package Package;

public class lab4problem1 {
	 public static double inToCm(double x) {
	        return 2.54 * x;
	    }
	    
	    public static double cmToIn(double x) {
	        return .39 * x;
	    }
	    
	    
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        System.out.println("in     cm       |   cm       in");
	        for(int i = 1, j = 1; i<=50 && j <=251; i++, j+=5) {
	            System.out.printf(i + "     %.4g   |   " + j + "       %.4g%n", inToCm(i), cmToIn(j));
	        }
	    }
	}


