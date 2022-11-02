package oop;

class Person {
	// 1. �ʵ� : ��� ������ ǥ��
	String name;
	int age;
	
	
	// 2. �޼��� : ��� �Լ��� ǥ��
	void show() {			// void show(Person this)

		// System.out.printf("%s (%d��)\n", this.name, this.age);
		
		System.out.printf("%s (%d��)\n", name, age);
		// - ���������� ��������� �̸��� ��ġ�� ������ this�� ������ �� �ִ� 
	}
	
	void eat(String food) {	// void eat(Person this, String food)
		
		String result = "%s(��)�� %s(��)�� �Դ´�. �ȳ�\n";
		
		System.out.printf(result, name, food);
	}
}


public class Ex02 {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "ȫ�浿";	// �ν��Ͻ��� ����� ���ٽ�
		p.age = 23;			// ���� ������ . ������(= ��� ���� ������)�� ���
		
		System.out.println("p�� �̸� : " + p.name);
		System.out.println("p�� ���� : " + p.age + "\n");
		
		
		p.show();		// show(p);
		
		p.eat("ġŲ");	// eat(p, "ġŲ");
		
		p.eat("����");
		
		
		
	}
}
