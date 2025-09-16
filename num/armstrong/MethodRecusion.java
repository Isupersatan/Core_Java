package num.armstrong;

import java.util.Scanner;

public class MethodRecusion {
	
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
		return isArmStrong(n, temp/10, sum, pow);
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a range: ");
		 int r = sc.nextInt();
		 
		 for(int i=r;i>=100;i--) 
			 if(isArmStrong(i,i,0,count(i))) {
				 System.out.println(i+" ");

			 }
		 
		 sc.close();
	}
}

