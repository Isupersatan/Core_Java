package num.perfect;

import java.util.Scanner;

public class PerfectNumHigh {
	
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
		int count=0;
		for(int i=r;i>=0;i--) {
			if(isPerfect(i))	count++;
			if(count==2) {
				System.out.print(i);
				break;
			}
		}
		sc.close();
	}
}
