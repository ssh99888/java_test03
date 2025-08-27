package ch08;

abstract class Shape {
	int x; int y;
	public void paint() {
		System.out.println("그리기");
	}
	public abstract void drau();
}

class Line extends Shape {

	@Override
	public void drau() {
		// TODO Auto-generated method stub
		
	}
	
}
class Rect extends Shape {

	@Override
	public void drau() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Abc {
	public void func1() {
		System.out.println("Abc");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Line();
		Shape s2 = new Rect();
		s1.paint();
		s1.drau();
		s2.paint();
		s2.drau();

	}

}
