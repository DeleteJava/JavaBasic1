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
		
		System.out.printf("%d, %d �� ū ���� %d\n", n1, n2, big);
	}
	
	static void printArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// 1. 1 ~ n���� �Ϸķ� ����ϴ� �޼���
		printNumber(5); 		// 1 2 3 4 5
		printNumber(3); 		// 1 2 3
		
		System.out.println();

		// 2. �� ������ �����ؼ� ū ���� ����ϴ� �޼���
		compare(5, 6); 			// 6
		compare(6, 5); 			// 6
		compare(6, 6); 			// 6
		
		System.out.println();

		// 3. ������ �迭�� �Ϸķ� ���
		// �� �ڷ����� �� ������~
		int[] arr = new int[] { 10, 50, 30, 20, 70 };

		printArr(arr); 			// 10 50 30 20 70

	}
}
