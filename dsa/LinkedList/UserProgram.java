package dsa.LinkedList;

public class UserProgram {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		System.out.println(h.add("ayan"));
		System.out.println(h.add("sayan"));
		System.out.println(h.add("tania"));
		System.out.println(h.add("tushar"));
		System.out.println(h.add("toll"));
		
		
		System.out.println(h.contains("sayan"));
		System.out.println(h.remove("sayan"));
		h.display();
	}
}
