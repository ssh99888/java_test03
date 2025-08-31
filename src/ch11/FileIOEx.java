package ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("c:/sh/java_work/abc.jpg");
			fout = new FileOutputStream("c:/sh/java_work/aaa.jpg");
			int c;
			while((c=fin.read()) != -1) {
				fout.write((byte)c);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
