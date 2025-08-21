package dsa.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigInString {
	
	static int sumOfDig1(String s) {
		int sum=0;
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(s);
		while(m.find()) {
			sum+=Integer.parseInt(m.group());
		}
		
		return sum;
	}
	
	//using String logics 
	static int sumOfDig(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) 
			if(s.charAt(i)<='9'&& s.charAt(i)>='0')	sum+=s.charAt(i)-'0';
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a srting");
		String str = sc.nextLine();
		System.out.println(sumOfDig1(str));
		sc.close();
	}
}
