package ch09;

class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point o = (Point) obj;
		if((this.x==o.x) && (this.y==o.y)) {
			return true;
		}
//		else {
//			return false;
//		}
		return false;
	}
	
//	public String toString() {
//		return "("+x+","+y+")";
//	}
}

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss1 = "abc";
		String ss2 = "abc";
		String ss3 = "bbc";
		String ss4 = new String("abc");
		String ss5 = new String("abc");
		System.out.println(ss4==ss5);
		System.out.println(ss4.equals(ss5));
		
		System.out.println(ss1==ss2);
		System.out.println(ss1.equals(ss2));
				
		Point p = new Point(2,3);
		Point p1 = new Point(2,3);
		Point p3 = new Point(3,4);
		Point p2 = p;
		System.out.println(p.equals(p1));
		System.out.println(p.equals(p3));
		System.out.println(p==p1);
		System.out.println(p==p2);
		
		String s1 = p + "점";
		String s2 = p.toString() + "점";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);

	}

}
