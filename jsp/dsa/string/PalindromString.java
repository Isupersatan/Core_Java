// check a string palindrom or not
package jsp.dsa.string;

import java.util.Scanner;

public class PalindromString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String st = sc.nextLine();
		System.out.println("This is Palindrom:- "+isPalindrome(st));
		sc.close();
	}
	
	static boolean isPalindrome(String s) {
		char[] a = s.toLowerCase().toCharArray();
		int i=0,j=a.length-1;
		while(i<j) {
			 if(a[i]!=a[j]) return false;
			 
			 i++;
			 j--;
		}
		return true;
	}
}
