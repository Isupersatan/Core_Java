package dsa.string;

import java.util.Scanner;

public class CountVowCons {
	
	static void count(String s) {
		char [] a = s.toLowerCase().toCharArray();
		int vow=0,cons=0;
		
		for(int i=0;i<a.length;i++) 
			if(a[i]>='a'&&a[i]<='z') 
				if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
					vow++;
				else		cons++;
		
		System.out.println("Vowels count="+vow);
		System.out.println("Consonent count="+cons);	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a srting");
		String str = sc.nextLine();
		count(str);
		sc.close();
	}
}
