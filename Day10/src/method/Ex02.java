package method;

// 메서드 오버로딩(overloading)
// - 같은 이름의 메서드를 여러개 작성하는 기법
// - 이때, 이름은 같아야하고 매개변수 형태가 달라야 한다
//
// ※ 반환형은 오버로딩에 영향을 주지 않는다


public class Ex02 {
	
	static int adder(int n1, int n2) {
		return n1 + n2;
		
		// ※ return에는 수식을 작성할 수 있다. 단, 딱 하나의 결과만 리턴 가능
	}
	
	static int adder(int n) {
		return n + 1000;
	}
	
	static int adder() {
		return 1000 + 2000;
	}
	
	static double adder(double n) {
		return n + 3.14;
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. 결과 : " + adder(5, 4));
		
		System.out.println("2. 결과 : " + adder(5));
		
		System.out.println("3. 결과 : " + adder());
		
		System.out.println("4. 결과 : " + adder(5.0));

	}
}
