package method;

// 메서드의 종류
// 1. 반환값이 없는 메서드 : void형 메서드. 코드만 실행하고 돌려주는 결과가 없다
// 2. 반환값이 있는 메서드 : void를 제외한 모든 자료형. 코드 실행 후의 결과를 되돌려 준다

public class Ex01 {
	static void printNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		return;		// return은 메서드를 '즉시' 종료 후 작성된 값을 돌려준다
					// 값을 생략시 종료하는 용도로 사용 가능
	}
	
	static int total(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// void형 메서드는 그냥 '이름만 호출'해서 사용한다
		printNumber(5);
		printNumber(10);
		
		
		// 반환형이 있는 메서드는 결과를 돌려주기 때문에
		// 1. 변수에 저장 받거나
		int n = total(5);
//		int n = 15;
		
		
		System.out.println("\n결과 n = " + n);
		
		// 2. 다른 메서드의 전달값으로 바로 써버린다
		System.out.println("total(10) = " + total(10));
//		System.out.println("total(10) = " + 55);
		
		
		// 연습
		n = total(total(3));
//		n = total(6);
//		n = 21;
		
		
		System.out.println("\nn = " + n);  // ?
		
		
	}
}
