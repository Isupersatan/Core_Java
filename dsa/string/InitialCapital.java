package dsa.string;

import java.util.Scanner;

public class InitialCapital {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a string");
		String s = sc.nextLine();
		System.out.println(convert2(s));
		sc.close();
	}
	
	//using split predefine function
	static String convert(String s) {
		String[] a = s.split(" ");
		String s1="";
		for(int i=0;i<a.length;i++) {
			char[] c=a[i].toCharArray();
			c[0]=(char)(c[0]-32);
			s1 += new String(c);
			if(i<a.length) s1+=" ";
		}
		return  s1;
	}
	
	//without using predefine function
	static String convert2(String s) {
		char [] a = s.toCharArray();
		int i=0,j=0;
		while(i<a.length) {
			while(j<a.length && a[j]!=' ')	j++;
			a[i]=(char)(a[i]-32);
			j++;
			i=j;
		}
		return new String(a);
	}
}
