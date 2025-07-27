package num.automorphic;

import java.util.Scanner;

public class AutoNumRange {
	public static boolean isAuto(int n) {
		if(n<1)	return false;
		int sq=n*n;
		while(n != 0) {
			if(n%10!=sq%10)	return false;
			n/=10;
			sq/=10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int r = sc.nextInt();
		for(int i=0;i<=r;i++) {
			if(isAuto(i))	System.out.print(i+" ");
		}
		sc.close();
	}
}
