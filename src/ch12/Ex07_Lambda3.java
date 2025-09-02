package ch12;

interface Unit7{
	void move(String s);
}

public class Ex07_Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit7 unit = (String s) -> {
			System.out.println(s);
		};
		Unit7 unit2 = s-> System.out.println(s);	
		
		unit.move("Lambda:Unit7");
		unit2.move("aaabbb");
	}

}
