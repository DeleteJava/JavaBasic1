package method;

// �޼����� ����
// 1. ��ȯ���� ���� �޼��� : void�� �޼���. �޼��带 ���ุ �ϰ� ������� ����
// 2. ��ȯ���� �ִ� �޼��� : void�� ������ ��� �ڷ���. �޼��带 ���� �� ���� ����� �����ش�
//
// �� ��ȯ�� : �޼����� ������� �ǹ�

public class Ex04 {
	
	static void adder1(int n1, int n2) {
		System.out.printf("n1 + n2 = %d\n", n1 + n2);
	}
	
	static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;		// return : �޼��带 '���' �����ϸ� 
						//			�ۼ��� ���� ȣ���� ��ġ�� �����ش�
	}
	
	public static void main(String[] args) {
		
		// void�� �޼���� �����ִ� ���� �����Ƿ� '�׳� �̸��� ȣ��'�ؼ� ����Ѵ�
		adder1(5, 4);
		
		// ��ȯ���� �ִ� �޼���� ���� ����� �����ش�. ����,
		// 1. ������ ������ �ްų�
		// 2. �ٷ� ����Ѵ�
		
		int n = adder2(5, 4);
//		int n = 9;
		
		System.out.println("��� n = " + n);
		
		
		System.out.println("adder2(7, 1) = " + adder2(7, 1));
//		System.out.println("adder2(7, 1) = " + 8);
	}
}
