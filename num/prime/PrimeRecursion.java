package num.prime;

import java.util.Scanner;

public class PrimeRecursion {
	public static boolean isPrime(int n,int i) {
		if(i==1) return true;
		if(n<=1 || n%i==0) return false;
		return isPrime(n,i-1);
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		System.out.println(isPrime(num,num/2));
		sc.close();
	}
}
