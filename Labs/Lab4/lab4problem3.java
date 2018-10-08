package Package;

import java.util.Scanner;
public class lab4problem3 {
    public static String reverse(String s) {
        String x = "";
        for(int i = 1; i <= s.length() ; i++) {
            x += s.charAt(s.length()-i);
        }
        
        return x;
    }
    
    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String x = input.nextLine();
        if(isPalindrome(x)) {
            System.out.println(x + " is a palindrome!");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }
}