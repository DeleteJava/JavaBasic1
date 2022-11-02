package loop2;

public class Ex02 {
	public static void main(String[] args) {
		
		// 1. 중첩 반복을 활용해서 아래 구문을 구구단 2단을 8번 출력한다
		// 2. 1번을 완료 후 구구단 2단 ~ 9단까지 출력되게 한다
		// 3. 역순으로도 해보세요~
		
		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("---------------");
		
		for (int i = 9; i >= 2; i--) {
			
			for (int j = 9; j >= 1; j--) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
