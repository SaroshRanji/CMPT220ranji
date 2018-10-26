package packag;
import java.util.*;

public class Lab5problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] list = new double[10];
			double temp=0;
			double meanAnswer = 0;
			double deviationAnswer = 0;
			
			for(int i=0; i<10; i++) {
				System.out.print("Please input a number");
				temp = scan.nextDouble();
				list[i] = temp;
			}//for
		// TODO Auto-generated method stub
			meanAnswer= mean(list);
			System.out.println("The mean is " + meanAnswer);
			deviationAnswer = deviation(list);
			System.out.println("The standard deviation is " + deviationAnswer);

	}
	public static double deviation(double[] list) {
		double mean = 0;
		double[] st = new double[10];
		mean = mean(list);
		double temp = 0;
		double sum = 0;
		double mean2 =0;
		double sdanswer =0;
	//	for(int b=0; b<10; b++) {
			for(int c=0; c<10; c++) {
				temp = list[c] - mean;
				temp = temp * temp;
				st[c] = temp;
				sum += temp;
				
				
			}//for c
		mean2 = sum/10;
		sdanswer = Math.sqrt(mean2);
		return sdanswer;
			
			
	//	}//for outer
		
	}//deviation
	public static double mean(double[] list) {
		double total = 0;
		double answer = 0;
		
				for(int a=0; a<10; a++) {
					total = total + list[a];
					
						
				}//for
		answer = total/10;
		return answer;
	}//mean

}
