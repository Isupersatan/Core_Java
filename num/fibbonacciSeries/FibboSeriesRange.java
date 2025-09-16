package num.fibbonacciSeries;

import java.util.Scanner;

public class FibboSeriesRange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the low and up value: ");
		int low = sc.nextInt();
		int up = sc.nextInt();
		fibbonacci(low,up,0,1);
		sc.close();
	} 
	 
	 static void fibbonacci(int l,int u,int a,int b) {
		 if(a>=u)	return;
		 if(a>=l)	System.out.print(a+" ");
		 fibbonacci(l,u,b,a+b);
	}
}
