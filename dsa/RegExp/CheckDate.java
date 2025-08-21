package dsa.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {
	
	public static void main(String[] args) {
		System.out.println(isDate("2003"));
	}
	
	static boolean isDate(String s) {
		Pattern p = Pattern.compile("(200[0-9])");
		Matcher m = p.matcher(s);
		
		return m.matches();
	}
}
