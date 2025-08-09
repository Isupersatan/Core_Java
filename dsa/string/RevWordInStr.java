package dsa.string;

import java.util.Scanner;

public class RevWordInStr {
	//without using split()
	static String revWords(String s) {
		char [] a = s.toCharArray();
		int i=0,j=0;
		while(i<a.length) {
			while(j<a.length && a[j]!=' ')	j++;
			
			int k = j-1;
			while(i<k) {
				char temp = a[i];
				a[i]=a[k];
				a[k]=temp;
				i++;
				k--;
			}
			
			j++;
			i=j;
		}
		return new String(a);
	}
	
	
	//using split()
	static String revWords2(String s) {
		String [] s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			char[] a = s1[i].toCharArray();
			int j=0,k=a.length-1;
			while(j<k) {
				char temp = a[j];
				a[j]=a[k];
				a[k]=temp;
				j++;
				k--;
			}
			s1[i]=new String(a);
		}
		return String.join(" ", s1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		System.out.println(revWords2(str));
		
		sc.close();
	}
}
