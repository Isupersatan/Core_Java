package num.strong;

import java.util.Scanner;

public class MethodStrongNum {
	
	static int fact(int n) {
		if(n==1 || n==0) return 1;
		return n*fact(n-1);
	}
	
	static boolean isStrong(int n) {
		int sum=0,temp=n;
		while(temp != 0) {
			sum+=fact(temp%10);
			temp/=10;
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		System.out.println(num+" is a Strong Num: "+isStrong(num));
		sc.close();
	}
}
