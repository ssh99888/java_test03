package ch08;

interface PhoneInterface {
	final int TIMEOUT = 100000; //상수 필드 선언
	void sendCall(); //추상 메소드
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}
	
	//메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
