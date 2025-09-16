package num.fibbonacciSeries;

import java.util.Scanner;

public class RecursiveFibo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of Series: ");
		int n = sc.nextInt();
		fibbonacci(n,0,1);
		sc.close();
	} 
	 
	 static void fibbonacci(int n,int a,int b) {
		 if(n==0) return;
		 System.out.print(a+" ");
		 fibbonacci(n-1,b,a+b);
	}
	 

}
