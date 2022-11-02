package method;

public class Ex03 {
	
	static void adder(int n1, int n2) {
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
		System.out.printf("%d + %d = %d\n\n", n1, n2, n1 + n2);
	}
	
	
	public static void main(String[] args) {
		// - 매개변수에는 전달인자가 순서대로 채워진다~
		adder(5, 6);
		
		adder(6, 5);
		
		// - 아래는 잘못된 구문
		// adder(5);		// 개수 불일치
		// adder(5, 6.0);	// 자료형 불일치
		
	}
}
