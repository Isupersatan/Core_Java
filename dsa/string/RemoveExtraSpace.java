package dsa.string;

import java.util.Scanner;

public class RemoveExtraSpace {
	
	static String remove(String s) {
		
		String s1="";
		boolean space = false;
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c!=' ') {
				s1+=c;
				space = false;
			}else if(!space){
				s1+=' ';
				space = true;
			}
		}
		return s1.trim();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		System.out.println(remove(s));
		sc.close();
	}
}
