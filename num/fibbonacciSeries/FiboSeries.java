package num.fibbonacciSeries;

import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Series: ");
		int n = sc.nextInt();
		fibbonacci(n);
	}
	
	 static void fibbonacci(int n) {
		 int a=0,b=1;
		 for(int i=1;i<=n;i++) {
			 System.out.print(a+" ");
			 int temp = a+b;
			 a=b;
			 b=temp;
		 }
	 } 
}
