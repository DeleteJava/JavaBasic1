package loop;

public class Ex03 {
	public static void main(String[] args) {
		// 지역 변수 : 특정 영역 안에서 생성된 변수
		// - 해당 영역 안에서 생성되며, 그 영역 끝나면 메모리에서 제거된다
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
		
		// System.out.println("반복 후 i = " + i);
		// - i는 현재 for문 안에서 생성됨 -> for의 지역 변수
		// - 따라서, for문이 끝나면 사라진다
		
		
		int i;
		
		for (i = 5; i >= 1; i--) {
			System.out.println(i + " : Hello World!!!");
		}
		
		System.out.println("반복 후  i = " + i);
		// 이쪽의 i는 main에서 생성된 지역 변수
		// - 즉, main이 종료될 때까지 사라지지 않는다
		
	}
}
