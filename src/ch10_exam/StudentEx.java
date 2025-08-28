package ch10_exam;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
	static Scanner sc;
	static ArrayList<Student> aStudent;
	
	static void rankPro() {
		for(int i=0; i<aStudent.size(); i++) {
			for(int j=0; j<aStudent.size(); j++) {
				aStudent.get(i).setRank(aStudent.get(j));
			}
		}
	}
	
	static void input() {
		while(true) {
			int score[] = new int[3];
			System.out.print("이름,학번,전공,성적3개 입력>> ");
			String name = sc.next();
			if(name.equals("exit"))
				break;
			int sno = sc.nextInt();
			String major = sc.next();
			for(int i=0; i<score.length; i++) {
				score[i] = sc.nextInt();
			}
			aStudent.add(new Student(name,sno,major,score));
		}
		rankPro();
		System.out.println("데이터 입력완료");
	}
	
	static void search() {
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
	
	static void allShow() {		
		System.out.println("이름\t학번\t전공\t자바\tDB\t파이썬\t평균\t순위");
		for(int i=0; i<aStudent.size(); i++) {
			System.out.println(aStudent.get(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
