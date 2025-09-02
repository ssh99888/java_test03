package ch12;

class Outer1{
	private int speed = 10;
	
	class MemberInner1{
		public void move() {
			/*
			int sno = 1;
			String name = "홍길동";
			String major = "컴공";
			System.out.printf("헉번은 %d이고 이름은 %s이며, 전공은 %s 입니다.\n",sno,name,major);
			*/
			System.out.printf("이간형 유닛이 %d속도로 이동합니다.\n",speed);
		}
	}
	public void getMarine() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
}

public class Ex01_Memberinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 out = new Outer1();
		out.getMarine();
		
		Outer1.MemberInner1 inner = out.new MemberInner1();
		inner.move();

	}

}
