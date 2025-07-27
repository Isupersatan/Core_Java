package num.perfect;

import java.util.Scanner;

public class PerfectNumRange {
	public static boolean isPerfect(int n) {
		int sum=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)	sum+=i;
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ");
		int r = sc.nextInt();
		for(int i=0;i<=r;i++) {
			if(isPerfect(i)) System.out.println(i+" ");
		}
		sc.close();
	}
}