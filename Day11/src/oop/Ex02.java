package oop;

// ������ : �ν��Ͻ� ������ ���� �ѹ��� ����Ǵ� �޼���
// - �ַ�, �ʵ带 �ʱ�ȭ �ϴ� �뵵�� ���� ���ȴ�
// - �����ڸ� �ϳ��� �ۼ����� ������ '�ڹ� �����Ϸ�'�� �ڵ����� �ϳ� ������ش�
// - �̸�, '�⺻ ������'��� �Ѵ�

class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human() {
		name = "����";
		age = -1;
	}
	
	Human(String name) {
		this.name = name;
		age = -1;
	}

	void showInfo() {
		String result = "%s (%d��)\n";
		
		System.out.printf(result, name, age);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Human h1 = new Human("ȫ�浿", 31);
		Human h2 = new Human("��浿", 25);
		
		Human h3 = new Human();
		
		h1.showInfo();
		h2.showInfo();
		
		h3.showInfo();
		
		
		// ����) �Ʒ� �ڵ尡 ����ǰ� ���ּ���~
		Human h4 = new Human("�̼���");
		
		h4.showInfo();	// �̼��� (-1��)
		
		
		
		
	}
}
