package ch10;

import java.util.Vector;

class Point {
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class VectorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<>();
		Point p1 = new Point(3,2);
		v.add(p1);
		v.add(new Point(5,2));
		v.add(new Point(10,5));

		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
			//System.out.println(v.get(i));
		}
		//v.clear();
		System.out.println(v.size());
	}

}
