package dsa.string;


public class SwapWoutThirdVar {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		s1 = s1 + s2;
		s2 = s1.replace(s2,"");
		s1 = s1.replace(s2,"");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
