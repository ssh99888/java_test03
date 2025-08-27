package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query = "name = kit&addr = seoul&age = 21";
		StringTokenizer st = new StringTokenizer(query,"&=");
		String[] arrStr = query.split("&=");
		
		for(int i=0; i<arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		
		int count = st.countTokens();
		System.out.println(count);
//		for(int i=0; i<count; i++) {
//			System.out.println(st.nextToken());
//		}
		st.nextToken();
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
