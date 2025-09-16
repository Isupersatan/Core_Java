package dsa.string;

import java.util.Scanner;

public class MissingVowels {
	
	static String check(String s) {
		String vow = "AEIOUaeiou";
		for(int i=0;i<s.length();i++) {
			if(vow.contains(s.charAt(i)+""))	
					vow=vow.replace(s.charAt(i)+"", "");
					
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


