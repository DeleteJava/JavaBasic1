package method;

// �޼����� ����
// 1. ��ȯ���� ���� �޼��� : void�� �޼���. �ڵ常 �����ϰ� �����ִ� ����� ����
// 2. ��ȯ���� �ִ� �޼��� : void�� ������ ��� �ڷ���. �ڵ� ���� ���� ����� �ǵ��� �ش�

public class Ex01 {
	static void printNumber(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		return;		// return�� �޼��带 '���' ���� �� �ۼ��� ���� �����ش�
					// ���� ������ �����ϴ� �뵵�� ��� ����
	}
	
	static int total(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		// void�� �޼���� �׳� '�̸��� ȣ��'�ؼ� ����Ѵ�
		printNumber(5);
		printNumber(10);
		
		
		// ��ȯ���� �ִ� �޼���� ����� �����ֱ� ������
		// 1. ������ ���� �ްų�
		int n = total(5);
//		int n = 15;
		
		
		System.out.println("\n��� n = " + n);
		
		// 2. �ٸ� �޼����� ���ް����� �ٷ� �������
		System.out.println("total(10) = " + total(10));
//		System.out.println("total(10) = " + 55);
		
		
		// ����
		n = total(total(3));
//		n = total(6);
//		n = 21;
		
		
		System.out.println("\nn = " + n);  // ?
		
		
	}
}
