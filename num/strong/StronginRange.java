package num.strong;

import java.util.Scanner;

public class StronginRange {
	static int fact(int n) {
		if(n==1 || n==0) return 1;
		return n*fact(n-1);
	}
	
	static boolean isStrong(int n) {
		int sum=0,temp=n;
		while(temp != 0) {
			sum+=fact(temp%10);
			temp/=10;
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Range: ");
		int r = sc.nextInt();
		for(int i=0;i<=r;i++) {
			if(isStrong(i))	System.out.println(i+" ");
		}
		sc.close();
	}
}
