package jsp.num.Convert;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Binary Num:");
		int bin = sc.nextInt();
		int dec=0,p=1;
		
		while(bin>0) {
			int bit = bin%10;
			dec += bit*p;
			bin/=10;
			p*=2;
		}
		System.out.println("Decimal value is "+dec);
		sc.close();
	}
}
