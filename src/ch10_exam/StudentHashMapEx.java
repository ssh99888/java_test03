package ch10_exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class StudentHashMapEx {
	static Scanner sc;
	static HashMap<String, Student> map;
	
	static void rankPro() {
		Set<String> keys = map.keySet();
		Iterator<String> it1 = keys.iterator();
		
		Set<String> keys2 = map.keySet();
		Iterator<String> it3 = keys2.iterator();
		
		while(it1.hasNext()) {
			String key1 = it1.next();
			Iterator<String> it2 = keys.iterator();
			while(it2.hasNext()) {
				String key2 = it2.next();
				map.get(key1).setRank(map.get(key2));
			}
		}
		while(it3.hasNext()) {
			String key3 = it3.next();
			Iterator<String> it4 = keys2.iterator();
			while(it4.hasNext()) {
				String key4 = it4.next();
				map.get(key3).setRank(map.get(key4));
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
			map.put(name, new Student(name,sno,major,score));
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
			boolean flag = map.containsKey(name);
			if(flag)
				map.get(name).display();
			else
				System.out.println("데이터를 찾지 못했습니다.");
		}
		System.out.println("검색종료");
	}
	static void allShow() {
		System.out.println("이름\t학번\t전공\t자바\tDB\t파이썬\t평균\t순위");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(map.get(key));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map = new HashMap<>();
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
