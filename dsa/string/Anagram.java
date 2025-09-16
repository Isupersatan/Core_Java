package dsa.string;

import java.util.Scanner;

public class Anagram {
	
	static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		if(s1.length()==0 && s2.length()==0)	return true;
			
		char c = s1.charAt(0);
		s1=s1.replace(c+"", "");
		s2=s2.replace(c+"", "");
			
		return isAnagram(s1, s2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(isAnagram(s1, s2));
		
		sc.close();
	}
}
