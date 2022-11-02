package array2;

public class Ex02 {
	public static void main(String[] args) {
		// 2차원 빈 배열
		int[][] arr = new int[3][5];	// [행][열]
										// 행 : 1차원 배열의 개수
										// 열 : 1차원 배열 안의 요소 개수
		
		System.out.println("arr 크기 : " + arr.length);
		System.out.println("arr[0] 크기 : " + arr[0].length + "\n");
		
		arr[1][1] = 5;
		arr[2][3] = 10;
		arr[0][2] = 123;
		
		for (int i = 0; i < arr.length; i++) {				// 행 반복
			for (int j = 0; j < arr[i].length; j++) {		// 열 반복
				
				System.out.printf("%3d ", arr[i][j]);
			}
			
			System.out.println();
		}
		
		
	}
}
