package ch07;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Line {
	public void draw() {
		System.out.println("Rect");
	}
}

public class ShapeEx {
	static void func(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape();
		func(s1);
		Shape s2 = new Line(); func(s2);
		Shape s3 = new Rect(); func(s3);
		
		Shape[] s = new Shape[3];
		s[0] = new Shape();
		s[1] = new Line();
		s[2] = new Rect();
		for(Shape ss:s) {
			ss.draw();
		}
		
//		Shape s1 = new Shape();
//		s1.draw();
//		
//		Shape s2 = new Line();
//		s2.draw();
//		
//		Shape s3 = new Rect();
//		s3.draw();
	}

}
