package ch09;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("java");
		
		StringBuffer sb1 = new StringBuffer("This");
		System.out.println(sb1.hashCode());
		System.out.println(sb1.capacity());
		sb1.append(" is pencil.");
		System.out.println(sb1.hashCode());
		System.out.println(sb1.capacity());
		sb1.insert(7, " my");
		System.out.println(sb1);
		sb1.replace(8, 10, "your");
		System.out.println(sb1);
		sb1.append("StringBuffer 용량크기 변경");
		System.out.println(sb1.capacity());
		String str = sb1.toString();

	}

}
