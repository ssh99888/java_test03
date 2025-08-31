package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("baby", "아기");
		map.put("love", "사랑");
		map.put("apple", "사과");
		
		System.out.println(map.get("baby"));
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+"->"+map.get(key));
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("영어단어를 입력하세요 ");
			String key = sc.next();
			if(key.equals("exit"))
				break;
			System.out.println(map.get(key));
		}
		
		sc.close();
	}

}
