package jsp.mock.pattern;

public class HoloDiamond {

	public static void main(String[] args) {
		int n = 19;
		if(n%2==0)	n+=1;
		
		int space = n/2,star=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=space;j++)	System.out.print("X");
			for(int j=1;j<=star;j++) {
				if(j==1 || j==star) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
				
			for(int j=1;j<=space;j++)	System.out.print("X");
			
			System.out.println();
			if(i<=n/2) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
		}
	}
}
