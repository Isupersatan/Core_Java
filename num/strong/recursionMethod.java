package num.strong;

import java.util.Scanner;

public class recursionMethod {
	static int fact(int n) {
		if(n==1 || n==0) return 1;
		return n*fact(n-1);
	}
	
	static boolean isStrong(int n,int temp,int sum) {
		if(temp==0) return sum==n;
		sum+=fact(temp%10);
		return isStrong(n,temp/10,sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		System.out.println(num+" is a Strong Num: "+isStrong(num,num,0));
		sc.close();
	}
}
