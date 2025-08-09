package dsa.string;

import java.util.Scanner;

public class MaxOccureChar {
	static char findMax(String s) {
		char [] a=s.toLowerCase().toCharArray();
		char maxChar = ' ';
		int maxCount = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') continue;
			int count = 1;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=' ';
				}
			}
			
			if(count>maxCount) {
				maxCount=count;
				maxChar=a[i];
			}
		}
		return maxChar;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("MAX occurance Char: "+findMax(str));
		sc.close();
	}
}
