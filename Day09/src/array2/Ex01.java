package array2;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 1���� �迭 : ���� Ÿ���� �Ϸķ� �ѹ��� ����
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		
		// 2���� �迭 : 1���� �迭�� ��ҷ� ������
		int[][] arr2 = new int[][] { 
			{ 10,20,30,40 },	// 0 ��
			{ 11,21,31,41 },	// 1 ��
			{ 12,22,32,42 }		// 2 ��
		//     0  1  2  3 ��	
		};
		
		
		// �� ���� arr2�� �Ϸķ� ������ �Ʒ��� ����
		arr2 = new int[][] { { 10,20,30,40 }, { 11,21,31,41 }, { 12,22,32,42 } };
		
		System.out.println("arr2 = " + arr2);
		System.out.println("arr2 = " + Arrays.toString(arr2) + "\n");
		
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");	// [��][��] �̶�� �����ϸ� ����
		
		
		System.out.println("41 = " + arr2[1][3]);
		System.out.println("12 = " + arr2[2][0]);
	}
}
