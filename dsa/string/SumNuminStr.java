package dsa.string;

import java.util.Scanner;

public class SumNuminStr {
	
	static int sumOfNum(String s) {
		char [] a = s.toCharArray();
		int sum=0,i=0;
		while(i<a.length) {
			int n=0;
			while(i<a.length && a[i]>='0'&& a[i]<='9') {
				n=(n*10)+(a[i]-'0');
				i++;
			}
		sum+=n;
		i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a srting");
		String str = sc.nextLine();
		System.out.println(sumOfNum(str));
		sc.close();
	}
}
