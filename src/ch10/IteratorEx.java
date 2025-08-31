package ch10;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}

	}

}
