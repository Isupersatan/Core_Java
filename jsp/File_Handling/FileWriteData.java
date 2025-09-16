//writing the data in file by using FileWriter Class
package jsp.File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteData {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\KIIT0001\\Desktop\\Jspider_Softwares"
				+ "\\java note\\jsp.txt");
		
		FileWriter f = new FileWriter(file);
		
		if(file.canWrite()) {
			f.write("Jspider\n");
			f.write("Qspider\n");
			f.write("PYspider\n");
		}else	System.out.println("Not Writable");
		
		f.close();
	}
}
