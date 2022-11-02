package loop;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// do ~ while 	: while에서 조건식과 종속문장이 순서가 바뀐 구문
		//
		// while 		: 조건식 -> 종속문장
		// do ~ while	: 종속문장 -> 조건식
		//
		// 종속문장을 먼저 수행하기 때문에 '최초 1번은 무조건 실행'된다는 특징을 가진다 
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		do {
			System.out.print("정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		
		} while (n != 0);
		
		
		sc.close();
	}
}
