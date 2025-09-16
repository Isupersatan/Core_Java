package dsa.string;

import java.util.Scanner;

public class Encryption {
	
	static String enCode(String s,int k) {
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(Character.isUpperCase(a[i]))
				a[i]=(char)(((((a[i]+k-'A')%26)+26)%26)+'A');
			else if(Character.isLowerCase(a[i]))
				a[i]=(char)(((((a[i]+k-'a')%26)+26)%26)+'a');
		}
		return new String(a);
	}
	
	static String deCode(String s,int key) {
	return	enCode(s, -key);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		
		String s1 = enCode(str, key);
		System.out.println("Encoded: "+s1);
		System.out.println("Encoded: "+deCode(s1, key));
		
		sc.close();
	}
}
