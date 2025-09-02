package ch11.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import ch10_exam.Student;

public class StudentFileIOEx {
	static ArrayList<Student> aStudent = null;
	static Scanner sc = null;
	static int cnt = 0;
	
	private void rankPro() {
		for(int i=0; i<aStudent.size(); i++) {
			for(int j=0; j<aStudent.size(); j++) {
				aStudent.get(i).setRank(aStudent.get(j));
			}
		}
	}
	
	private void input() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/sh/java_work/student.txt"));
			String s = null;
			while((s=br.readLine())!= null) {
				StringTokenizer st = new StringTokenizer(s," ");
				String name = st.nextToken();
				int sno = Integer.parseInt(st.nextToken());
				String major = st.nextToken();
				int score[] = new int[3];
				for(int i=0; i<score.length; i++) {
					score[i] = Integer.parseInt(st.nextToken());
				}
				aStudent.add(new Student(name, sno, major, score));
			}
			rankPro();
			System.out.println("데이터 로드 끝");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private void search() {
		while(true) {
			System.out.print("이름>> ");
			String name = sc.next();
			if(name.equals("exit"))
				break;
			
			boolean flag = false;
			for(int i=0; i<aStudent.size(); i++) {
				Student s = aStudent.get(i);
				if(s.getName().equals(name)) {
					s.display();
					flag = true;
				}
			}
			if(!flag) {
				System.out.println("데이터를 찾지 못했습니다.");
			}
		}
		System.out.println("검색종료");
	}
	public void allShow() {
		System.out.println("이름\t학번\t전공\t자바\tDB\t파이썬\t평균\t순위");
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/sh/java_work/result.txt");
			for(int i=0; i<aStudent.size(); i++) {
				Student std = aStudent.get(i);
				System.out.println(std);
				fw.write(std.toString()+"\n");
			}
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private void run() {
		aStudent = new ArrayList<>();
		sc = new Scanner(System.in);
		boolean flag = false;
		
		while(true) {
			System.out.print("입력(1),조회(2),전체보기(3),종료(4) ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: input(); break;
			case 2: search(); break;
			case 3: allShow(); break;
			case 4: flag = true; break;
			default:
				System.out.println("입력오류");				
			}
			if(flag) {
				break;
			}
		}
		System.out.println("종료합니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentFileIOEx ex = new StudentFileIOEx();
		ex.run();

	}

}
