package array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// PDF 6p)
		int[] score = new int[5];
		int sum = 0, max = 0, min = 9999999;
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 학생 점수 : ");
			score[i] = sc.nextInt();
			
			// 합계
			sum += score[i];
			
			// 최대, 최소
			if (max < score[i]) { max = score[i]; }
			if (min > score[i]) { min = score[i]; }
		}
		
		
		System.out.println("\n학생 점수)");
		System.out.println(Arrays.toString(score));
		
		double avg = (double)sum / score.length;
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg + "\n");
		
		System.out.println("1등 : " + max);
		System.out.println("꼴등 : " + min);
		
		
		// 선택 정렬 : 앞의 데이터와 나머지 남은 뒷 데이터들을 비교하며 정렬
		for (int i = 0; i < score.length - 1; i++) {		// 가장 처음부터 마지막 전(n - 1)까지
			for (int j = i + 1; j < score.length; j++) {	// i 다음 부터 마지막(n)까지
				
				if (score[i] > score[j]) {					// 앞(i) 데이터가 뒷(j) 데이터보다 크면 교체
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		System.out.println("\n정렬 후 점수)");
		System.out.println(Arrays.toString(score));
		
		sc.close();
	}
}
