package ch12;

public class Ex03_Varges {

	public static void helloEverybody(String...vargs) {
		for(String s:vargs) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}
	public static void intEvery(Integer...vargs) {
		for(Integer i:vargs) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intEvery(1);
		intEvery(1,2,3);
		helloEverybody("홍길동");
		helloEverybody("홍길동","전우치");
		helloEverybody("홍길동","전우치","손오공");

	}

}
