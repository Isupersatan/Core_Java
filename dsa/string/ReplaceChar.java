//Replacing a Char without using replace()-method.
package dsa.string;

public class ReplaceChar {
	
	static String replace(String s) {
		char[] a = s.toCharArray();
		for(int i=0; i<a.length; i++) {
			if(a[i]=='o')	a[i]='@';
		}
		String str = new String(a);
		return str;
	}
	
	public static void main(String[] args) {
		String str = "Pool";
		System.out.println(str);
		System.out.println("Replaced string is "+replace(str));
	}
}
