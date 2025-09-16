package num.fibbonacciSeries;

import java.util.Scanner;

public class FibboSeriesLimit {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Series: ");
		int n = sc.nextInt();
		fibbonacci(n,0,1);
		sc.close();
	} 
	 
	 static void fibbonacci(int n,int a,int b) {
		 if(a>=n) return;
		 System.out.print(a+" ");
		 fibbonacci(n,b,a+b);
	}

}
