package array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		
		// �� �迭
		// - �迭�� �̸� �ʱ�ȭ�� �����ϸ�, ����ִ� �迭�� ���� ����
		
		int[] arr1 = new int[] { 10,20,30 };
		// - �ʱ�ȭ, ũ�⸦ �ۼ��ϸ� �ȵȴ�
		
		int[] arr2 = new int[5];
		// - �� �迭, ũ�⸦ �ۼ��ؾ� �Ѵ�
		
		System.out.println("arr1 ũ�� : " + arr1.length);
		System.out.println("arr2 ũ�� : " + arr2.length + "\n");
		
		
		// �� �ڹٿ��� �迭�� �� �� ���ϰ� ����� �� �ְ��ϴ� �����ִ�
		// - Arrays��� Ŭ������ ����
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2));
		// - toString() : ��Ҹ� ���ڿ��� ����� ��ȯ���ش�
	}
}
