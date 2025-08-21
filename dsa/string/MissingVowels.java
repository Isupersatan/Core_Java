package dsa.string;

import java.util.Scanner;

public class MissingVowels {
	
	static String check(String s) {
		String vow = "AEIOUaeiou";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<vow.length();j++) {
				if(s.charAt(i)==vow.charAt(j))	
					vow=vow.replace(vow.charAt(j)+"", "");
					
			}
		}
		return vow;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println("Missing Vowels are :"+check(s));
		sc.close();
	}
}
