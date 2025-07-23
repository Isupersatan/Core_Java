package jsp.mock.prime;

import java.util.Scanner;

public class AltPrime {
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
		System.out.print("Enter a the range: ");
		int num = sc.nextInt();
		int count=0;
		for(int i=0;i<=num;i++) {
			if(isPrime(i)) {
				count++;
				if(count%2!=0)	System.out.print(i+" ");
			}
		}
		
		
		sc.close();
	}
}
