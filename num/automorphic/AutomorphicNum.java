package num.automorphic;

import java.util.Scanner;

public class AutomorphicNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = sc.nextInt();
		int sq=num*num;
		boolean flag=true;
		while(num != 0) {
			if(num%10!=sq%10) {
				flag=false;
				break;
			}
			num/=10;
			sq/=10;
		}
		if(flag)	System.out.println("it is an automorphic num.");
		else	System.out.println("it is not an automorphic num.");
		sc.close();
	}
}
