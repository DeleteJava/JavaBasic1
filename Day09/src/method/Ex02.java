package method;

public class Ex02 {
	
	// �Ű�����(parameter) : �޼��忡 ���޵� ���� �����ϴ� ����. ���ӹ��忡�� ��� ����
	static void hello(int n) {	
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(3);	// ��������(arguments) : �޼��� ȣ��� �޼��忡 �����ϴ� ��
		
		hello(1);
		
		hello(4);
		
		
		// �Ű�����, �������� ��)
		// 1. �������ڿ� �Ű������� ���� �� �ڷ����� ��ġ��Ų��
		// 2. �Ű��������� �������ڰ� ������� ä������
		
		// - �Ʒ��� �߸��� ����
		// hello();			// 1. ���� ����ġ -> �������� ����
		// hello(1, 2);		// 2. ���� ����ġ -> �������� ����
		// hello(2.0);		// 3. �ڷ��� ����ġ
	}
}
