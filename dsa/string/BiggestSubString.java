package dsa.string;

import java.util.Scanner;

public class BiggestSubString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		
		String s1 = ""; 
		int max = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(int i=0;i<s.length;i++) {
			int len = s[i].length();
			if(len>max) {
				max = len;
				s1 = s[i];
			}
		}
		
		System.out.println(s1);
		
		sc.close();
	}
	
	
}
