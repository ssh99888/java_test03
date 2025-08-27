package ch07;

public class Researcher extends Person{
	public Researcher() {
		System.out.println("Researcher 생성자");
	}
}
class Professor extends Researcher {
	public Professor() {
		System.out.println("Professor 생성자");
	}
}