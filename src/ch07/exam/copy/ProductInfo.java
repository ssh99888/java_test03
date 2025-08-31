package ch07.exam.copy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ProductInfo {
	static Scanner sc;
	static HashMap<Integer, Product> hashmap;
	static Iterator<Integer> it;
	static Set<Integer> keys;
	static int cnt = 0;
	
	static void input() {
		System.out.print("상품의 종류선택 : 1 책 | 2 앨범 | 3 회화책 >>");
		int num = sc.nextInt();
		
		System.out.print("상품설명>>");
		sc.nextLine();
		String comment = sc.nextLine();
		System.out.print("생산자>>");
		String productor = sc.next();
		System.out.print("가격>>");
		int price = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("책제목>>");
			sc.nextLine();
			String title = sc.nextLine();
			System.out.print("저자>>");
//			sc.nextLine();
			String author = sc.next();
			hashmap.put(++cnt, new Book(cnt, comment, productor, price, title, author));
			break;
		case 2:
			System.out.print("앨범제목>>");
			sc.nextLine();
			String albumTitle = sc.nextLine();
			System.out.print("가수>>");
//			sc.nextLine();
			String singer = sc.next();
			hashmap.put(++cnt, new CompackDisk(cnt, comment, productor, price, albumTitle, singer));
			break;
		case 3:
			System.out.print("책제목>>");
			sc.nextLine();
			title = sc.nextLine();
			System.out.print("저자>>");
			author = sc.nextLine();
			System.out.print("언어>>");
			String language = sc.next();
			hashmap.put(++cnt, new ConversationBook(cnt, comment, productor, price, title, author, language));
			break;
		default:
			System.out.println("입력 오류");
		}
	}
	static void search() {
		while(true) {
			System.out.print("상품아이디>>");
			int key = sc.nextInt();
			if(key==0)
				break;
			boolean flag = hashmap.containsKey(key);
			if(flag)
				hashmap.get(key).display();
			else
				System.out.println("찾는 값이 없습니다.");
			System.out.println();
		}
	}
	static void allShow() {
		keys = hashmap.keySet();
		it = keys.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			hashmap.get(key).display();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
//		Product[] products = new Product[10];
		hashmap = new HashMap<>();
		
		boolean flag = false;
		
		while(true) {
			System.out.println("------------------------------------------");
			System.out.println("1 상품추가 | 2 상품조회 | 3 모든 상품조회 | 4 끝내기");
			System.out.println("------------------------------------------");
			System.out.print("선택 >>");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				input();
				break;
			case 2:
				search();
				break;
			case 3:
				allShow();
				break;
			case 4:
				flag = true;
				break;
			default:
				System.out.println("입력오류");
			}
			if(flag) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
