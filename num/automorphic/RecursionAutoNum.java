package num.automorphic;

import java.util.Scanner;

public class RecursionAutoNum {
	
	public static boolean isAuto(int n,int sq) {
		if(n<=9) return n%10==sq%10;
		return isAuto(n/10, sq/10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = sc.nextInt();
		System.out.println(isAuto(num,num*num));
		sc.close();
	}
}
