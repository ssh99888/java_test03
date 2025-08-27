package ch07;

class Person2 {
	private String name;
	private int age;
	private String gender;
	
	public Person2() {
		System.out.println("Person의 default 생성자");
	}
	public Person2(String name, int age, String gender) {
		super(); // object의 default생성자 호출. 생략가능
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void display() {
		System.out.println(name+" "+age+" "+gender);
	}
}

class Student2 extends Person2 {
	private int sno;
	private String major;
	
	public Student2() {
		System.out.println("Student의 default 생성자");
	}
	public Student2(int sno, String major, String name, int age, String gender) {
		super(name, age, gender);
		this.sno = sno;
		this.major = major;
	}
	public void studentDisplay() {
		System.out.print(sno+" "+major+" ");
		display();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p = new Person2("kim",20,"w");
		p.display();
		
		Student2 s1 = new Student2();
		s1.studentDisplay();
		
		Student2 s2 = new Student2(1,"com","Hong",20,"m");
		s2.studentDisplay();
		
	}

}
