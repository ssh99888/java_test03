package ch10;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		System.out.println();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(1,40);
		v.remove(2);
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
//		System.out.println(v.get(0));
//		System.out.println(v.get(1));
//		System.out.println(v.get(2));
		System.out.println(v.size());
		
		// Vector String 예제
		System.out.println("--------------------------------");
		Vector<String> vs = new Vector<> ();
		vs.add("홍길동");
		vs.add("김다혜");
		vs.add("진영란");
		
		//System.out.println(vs.contains("홍길동"));
		System.out.println(vs.contains("김길동"));
		//System.out.println(vs.elementAt(0));
		//System.out.println(vs.get(0));
		//vs.remove("홍길동");
		Object[] arr =vs.toArray();
		for(Object a:arr) {
			System.out.println(a);
		}
		
		for(int i=0; i<vs.size(); i++) {
			System.out.println(vs.get(i));
		}
		

	}

}
