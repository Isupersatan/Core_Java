package jsp.num.automorphic;
import java.util.Scanner;
public class MethodAutoNum {

	public static boolean isAuto(int n) {
		int sq=n*n;
		while(n != 0) {
			if(n%10!=sq%10)	return false;
			n/=10;
			sq/=10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Num");
		int num = sc.nextInt();
		System.out.println(isAuto(num));
		sc.close();
	}
}
