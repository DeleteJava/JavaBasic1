package array;

public class Ex02 {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 10,20,30,40,50 };
		//						 0  1  2  3  4 (= index, 순서번호)
		
		
		// 배열에 저장된 데이터를 '요소(elements)'라고 한다
		// - 이 요소에 접근하기 위해선 '참조 변수'와 'index'가 필요하다
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[4] = " + arr[4]);
		
		// System.out.println("arr[5] = " + arr[5]);
		// - 범위를 초과하는 index는 에러~
		
		
		System.out.println("arr의 크기 : " + arr.length + "\n");
		// - 자바의 배열에는 자체적으로 크기를 저장하고 있다
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
