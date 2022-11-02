package loop;

public class Ex02 {
	public static void main(String[] args) {
		// 반복문 for : 초기, 조건, 증감식이 한 곳에 몰린 구문
		// - 반복 횟수 파악이 용이하다
		// - 뒤에 배우는 배열 같은 묶음 타입을 반복하는데 유용하다
		
		
		for (int i = 1; i <= 5; i++) {	// (초기값; 조건식; 증감식) { 종속문장; }
			
			System.out.println(i + " : Hello World!!!");
		}

		
		// for문 동작 순서)
		// 초기값 -> 조건식 -> 종속문장 -> 증감식 -> 조건식 -> 종속문장 -> 증감식 ...
		
	}
}
