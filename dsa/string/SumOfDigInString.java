package dsa.string;

import java.util.Scanner;

public class SumOfDigInString {
	
	static int sumOfDig(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) 
			if(s.charAt(i)<='9'&& s.charAt(i)>='0')	sum+=s.charAt(i)-'0';
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a srting");
		String str = sc.nextLine();
		System.out.println(sumOfDig(str));
		sc.close();
	}
}
