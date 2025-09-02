package ch11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("c:/sh/java_work/a03.jpg"));
			bos = new BufferedOutputStream(new FileOutputStream("c:/sh/java_work/a04.jpg"));
			long start = System.currentTimeMillis();
			System.out.println("시작전 시간 : "+start);
			/*
			int i;
			while((i=bis.read())!= -1) {
				bos.write(i);
			}
			*/
			byte [] buf= new byte [1024*10]; // 10KB 버퍼
			while(true) {
				int n = bis.read(buf); // 버퍼크기만큼읽기. n은실제읽은바이트
				bos.write(buf, 0, n); // buf[0]부터n 바이트쓰기
				if(n < buf.length)
					break; // 버퍼크기보다작게읽었기때문에파일끝에도달. 복사종료
			}
			
			long end = System.currentTimeMillis();
			System.out.println("복사 후 시간 : "+end);
			System.out.println("복사에 걸린시간 : "+(end-start));
			bis.close();
			bos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
