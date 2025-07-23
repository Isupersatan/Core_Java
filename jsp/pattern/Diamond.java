package jsp.pattern;

public class Diamond {

	public static void main(String[] args) {
			
			int n = 5;
			if(n%2==0)	n++;
			
			int space = n/2,star=1;
			
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=space;j++)	System.out.print(" ");
				for(int j=1;j<=star;j++)	System.out.print("X");
				
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

