//Input: Hello World Output:He121 W2r3d. 
package dsa.string;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println(convert(s));
		sc.close();
	}
	
	static String convert(String s) {
		char[] a = s.toCharArray();
		for(int i=0;i<a.length;i++) {
			char count = '1';
			if(a[i]>='0' && a[i]<='9')	continue;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])	a[j]= ++count;
			}
			
			if(count != '1')	a[i]='1';
		}
		return new String(a);
	}
}
