package Package;

public class Ex11_3 {
	 public static void main(String[] args) {
		    Account a = new Account(123, 526.70);
		    CheckingAccount c = new CheckingAccount(456, 872.20, 100);
		    SavingsAccount s = new SavingsAccount(789, 232.54);

		    System.out.println(a);
		    System.out.println(c);
		    System.out.println(s);
		  }

}
