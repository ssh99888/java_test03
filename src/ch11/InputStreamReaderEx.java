package ch11;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader rd = new InputStreamReader(System.in);
		while(true) {
			System.out.println("키보드 입력");
			try {
				int c = rd.read();
				System.out.println((char)c);
				if(c == -1)
					break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
