package array2;

public class Ex02 {
	public static void main(String[] args) {
		// 2���� �� �迭
		int[][] arr = new int[3][5];	// [��][��]
										// �� : 1���� �迭�� ����
										// �� : 1���� �迭 ���� ��� ����
		
		System.out.println("arr ũ�� : " + arr.length);
		System.out.println("arr[0] ũ�� : " + arr[0].length + "\n");
		
		arr[1][1] = 5;
		arr[2][3] = 10;
		arr[0][2] = 123;
		
		for (int i = 0; i < arr.length; i++) {				// �� �ݺ�
			for (int j = 0; j < arr[i].length; j++) {		// �� �ݺ�
				
				System.out.printf("%3d ", arr[i][j]);
			}
			
			System.out.println();
		}
		
		
	}
}
