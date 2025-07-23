package jsp.mock.perfect;

import java.util.Scanner;

public class PerfectRecursion {
	
	public static boolean isPerfect(int n,int i,int sum) {
		if(i==0)	return sum==n;
		if(n%i==0) sum+=i;
		return isPerfect(n, i-1, sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = sc.nextInt();
		System.out.println(isPerfect(num,num/2,0));
		sc.close();
	}
}
