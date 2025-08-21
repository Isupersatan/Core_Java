package dsa.string;

import java.util.Scanner;

public class CountSubString {
	
	static void count(String s) {
		String[] s1 = s.split(" ");
		
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=="")	continue;
			int count = 1;
			
			for(int j=i+1;j<s1.length;j++) {
				
				if(s1[i].equals(s1[j])) {
					count++;
					s1[j]="";
				}
			}
			System.out.println(s1[i]+" = "+count);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		count(s);
		sc.close();
	}
}
