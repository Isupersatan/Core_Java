package dsa.string;

public class CharAdd {
	
	static char add(char c1,char c2) {
		if(!(c1>='0'&& c1<='9' && c2>='0'&& c2<='9')) return 'X';
		char res = (char)(((c1-'0')+(c2-'0'))+'0');
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(add('1','1'));
	}
}
