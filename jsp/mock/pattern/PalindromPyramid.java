package jsp.mock.pattern;

public class PalindromPyramid {
	
public static void main(String[] args) {
		
		int n = 5,space = n-1,star=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=space;j++)	System.out.print(" ");
			int p = 0;
			for(int j=1;j<=star;j++) {
				if(j<=i) {
					System.out.print(j);
					p=j;
				}else {
					System.out.print(--p);
				}
				
			}
			
			System.out.println();
			space--;
			star+=2;
		}
	}
}
