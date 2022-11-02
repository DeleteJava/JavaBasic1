package method;

// �޼��� �����ε�(overloading)
// - ���� �̸��� �޼��带 ������ �ۼ��ϴ� ���
// - �̶�, �̸��� ���ƾ��ϰ� �Ű����� ���°� �޶�� �Ѵ�
//
// �� ��ȯ���� �����ε��� ������ ���� �ʴ´�


public class Ex02 {
	
	static int adder(int n1, int n2) {
		return n1 + n2;
		
		// �� return���� ������ �ۼ��� �� �ִ�. ��, �� �ϳ��� ����� ���� ����
	}
	
	static int adder(int n) {
		return n + 1000;
	}
	
	static int adder() {
		return 1000 + 2000;
	}
	
	static double adder(double n) {
		return n + 3.14;
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. ��� : " + adder(5, 4));
		
		System.out.println("2. ��� : " + adder(5));
		
		System.out.println("3. ��� : " + adder());
		
		System.out.println("4. ��� : " + adder(5.0));

	}
}
