package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3+5";
		StringTokenizer st1 = new StringTokenizer(str,"+-*/%",true);
		int num1 = Integer.parseInt(st1.nextToken());
		String op = st1.nextToken();
		int num2 = Integer.parseInt(st1.nextToken());
		
		switch(op) {
		case "+": System.out.println(num1+num2); break;
		case "-": System.out.println(num1-num2); break;
		case "*": System.out.println(num1*num2); break;
		case "/": System.out.println(num1/num2); break;
		case "%": System.out.println(num1%num2); break;
		}
		
		System.out.println(num1);
		System.out.println(op);
		System.out.println(num2);
		
		String names = "홍길동, 김다혜,진영랑 이정은";
		String[] arrStr = names.split(", ");
		StringTokenizer st = new StringTokenizer(names,", ",true);
		
		for(int i=0; i<arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
