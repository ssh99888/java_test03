package ch10;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1); al.add(3); al.add(5); al.add(7); al.add(9);
		int sum = 0; 
		for(int i=0; i<al.size(); i++) {
			sum += al.get(i);
		}
		System.out.println(sum);
		
		ArrayList<String> as = new ArrayList<>();
		as.add("홍길동");
		as.add("최길동");
		as.add("박길동");
		as.add("이길동");
		as.add("김길동");
		for(int i=0; i<as.size(); i++)
			System.out.println(as.get(i));
		
		ArrayList<Student> a = new ArrayList<>();
		Student s = new Student(1,"홍길동","컴공");
		a.add(s);
		a.add(new Student(2,"춘향이","국어국문"));
		a.add(new Student(3,"똥개","식품영양"));
		a.add(new Student(4,"코난","범죄심리"));
		a.add(new Student(5,"토게","주언"));
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
