package dsa.string;

import java.util.Scanner;

public class Panagram {
	
	static boolean isPanagram(String s) {
		int count = 0;
		while(s.length()>=0) {
			if(s.charAt(0)>='a' && s.charAt(0)<='z') {
				count++;
				s=s.replace(s.charAt(0)+"", "");
			}
		}
		return count==26;
	}
	
//	static boolean isPanagram2(String s) {
//		
//		char[] a = s.toCharArray();
//		int count = 0,i=0;
//		while(i<a.length) {
//			if(a[i]>='a' && a[i]<='z') {
//				count++;
//				s=s.replace(s.charAt(0)+"", "");
//			}
//		}
//		return count==26;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println(isPanagram(s));
		sc.close();
	}
}
