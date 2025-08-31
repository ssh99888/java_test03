package ch11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("c:/sh/java_work/test3.txt");
			while((c=in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
