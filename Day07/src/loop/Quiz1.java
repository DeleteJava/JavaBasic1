package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
		// ex) 입력 : 5 -> 출력 : 1 2 3 4 5
		// ex) 입력 : 6 -> 출력 : 1 2 3 4 5 6
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1. 정수 입력 : ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// 2. 정수를 입력 받아서 약수를 출력
		// ex) 입력 : 5 -> 출력 : 1 5
		// ex) 입력 : 6 -> 출력 : 1 2 3 6
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.printf("(%d개)\n", count);
		
		
		// 3. 정수를 입력 받아서 소수를 판별
		// ex) 입력 : 5 -> 출력 : 소수
		// ex) 입력 : 6 -> 출력 : 소수 아님
		if (count == 2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수 아님");
		}
		
		sc.close();
	}
}
