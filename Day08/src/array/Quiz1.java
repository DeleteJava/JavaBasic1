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
			System.out.print(i + 1 + "��° �л� ���� : ");
			score[i] = sc.nextInt();
			
			// �հ�
			sum += score[i];
			
			// �ִ�, �ּ�
			if (max < score[i]) { max = score[i]; }
			if (min > score[i]) { min = score[i]; }
		}
		
		
		System.out.println("\n�л� ����)");
		System.out.println(Arrays.toString(score));
		
		double avg = (double)sum / score.length;
		
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg + "\n");
		
		System.out.println("1�� : " + max);
		System.out.println("�õ� : " + min);
		
		
		// ���� ���� : ���� �����Ϳ� ������ ���� �� �����͵��� ���ϸ� ����
		for (int i = 0; i < score.length - 1; i++) {		// ���� ó������ ������ ��(n - 1)����
			for (int j = i + 1; j < score.length; j++) {	// i ���� ���� ������(n)����
				
				if (score[i] > score[j]) {					// ��(i) �����Ͱ� ��(j) �����ͺ��� ũ�� ��ü
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		System.out.println("\n���� �� ����)");
		System.out.println(Arrays.toString(score));
		
		sc.close();
	}
}
