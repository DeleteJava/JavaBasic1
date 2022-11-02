package method;

public class Quiz {
	
	static void printNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	static void compare(int n1, int n2) {
		int big = (n1 > n2) ? n1 : n2;
		
		System.out.printf("%d, %d 중 큰 수는 %d\n", n1, n2, big);
	}
	
	static void printArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 1. 1 ~ n까지 일렬로 출력하는 메서드
		printNumber(5); 		// 1 2 3 4 5
		printNumber(3); 		// 1 2 3
		
		System.out.println();

		// 2. 두 정수를 전달해서 큰 수를 출력하는 메서드
		compare(5, 6); 			// 6
		compare(6, 5); 			// 6
		compare(6, 6); 			// 6
		
		System.out.println();

		// 3. 전달한 배열을 일렬로 출력
		// ※ 자료형을 잘 보세요~
		int[] arr = new int[] { 10, 50, 30, 20, 70 };

		printArr(arr); 			// 10 50 30 20 70

	}
}
