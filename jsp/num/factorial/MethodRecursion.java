package jsp.num.factorial;

import java.util.Scanner;

public class MethodRecursion {
	public static int factorial(int n) {
		if(n==1 || n==0) return 1;
		return n*factorial(n-1);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num: ");
		int num = sc.nextInt();
		System.out.print("factorial of "+num+" is : "+factorial(num));
		sc.close();
	}
}
