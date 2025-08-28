package ch10;

import java.util.Vector;

class Student {
	private int sno;
	private String name;
	private String major;
	
	public Student() {}
	public Student(int sno, String name, String major) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
	}
	@Override
	public String toString() {
		return sno + " " + name + " " + major;
	}
}

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Student> v = new Vector<>();
		Student s = new Student(1,"홍길동","컴공");
		v.add(s);
		v.add(new Student(2,"춘향이","국어국문"));
		v.add(new Student(3,"똥개","식품영양"));
		v.add(new Student(4,"코난","범죄심리"));
		v.add(new Student(5,"토게","주언"));
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
	}

}
