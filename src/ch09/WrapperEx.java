package ch09;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer i = new Integer(10);
		Integer i = Integer.valueOf(10);
		Character ch = Character.valueOf('A');
		Double d = Double.valueOf(3.5);
				
		int i3 = i.intValue();
		char ch3 = ch.charValue();
		double d3 = d.doubleValue();
		
		Integer i2 = 10;
		Character ch2 = 'A';
		Double d2 = 3.5;
		
		int i4 = i;
		char ch4 = ch;
		double d4 = d;
		
		Integer i5 = i4;
		Character ch5 = ch4;
		Double d5 = d4;
		String s1 = "123";
		String s2 = "true";
		String s3 = "3.5";
		int i10 = Integer.parseInt(s1);
		boolean b10 = Boolean.parseBoolean(s2);
		double d10 = Double.parseDouble(s3);
		System.out.println(i10);
		System.out.println(b10);
		System.out.println(d10);
		
		String s11 = Integer.toString(i10);
		String s12 = Boolean.toString(b10);
		String s13 = Double.toString(d10);

	}

}
