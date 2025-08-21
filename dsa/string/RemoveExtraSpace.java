package dsa.string;

import java.util.Scanner;

public class RemoveExtraSpace {
	
	static String remove(String s) {
		
		StringBuilder sb = new StringBuilder();
		boolean space = false;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				sb.append(c);
				space = false;
			}else if(!space){
				sb.append(' ');
				space = true;
			}
		}
		return sb.toString().trim();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println(remove(s));
		sc.close();
	}
}
