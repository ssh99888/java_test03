package ch12;

enum Human2{MAN, WOMAN}
enum Machine2{TANK, AIRPLANE}
enum DAYS{월,화,수,목,금,토,일}

public class Ex02_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createUnit(Machine2.TANK);
		createUnit(Human2.MAN);
		createUnit(DAYS.금);
		System.out.println(DAYS.values());
	}
	public static void createUnit(DAYS kind) {
		switch(kind) {
		case 월:System.out.println("월요일"); break;
		case 화:System.out.println("화요일"); break;
		case 수:System.out.println("수요일"); break;
		case 목:System.out.println("목요일"); break;
		case 금:System.out.println("금요일"); break;
		case 토:System.out.println("토요일"); break;
		case 일:System.out.println("일요일"); break;
		}
	}
	public static void createUnit(Machine2 kind) {
		switch(kind) {
		case TANK: System.out.println("탱크를 만듭니다."); break;
		case AIRPLANE: System.out.println("비행기를 만듭니다"); break;
		}
	}
	public static void createUnit(Human2 kind) {
		switch(kind) {
		case MAN: System.out.println("남자입니다."); break;
		case WOMAN: System.out.println("여자입니다."); break;
		}
	}
}
