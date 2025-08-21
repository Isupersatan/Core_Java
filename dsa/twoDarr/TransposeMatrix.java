package dsa.twoDarr;
import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] b = new int[a.length][a.length];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		for(int[] n:b)	System.out.println(Arrays.toString(n));
	}
}
