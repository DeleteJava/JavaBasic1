package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// pdf 14p) 1, 2, 3
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if (i % 3 == 0 && i % 5 == 0) {
				// 빈 구문 자체가 의미가 있다
			}
			else if (i % 3 == 0) {
				continue;
			}
			
			sum += i;
			
			// 디버깅 코드)
			// System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		
		
		System.out.println("결과 : " + sum);
	}
}
