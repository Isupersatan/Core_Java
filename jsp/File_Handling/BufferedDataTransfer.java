package jsp.File_Handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BufferedDataTransfer {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\KIIT0001\\Desktop\\"
							+ "Jspider_Softwares\\java note\\jsp.java");
		
		File file2 = new File("C:\\Users\\KIIT0001\\Desktop\\"
				+ "Jspider_Softwares\\java note\\jSpider.txt");
		
		FileReader f = new FileReader(file);
		FileWriter f1 = new FileWriter(file2,true);
		
		BufferedReader bf = new BufferedReader(f);
		BufferedWriter bw = new BufferedWriter(f1);
		
		
		if(file.canRead() && file2.canWrite()) {
			String s = bf.readLine();
			while(s!=null) {
				bw.write(s+"\n");
				s = bf.readLine();
			}
		}else System.out.println("Not Readable!!!");
		bf.close();
		bw.close();
	}
}
