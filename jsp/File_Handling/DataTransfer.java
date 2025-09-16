package jsp.File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataTransfer {

	public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\KIIT0001\\Desktop\\"
				+ "Jspider_Softwares\\java note\\jsp.java");
		FileOutputStream f2 = new FileOutputStream("C:\\Users\\KIIT0001\\Desktop\\"
				+ "Jspider_Softwares\\java note\\jSpider.txt",true);
		
		int n = f1.read();
		while(n!=-1) {
			f2.write(n);
			n=f1.read();
		}
		f1.close();
		f2.close();
	}
}
