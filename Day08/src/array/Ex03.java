package array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		
		// 빈 배열
		// - 배열은 미리 초기화도 가능하며, 비어있는 배열도 선언 가능
		
		int[] arr1 = new int[] { 10,20,30 };
		// - 초기화, 크기를 작성하면 안된다
		
		int[] arr2 = new int[5];
		// - 빈 배열, 크기를 작성해야 한다
		
		System.out.println("arr1 크기 : " + arr1.length);
		System.out.println("arr2 크기 : " + arr2.length + "\n");
		
		
		// ※ 자바에선 배열을 좀 더 편하게 사용할 수 있게하는 도구있다
		// - Arrays라는 클래스가 있음
		
		System.out.println("arr1 = " + Arrays.toString(arr1));
		System.out.println("arr2 = " + Arrays.toString(arr2));
		// - toString() : 요소를 문자열로 만들어 반환해준다
	}
}
