package array;

public class Ex01 {
	public static void main(String[] args) {
		// 변수 : 데이터를 저장하는 공간. 단일 값
		// 배열 : '같은 자료형'으로 메모리상 연속된 공간. 복수 값
		
		int n = 10;
		
		int[] arr1 = new int[] { 10,20,30,40,50 };
		// - 배열은 참조형 변수
		
		int[] arr2 = arr1;
		
		int[] arr3 = new int[] { 10,20,30,40,50 };
		
		System.out.println("n = " + n);
		System.out.println("arr1 = " + arr1);
		System.out.println("arr2 = " + arr2);
		System.out.println("arr3 = " + arr3);
		// - 참조형 변수는 '해시코드'라는 이상한 값이 출력된다
		// - 자바에 객체를 구분하기 위한 값 (※ 메모리 주소 아님!!!)
		
	}
}
