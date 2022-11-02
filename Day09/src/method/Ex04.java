package method;

// 메서드의 종류
// 1. 반환값이 없는 메서드 : void형 메서드. 메서드를 실행만 하고 결과값이 없음
// 2. 반환값이 있는 메서드 : void를 제외한 모든 자료형. 메서드를 실행 후 얻은 결과를 돌려준다
//
// ※ 반환값 : 메서드의 결과값을 의미

public class Ex04 {
	
	static void adder1(int n1, int n2) {
		System.out.printf("n1 + n2 = %d\n", n1 + n2);
	}
	
	static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;		// return : 메서드를 '즉시' 종료하며 
						//			작성된 값을 호출한 위치에 돌려준다
	}
	
	public static void main(String[] args) {
		
		// void형 메서드는 돌려주는 값이 없으므로 '그냥 이름만 호출'해서 사용한다
		adder1(5, 4);
		
		// 반환형이 있는 메서드는 실행 결과를 돌려준다. 따라서,
		// 1. 변수에 저장을 받거나
		// 2. 바로 사용한다
		
		int n = adder2(5, 4);
//		int n = 9;
		
		System.out.println("결과 n = " + n);
		
		
		System.out.println("adder2(7, 1) = " + adder2(7, 1));
//		System.out.println("adder2(7, 1) = " + 8);
	}
}
