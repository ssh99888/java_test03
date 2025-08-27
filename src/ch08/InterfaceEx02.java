package ch08;

interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface {
	public void play();
	public void stop();
}
class PDA {
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르릉따르릉~~");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자갑니다.");
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자왔어요.");
	}
	
	//추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합ㄴ디ㅏ.");
	}
	
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면 "+ phone.calculate(3, 5));
		phone.schedule();

	}

}
