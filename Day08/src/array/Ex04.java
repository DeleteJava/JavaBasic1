package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 자바에서 빈 배열은 쓰레기 값이 아니라
		// 각 타입의 '기본값'이 채워진다
		// ※ 기본값은 부정에 가까운 값이다
		
		boolean[] bos = new boolean[3];
		char[] chs = new char[3];
		int[] its = new int[3];
		double[] dbs = new double[3];
		
		String[] sts = new String[3];
		
		
		System.out.println("bos = " + Arrays.toString(bos));
		System.out.println("chs = " + Arrays.toString(chs));
		System.out.println("its = " + Arrays.toString(its));
		System.out.println("dbs = " + Arrays.toString(dbs));
		System.out.println("sts = " + Arrays.toString(sts));
		
//		System.out.println("sts = " + "[null, null, null]");
	}
}
