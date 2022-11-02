package oop;

class Person {
	String name;
	int age;
	double height;
	
	void showInfo() {			// void showInfo(Person this)
		String result = "%s (%d��, %.1fcm)\n";
		
		System.out.printf(result, name, age, height);
		// ���������� �ƴѵ� name ���� ��� -> ��� ������ ����ϴ� ��
	}
	
	void study(String sub) {	// void study(Person this, String sub)
		String result = "%s(��)�� %s ������ �����Ѵ�\n";
		
		System.out.printf(result, name, sub);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p;			// ���� ���� : �ν��Ͻ��� �����ϱ� ���ؼ� ����Ű�� ����
		
		p = new Person();	// new�� ������� ���� : �ν��Ͻ�
							// - ������� �ν��Ͻ��� ���������� �����ؼ� ������ ���� ���� ����
		
		p.name = "ȫ�浿";
		p.age = 15;
		p.height = 162.3;
		
		System.out.println("p�� �̸� : " + p.name + "\n");
		
		p.showInfo();		// showInfo(p);
		
		p.study("Java");	// study(p, "Java");
	}
}
