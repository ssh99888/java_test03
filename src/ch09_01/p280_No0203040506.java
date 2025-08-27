package ch09_01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p280_No0203040506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 02번
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(str," ");
			int count = st.countTokens();
			System.out.println("어절 개수는 "+count);
		}
		
		// 03번
		int[] ran = new int[3];
		while(true) {
			for(int i=0; i<3; i++) {
				ran[i] = ((int)(Math.random()*3+1));
				System.out.print(ran[i]+"\t");
			}
			System.out.println();
			if(ran[0]==ran[1]&&ran[1]==ran[2]) {
				System.out.println("성공");
				break;
			}			
		}
			
		// 04번
		String str1 = sc.next();
		StringTokenizer st1 = new StringTokenizer(str1,"+");
		int sum=0;
		while(st1.hasMoreTokens()) {
			sum += Integer.parseInt(st1.nextToken());
		}
		System.out.println("합은 " + sum);
		
		// 05번
		
		// 06번
		String[] str = {"가위","바위","보"};
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int rsp = sc.nextInt();
			int comRsp = (int)(Math.random()*3+1);
			
			if(rsp==4) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			if(rsp>4) {
				System.out.println("올바른 숫자를 입력해주세요");
				continue;
			}
			
			System.out.println("사용자 "+str[rsp-1]+" : 컴퓨터 "+str[comRsp-1]);
			
			if(rsp==1&comRsp==3 | rsp==2&comRsp==1 | rsp==3&comRsp==2) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if(rsp==1&comRsp==2 | rsp==2&comRsp==3 | rsp==3&comRsp==1) {
				System.out.println("사용자가 졌습니다.");
			}
			else if(rsp==1&comRsp==1 | rsp==2&comRsp==2 | rsp==3&comRsp==3) {
				System.out.println("비겼습니다");
			}
			
		}
		
	}

}
