package num.strong;
import java.util.Scanner;

public class StrongNum {
	
	static int fact(int n) {
		if(n==1 || n==0) return 1;
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		int sum=0, temp = num;
		while(temp != 0) {
			sum += fact(temp%10);
			temp/=10;
		}
		if(sum==num)	System.out.println("its a Strong num");
		else	System.out.println("its not a Strong num");
		
		sc.close();
	}

}
