package dsa.string;

import java.util.Scanner;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println(remove(s));
		sc.close();

	}
	static String remove(String s) {
		String[] a = s.split(" ");
		String s1="";
		for(int i=0;i<a.length;i++) {
			if(a[i]=="") continue;
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j]))
					a[j]="";
			}
			s1+=a[i];
			if(i<a.length)	s1+=" ";
		}
		return s1;
	}
}
