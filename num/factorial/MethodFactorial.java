package num.factorial;

import java.util.Scanner;

public class MethodFactorial {
	
	public static int factorial(int n) {
		int prod = 1;
		for(int i=1;i<=n;i++) {
			prod *= i;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num: ");
		int num = sc.nextInt();
		System.out.print("factorial of "+num+" is : "+factorial(num));
		sc.close();
	}
}
