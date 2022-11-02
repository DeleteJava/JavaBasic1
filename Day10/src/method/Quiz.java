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
			if (result < arr[i]) {		// 너가 나보다 큰 값?
				result = arr[i];		// 너가 최대값
			}
		}
		
		return result;
	}
	
	
	static boolean isPrime(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {		// 약수이면
				count++;			// 개수를 증가
			}
		}
		
		// 약수가 2개?
		if (count == 2) {
			return true;	// 너 소수
		}
		
		
		return false;		// 넌 소수 아님
	}
	
	
	public static void main(String[] args) {
		// 아래 메서드가 실행되게 해주세요~
		//
		// 1. 절대값을 반환하는 메서드
		int n = absolute(-5);
		
		System.out.println("1. n = " + n);
		System.out.println("1. absolute(5) = " + absolute(5));
		
		
		// 2. 전달한 배열의 합계를 반환
		int[] arr = new int[] { 5, 11, 1, 33, 9 };
		
		System.out.println("\n2. 결과 : " + totalArr(arr));
		
		
		// 3. 전달한 배열에 요소중 최대값을 찾아서 반환
		int max = maxArr(arr);
		
		System.out.println("\n3. 결과 : " + max);

		
		// 4. 전달한 정수가 소수인지 판별하는 메서드
		boolean prime = isPrime(7);
		
		System.out.println("\n4. prime = " + prime); 			// true
		System.out.println("4. isPrime(6) = " + isPrime(6));	// false
		System.out.println();
		
		
		// 참고) 4번 메서드를 활용
		// 1 ~ n 사이의 소수를 모두 출력한다
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
