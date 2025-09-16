package jsp.File_Handling;

import java.io.*;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\KIIT0001\\Desktop\\"
							+ "Jspider_Softwares\\java note\\jsp.java");
		FileReader f = new FileReader(file);
		BufferedReader bf = new BufferedReader(f);
		if(file.canRead()) {
			String s = bf.readLine();
			while(s!=null) {
				System.out.println(s);
				s = bf.readLine();
			}
		}else System.out.println("Not Readable!!!");
		bf.close();
	}
}
