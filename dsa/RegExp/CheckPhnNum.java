package dsa.RegExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhnNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone number: ");
		String s1 = sc.nextLine();
		
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(s1);
		
		if(m.matches())	System.out.println("Its a Valid Phone number");
		else	System.out.println("Itsa invalid number ");
		sc.close();
	}
}
