package dsa.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab*");
		Matcher m = p.matcher("aabbbbbabbbbbbabbbbb");
		
		int count = 0;
		while(m.find()) {
			count++;
			System.out.println(m.start());
			System.out.println(m.group());
			System.out.println(m.end()-1);
		}
		System.out.println(count+" matches found");
	}
}
