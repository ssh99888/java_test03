package ch09;

class Rect {
	private int width;
	private int height;
	private int area;
	
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.area = this.width * this.height;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Rect r = (Rect)obj;
		if(this.area==r.area)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + ", area=" + area + "]";
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect(4,5);
		Rect r2 = new Rect(5,4);
		Rect r3 = new Rect(3,6);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1==r2);
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));

	}

}
