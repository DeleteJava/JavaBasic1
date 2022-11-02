package array2;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		// 1차원 배열 : 같은 타입을 일렬로 한번에 저장
		int[] arr1 = new int[] { 10,20,30,40,50 };
		
		
		// 2차원 배열 : 1차원 배열을 요소로 가진다
		int[][] arr2 = new int[][] { 
			{ 10,20,30,40 },	// 0 행
			{ 11,21,31,41 },	// 1 행
			{ 12,22,32,42 }		// 2 행
		//     0  1  2  3 열	
		};
		
		
		// ※ 위의 arr2는 일렬로 적으면 아래와 같다
		arr2 = new int[][] { { 10,20,30,40 }, { 11,21,31,41 }, { 12,22,32,42 } };
		
		System.out.println("arr2 = " + arr2);
		System.out.println("arr2 = " + Arrays.toString(arr2) + "\n");
		
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");	// [행][열] 이라고 생각하면 쉽다
		
		
		System.out.println("41 = " + arr2[1][3]);
		System.out.println("12 = " + arr2[2][0]);
	}
}
