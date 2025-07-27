package pattern;

public class Pyramid {
	
	public static void main(String[] args) {
		
		int n = 5,space = n-1,star=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=space;j++)	System.out.print(" ");
			for(int j=1;j<=star;j++)	System.out.print("X");
			
			System.out.println();
			space--;
			star+=2;
		}
	}
}