package ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Employee> map = new HashMap<>();
		map.put("홍길동", new Employee(1,"홍길동","영업부",500));
		map.put("김길동", new Employee(2,"김길동","기획부",600));
		map.put("이길동", new Employee(3,"이길동","영업부",700));
		map.put("박길동", new Employee(4,"박길동","홍보부",800));
		map.put("최길동", new Employee(5,"최길동","홍보부",400));
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("사원의 이름을 입력하세요");
			String key = sc.next();
			if(key.equals("그만"))
				break;
			
			boolean flag = map.containsKey(key);
			if(flag)
				System.out.println(map.get(key));
			else
				System.out.println("찾는 데이터가 없습니다.");
		}

		sc.close();
	}

}
