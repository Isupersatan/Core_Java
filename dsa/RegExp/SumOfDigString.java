package dsa.RegExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a srting");
		String str = sc.nextLine();
		System.out.println(sumOfDig(str));
		sc.close();
	}
	
	static int sumOfDig(String s) {
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(s);
		
		int sum = 0;
		while(m.find()) {
			sum+=Integer.parseInt(m.group());
		}
		return sum;
	}
}
