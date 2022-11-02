package array2;

public class Quiz {
	public static void main(String[] args) {
		// PDF 9, 10p)
		int n = 8, count = 1;
		int[][] arr = new int[n][n];
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = count++;
				
				System.out.printf("%2d ", arr[i][j]);
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		// 2¹ø)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", arr[j][i]);
			}
			System.out.println();
		}
	}
}
