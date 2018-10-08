package Package;

public class lab4problem2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int x = (int)(Math.random()*26);
                System.out.print(alpha.charAt(x) + " ");
            }
            System.out.println();
        }
        
        
        
    }
}
