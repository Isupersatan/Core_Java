package dsa.string;

import java.util.Scanner;

public class RevWordsOfStr {
	//without using split()
	static String reverseString2(String s) {
		char[] a = s.toCharArray();
		String s2 = "";
		int i = a.length-1 , j = a.length-1;
		
		while(i>=0) {
			while(i>=0 && a[i]!=' ')	i--;
			
			String temp = "";
			for(int k=i+1;k<=j;k++)	temp+=a[k];
			
			s2+=temp;
			if(i>=0)	s2+=" ";
			i--;
			j=i;
		}
		return s2;
	}
	//using split();
	static String reverseString(String s) {
		String[] a = s.split(" ");
		int i=0,j=a.length-1;
		while(i<j) {
			String temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return String.join(" ",a);
	}
	
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a String");
			String str = sc.nextLine();
			
			System.out.println(reverseString(str));
			
			sc.close();
		}
}
