package dsa.string;

import java.util.Scanner;

public class MinOccureChar {
	static char findMin(String s) {
		char [] a=s.toLowerCase().toCharArray();
		char minChar = ' ';
		int minCount = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') continue;
			int count = 1;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=' ';
				}
			}
			
			if(count<minCount) {
				minCount=count;
				minChar=a[i];
			}
		}
		return minChar;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("MAX occurance Char: "+findMin(str));
		sc.close();
	}
}
