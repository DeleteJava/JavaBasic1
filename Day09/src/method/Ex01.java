package method;

// 함수(function)	: 일정 길이의 코드를 저장해두고 재사용 하는 방식
// 메서드(method)	: 클래스 안에 작성된 함수를 메서드라고 하며, '객체 지향'의 개념이 추가된 것 


public class Ex01 {
	
	// 메서드의 선언 : 함수를 생성한 것
	static void hello() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello();	// 메서드의 호출 : 앞서 작성해둔 메서드를 사용하는 것
	
		hello();	// 메서드의 재사용성 : 한번 작성해둔 메서드는 몇번이건 사용 가능
		
		hello();
		
		// 실행 과정)
		// 1. 메서드가 호출되면 현재 위치(= 줄)를 기억하고 메서드로 이동한다
		// 2. 이동 후 메서드는 위에서 아래로 순차적으로 수행한다
		// 3. 메서드가 종료 후 1번에서 기억한 위치로 되돌아가서 남은 코드를 이어서 수행한다
	}
}
