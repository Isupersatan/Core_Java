package dsa.string;

import java.util.Scanner;

public class AABBB_2A3B {

	static String convert(String s) {
		char [] a = s.toCharArray();
		String s1 = "";
		int i=0;
		while(i<a.length) {
			char c = a[i];
			int count = 1;
			i++;
			while(i<a.length && c==a[i]) {
				count++;
				i++;
			}
			s1=s1+count+c;
		}
		return s1;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println(convert(str));
		sc.close();
	}
}
