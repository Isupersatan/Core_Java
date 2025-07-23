package jsp.mock.automorphic;

import java.util.Scanner;

public class HighAutoNum {
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
		int count=0;
		for(int i=r;i>=0;i--) {
			if(isAuto(i))	count++;
			if(count==1) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
