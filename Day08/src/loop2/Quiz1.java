package loop2;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 1번)
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("몇 줄? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		// 2번)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3번)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 4번)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// ex) 기타 별찍기들
		// 1. 피라미드
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 2. ㅁ 찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if (i == 0 || i == 4 || j == 0 || j == 4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3. + 찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 4. x 찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j | i + j == 4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		sc.close();
	}
}
