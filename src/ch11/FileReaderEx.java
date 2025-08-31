package ch11;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin=null;
		try {
			fin = new FileReader("C:/sh/java_work/test.txt");
			char[] buf = new char[10];
			int c;
			
			while((c = fin.read(buf)) != -1) {
				System.out.println(c);
				System.out.print(buf);
			} 
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}

}
