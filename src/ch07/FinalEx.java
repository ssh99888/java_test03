package ch07;

class AA {
	public void func1() {
		System.out.println("AA의 func1");
	}
	public void func2() {
		System.out.println("AA의 func2");
	}
}

class BB extends AA {
	public void func1() {
		System.out.println("BB의 func1");
	}
	public void func2() {
		System.out.println("BB의 func2");
	}
}

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
