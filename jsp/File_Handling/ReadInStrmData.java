//read the file by using InputStream
package jsp.File_Handling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadInStrmData {

	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\KIIT0001\\Desktop\\"
				+ "Jspider_Softwares\\java note\\jsp.java");
		
		int n = f.read();
		
		while(n!=-1) {
			System.out.print((char)n);
			n=f.read();
		}
		f.close();
	}
}
