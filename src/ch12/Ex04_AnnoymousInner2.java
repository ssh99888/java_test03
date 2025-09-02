package ch12;

interface Unit4{
	void move();
}

class HumanCamp4{
	private int speed = 10;
	public Unit4 getMarine() {
		return new Unit4() {

			@Override
			public void move() {
				// TODO Auto-generated method stub
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n",speed);
			}
			
		};
	}
}

public class Ex04_AnnoymousInner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanCamp4 hc = new HumanCamp4();
		Unit4 unit = hc.getMarine();
		unit.move();

	}

}
