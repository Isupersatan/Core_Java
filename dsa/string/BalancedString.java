package dsa.string;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a string");
		String s = sc.nextLine();
		System.out.println(isBalanced2(s));
		sc.close();
	}
	//without predefined function (Stack)
	static boolean isBalanced2(String s) {
		char[] a=s.toCharArray();
		Stack s1=new Stack();
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			if(c=='('||c=='{'||c=='[')	s1.push(c);
			else if(c==')'||c=='}'||c==']') {
				if(s1.isEmpty()|| !match((Character)s1.pop(),c))
				return false;
			}
		}
		return s1.isEmpty();
		
	}
	
	public static boolean match(char c1,char c2) {
		if(c1=='(' && c2==')') return true;
		if(c1=='{' && c2=='}') return true;
		if(c1=='[' && c2==']') return true;
		
		return false;
	}
	//with predefined function
	static boolean isBalanced(String s) {
		s=removeChar(s);
		if(s.contains("()")||s.contains("{}")||s.contains("[]")) {
			s=s.replace("()", "");
			s=s.replace("{}", "");
			s=s.replace("[]", "");
		}
		return s.length()==0;
	}
	
	static String removeChar(String s) {
		char[] a=s.toCharArray();
		String s1="";
		for(int i=0;i<a.length;i++) {
			if(a[i]=='('||a[i]==')'||a[i]=='{'||a[i]=='}'||a[i]=='['||a[i]==']') {	
				s1+=a[i];
			}
		}
		return s1;
	}
}
