package array;

public class Ex01 {
	public static void main(String[] args) {
		// ���� : �����͸� �����ϴ� ����. ���� ��
		// �迭 : '���� �ڷ���'���� �޸𸮻� ���ӵ� ����. ���� ��
		
		int n = 10;
		
		int[] arr1 = new int[] { 10,20,30,40,50 };
		// - �迭�� ������ ����
		
		int[] arr2 = arr1;
		
		int[] arr3 = new int[] { 10,20,30,40,50 };
		
		System.out.println("n = " + n);
		System.out.println("arr1 = " + arr1);
		System.out.println("arr2 = " + arr2);
		System.out.println("arr3 = " + arr3);
		// - ������ ������ '�ؽ��ڵ�'��� �̻��� ���� ��µȴ�
		// - �ڹٿ� ��ü�� �����ϱ� ���� �� (�� �޸� �ּ� �ƴ�!!!)
		
	}
}
