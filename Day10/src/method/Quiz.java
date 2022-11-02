package method;

public class Quiz {
	
	static int absolute(int n) {
		
		if (n < 0) {
			return -n;
		}
		
		return n;
	}
	
	
	static int totalArr(int[] arr) {
		int result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
	
		return result;
	}
	
	
	static int maxArr(int[] arr) {
		int result = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (result < arr[i]) {		// �ʰ� ������ ū ��?
				result = arr[i];		// �ʰ� �ִ밪
			}
		}
		
		return result;
	}
	
	
	static boolean isPrime(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {		// ����̸�
				count++;			// ������ ����
			}
		}
		
		// ����� 2��?
		if (count == 2) {
			return true;	// �� �Ҽ�
		}
		
		
		return false;		// �� �Ҽ� �ƴ�
	}
	
	
	public static void main(String[] args) {
		// �Ʒ� �޼��尡 ����ǰ� ���ּ���~
		//
		// 1. ���밪�� ��ȯ�ϴ� �޼���
		int n = absolute(-5);
		
		System.out.println("1. n = " + n);
		System.out.println("1. absolute(5) = " + absolute(5));
		
		
		// 2. ������ �迭�� �հ踦 ��ȯ
		int[] arr = new int[] { 5, 11, 1, 33, 9 };
		
		System.out.println("\n2. ��� : " + totalArr(arr));
		
		
		// 3. ������ �迭�� ����� �ִ밪�� ã�Ƽ� ��ȯ
		int max = maxArr(arr);
		
		System.out.println("\n3. ��� : " + max);

		
		// 4. ������ ������ �Ҽ����� �Ǻ��ϴ� �޼���
		boolean prime = isPrime(7);
		
		System.out.println("\n4. prime = " + prime); 			// true
		System.out.println("4. isPrime(6) = " + isPrime(6));	// false
		System.out.println();
		
		
		// ����) 4�� �޼��带 Ȱ��
		// 1 ~ n ������ �Ҽ��� ��� ����Ѵ�
		int count = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if (isPrime(i)) {
				System.out.printf("%3d ", i);
				count++;
				
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		
		
	}
}
