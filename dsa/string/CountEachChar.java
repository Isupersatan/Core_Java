package dsa.string;

import java.util.Scanner;

public class CountEachChar {

	//using predefined String methods
	static void countChar2(String s) {
		while(s.length()>0) {
			char c=s.charAt(0);
			String  s2 = s.replace(c+"","");
			int count=s.length()-s2.length();
			System.out.println(c+"="+count);
			s=s2;
		}
	}
	//without using predefined String methods
	static void countChar(String s) {
		char [] a = s.toLowerCase().toCharArray();
		for(int i=0;i<a.length;i++) {
			int count=1;
			if(a[i]==' ')	continue;
			for(int j=i+1;j<a.length;j++) 
				if(a[i]==a[j]) {
					count++;
					a[j]=' ';
				} 
			System.out.println(a[i]+"="+count);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a srting");
		String str = sc.nextLine();
		countChar2(str);
		sc.close();
	}
}
