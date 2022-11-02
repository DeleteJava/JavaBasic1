package loop;

public class Quiz3 {
	public static void main(String[] args) {
		// pdf 15p)
		int money = 1;		// 예금액
		int total = 0;		// 총액
		
		for (int day = 1; day <= 30; day++) {
			
			total += money;
			
			// String result = "%d일차) 예금액 : %d원, 총액 : %d원\n";
			// System.out.printf(result, day, money, total);
			
			money *= 2;
		}
		
		
		System.out.println("결과 : " + total + "원");
	}
}
