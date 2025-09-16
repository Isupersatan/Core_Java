package jsp.File_Handling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\KIIT0001\\Desktop\\Jspider_Softwares"
				+ "\\java note\\jsp.txt");
		
		//System.out.println(f.mkdir());//to create folder
		//System.out.println(f.createNewFile());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		
		File f1 = new File("C:\\Users\\KIIT0001\\Desktop\\Jspider_Softwares"
				+ "\\java note\\jSpider.txt");
		
		System.out.println(f.renameTo(f1));
	}
}
