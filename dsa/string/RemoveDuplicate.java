package dsa.string;

import java.util.Scanner;

public class RemoveDuplicate {
	static String remove(String s) {
		char [] a = s.toLowerCase().toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]==' ') continue;
			for(int j=i+1;j<a.length;j++) 
				if(a[i]==a[j])	a[j]=' ';
			
		}
		return new String(a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Updated String: "+remove(str));
		sc.close();
	}
}
