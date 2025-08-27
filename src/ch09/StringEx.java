package ch09;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = " abc\t\n";
		System.out.println("1:"+x+"end");
		System.out.println("2:"+x.trim()+"end");
		
		String a = "Hello";
		System.out.println(a.hashCode());
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		System.out.println(a.compareTo(c));
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		
		System.out.println(a==c);
		System.out.println(e==f);
		System.out.println(a.equals(c));
		System.out.println(e.equals(f));
		String s=a.concat("Java");
		System.out.println(s);
		a+="Java";
		System.out.println(a);
		System.out.println(a.hashCode());

	}

}
