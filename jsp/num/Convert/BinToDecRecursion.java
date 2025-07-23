package jsp.num.Convert;

import java.util.Scanner;

public class BinToDecRecursion {
	
	static int toDec(int n,int sum,int p) {
		if(n==0)	return sum;
		sum += (n%10)*p;
		return toDec(n/10,sum,p*2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Binary Num:");
		int bin = sc.nextInt();
		int dec=0,p=1;
		System.out.println("Decimal value is "+toDec(bin,dec,p));
		sc.close();
	}
}
