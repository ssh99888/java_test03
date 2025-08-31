package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("c:/sh/java_work/test001.out");
			int n=0, c;
			while((c=fin.read()) != -1) {
				System.out.println((byte)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
