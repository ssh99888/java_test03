package ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferdReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
//		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			br = new BufferedReader(new FileReader("c:/sh/java_work/score.txt"));
			//bw = new BufferedWriter(new FileWriter("c:/sh/java_work/score1.txt"));
			fw = new FileWriter("c:/sh/java_work/score2.txt");
			String s = null;
			while((s=br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(s," ");
				int sno = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				int kor = Integer.parseInt(st.nextToken());
				int eng = Integer.parseInt(st.nextToken());
				int math = Integer.parseInt(st.nextToken());
				System.out.println("sno: "+sno);
				System.out.println("name: "+name);
				System.out.println("kor: "+kor);
				System.out.println("eng: "+eng);
				System.out.println("math: "+math);
				System.out.println();
				fw.write(s+"\n");
			}
			br.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
