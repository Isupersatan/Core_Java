package dsa.string;

import java.util.Scanner;

public class PermutationOfStr {
	
	static String swap(String s,int i,int j) {
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	}
	
	static void permutation(String s,int start,int end) {
		if(start==end) {
			System.out.print(s+" ");
			return;
		}
		for(int i=start;i<=end;i++) {
			String s1 = swap(s,start,i);
			permutation(s1, start+1, end);
		}
	}
	
	static void permutation(String s) {
		permutation(s, 0, s.length()-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		permutation(str);
		sc.close();
	}
}
