package method;

public class Ex03 {
	
	static void adder(int n1, int n2) {
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
		System.out.printf("%d + %d = %d\n\n", n1, n2, n1 + n2);
	}
	
	
	public static void main(String[] args) {
		// - �Ű��������� �������ڰ� ������� ä������~
		adder(5, 6);
		
		adder(6, 5);
		
		// - �Ʒ��� �߸��� ����
		// adder(5);		// ���� ����ġ
		// adder(5, 6.0);	// �ڷ��� ����ġ
		
	}
}
