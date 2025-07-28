// Case conversation without using Predefined method
package dsa.string;

import java.util.Scanner;

public class CaseConvertion {
	
	static String upperCase(String s) {
		char[] a = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' &&  a[i]<='z')	a[i]=(char)(a[i]-32);
		}
		
		return new String(a);
	}
	
	static String lowerCase(String s) {
		char[] a = s.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>='A' &&  a[i]<='Z')	a[i]=(char)(a[i]+32);
		}
		
		return new String(a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Input");
		String str = sc.nextLine();
		System.out.println(upperCase(str));
		System.out.println(lowerCase(str));
		sc.close();
	}
}
