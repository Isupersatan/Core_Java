// reverse a string
package dsa.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		System.out.println("The reversed string is "+revString(str));
		sc.close();
	}
	
	static String revString(String s) {
		char [] a = s.toCharArray();
		int i=0, j=a.length-1;
		while(i<j) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		String str = new String(a);
		return str;
	}
	
}
