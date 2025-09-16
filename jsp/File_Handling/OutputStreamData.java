//Writing in the file using OutputStream class
package jsp.File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class OutputStreamData {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\KIIT0001\\Desktop\\Jspider_Softwares"
				+ "\\java note\\jSpider.txt");
		FileOutputStream f = new FileOutputStream(file);
		
		String s = "Java is very Easy";
		
		if(file.canWrite()) {
			byte[] b = s.getBytes();
			f.write(b);
		}else	System.out.println("Not Writable");
		
		f.close();
		
	}
}
