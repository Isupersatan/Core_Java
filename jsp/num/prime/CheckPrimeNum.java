package jsp.num.prime;

import java.util.*;
public class CheckPrimeNum {
	
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		System.out.println(isPrime(num));
		sc.close();
	}
}
