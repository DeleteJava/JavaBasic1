package array;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		// 빈 배열은 보통 나중에 값을 채울때 사용한다
		
		String[] lang = new String[5];
		
		System.out.println("프로그램 언어 : " + Arrays.toString(lang));
	
		
		
		lang[0] = "Java";
		lang[3] = "Python";
		
		System.out.println("프로그램 언어 : " + Arrays.toString(lang));
	}
}
