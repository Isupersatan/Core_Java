package jsp.num.armstrong;

import java.util.Scanner;

public class highestArmStrong {

	static int count(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	static int power(int base,int pow) {
		int res=1;
		for(int i=1;i<=pow;i++) {
			res*=base;
		}
		return res;
	}
	
	static boolean isArmStrong(int n) {
		int temp=n, sum=0, pow=count(n);
		while(temp!=0) {
			int dig = temp%10;
			sum += power(dig,pow);
			temp/=10;
		}
		return sum==n;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the range: ");
		 int r = sc.nextInt();
		 int count=0;
		 
		 for(int i=r;i>=1;i--) 
			 if(isArmStrong(i)) {
				 count++;
				 if(count==1)	System.out.println(i);
				 break;
			 }
		 
		 sc.close();
	}
}
