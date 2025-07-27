package num.Convert;

import java.util.Scanner;

public class DecToBinRecursion {

	static int toBin(int n,int sum,int p) {
		if(n==0)	return sum;
		sum += (n%2)*p;
		return toBin(n/2,sum,p*10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal Num:");
		int dec = sc.nextInt();
		int bin=0,p=1;
		System.out.println("Binary value is "+toBin(dec,bin,p));
		sc.close();
	}
}
