package jsp.num.Convert;

import java.util.Scanner;

public class DecToBin {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal Num:");
		int dec = sc.nextInt();
		int bin=0,p=1;
		
		while(dec>0) {
			int dig = dec%2;
			bin += dig*p;
			dec/=2;
			p*=10;
		}
		System.out.println("Binary value is "+bin);
		sc.close();
	}
}
