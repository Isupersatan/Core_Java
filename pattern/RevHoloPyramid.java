package pattern;

public class RevHoloPyramid {
	
public static void main(String[] args) {
		
		int n = 5,space = 0,star=n*2-1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++)	System.out.print(" ");
			for(int j=1;j<=star;j++) {
				if(i==1||j==1||j==star) {
					System.out.print("X");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			space++;
			star-=2;
		}
	}
}
