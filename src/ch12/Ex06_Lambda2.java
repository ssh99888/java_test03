package ch12;

interface Unit6{
	void move(String s);
}

public class Ex06_Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit6 unit = new Unit6() {

			@Override
			public void move(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}
			
		};
		unit.move("Lambda:Unit6");
	}

}
