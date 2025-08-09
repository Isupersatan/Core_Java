package dsa.string;

import java.util.Scanner;

public class Encoding {
	
	static String encode(String s,int k) {
		char[] a = s.toLowerCase().toCharArray();
		char[] ch = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String s1 = "";
		
		for(int i=0;i<a.length;i++) {
			int index=a[i]-'a';
			index+=k;
			s1+=ch[index%26];
		}
		return s1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		System.out.print("Enter the key: ");
		int key = sc.nextInt();
		
		System.out.println("Encoded: "+encode(str, key));
		
		sc.close();
	}
}
