package method;

public class Ex02 {
	
	// 매개변수(parameter) : 메서드에 전달된 값을 저장하는 변수. 종속문장에서 사용 가능
	static void hello(int n) {	
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(3);	// 전달인자(arguments) : 메서드 호출시 메서드에 전달하는 값
		
		hello(1);
		
		hello(4);
		
		
		// 매개변수, 전달인자 팁)
		// 1. 전달인자와 매개변수는 개수 및 자료형을 일치시킨다
		// 2. 매개변수에는 전달인자가 순서대로 채워진다
		
		// - 아래는 잘못된 예시
		// hello();			// 1. 개수 불일치 -> 전달인자 부족
		// hello(1, 2);		// 2. 개수 불일치 -> 전달인자 과다
		// hello(2.0);		// 3. 자료형 불일치
	}
}
