package array;

public class Ex02 {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 10,20,30,40,50 };
		//						 0  1  2  3  4 (= index, ������ȣ)
		
		
		// �迭�� ����� �����͸� '���(elements)'��� �Ѵ�
		// - �� ��ҿ� �����ϱ� ���ؼ� '���� ����'�� 'index'�� �ʿ��ϴ�
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[4] = " + arr[4]);
		
		// System.out.println("arr[5] = " + arr[5]);
		// - ������ �ʰ��ϴ� index�� ����~
		
		
		System.out.println("arr�� ũ�� : " + arr.length + "\n");
		// - �ڹ��� �迭���� ��ü������ ũ�⸦ �����ϰ� �ִ�
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
