package ch12;

interface Human1{
	int MAN = 1;
	int WOMAN = 2;
}

interface Machine1{
	int TANK = 1;
	int AIRPKANE = 2;
}

public class Ex01_Constants {
	
	public static void createUnit(int kind) {
		switch(kind) {
		case Machine1.TANK: System.out.println("탱크를 만듭니다"); break;
		case Machine1.AIRPKANE: System.out.println("비행기를 만듭니다."); break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUnit(Machine1.TANK);
		createUnit(Human1.WOMAN);

	}

}
