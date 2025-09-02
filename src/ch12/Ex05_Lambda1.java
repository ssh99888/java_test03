package ch12;

interface Unit5{
	void move(String s);
}

class Human5 implements Unit5{

	@Override
	public void move(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	
}

public class Ex05_Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit5 unit = new Human5();
		unit.move("Lambda:Unit5");

	}

}
