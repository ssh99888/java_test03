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
			fin = new FileInputStream("c:/sh/java_work/a03.jpg");
			fout = new FileOutputStream("c:/sh/java_work/3.jpg");
			long start = System.currentTimeMillis();
			System.out.println("복사직전 시간 : "+start);
			int c;
			while((c=fin.read()) != -1) {
				fout.write((byte)c);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사 후 시간 : "+end);
			System.out.println("파일복사에 걸린 시간 : "+(end-start));
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
