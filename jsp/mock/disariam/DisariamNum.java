package jsp.mock.disariam;

import java.util.Scanner;

public class DisariamNum {
	static int count(int n) {
		if(n==0) return 0;
		return 1+count(n/10);
	}
	
	static int power(int base,int pow) {
		if(pow==0) return 1;
		return base*power(base,pow-1);
	}
	
	static boolean isArmStrong(int n,int temp,int sum,int pow) {
		if(temp==0) return sum==n;
		int dig = temp%10;
		sum+=power(dig,pow);
		return isArmStrong(n, temp/10, sum, pow-1);
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a Num: ");
		 int num = sc.nextInt();
		 System.out.println(num+" is a Disariam num ? :"+isArmStrong(num,num,0,count(num)));
		 sc.close();
	}
}
