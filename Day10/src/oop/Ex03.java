package oop;

// class Person {
//		Ŭ������ ���� ��Ű�� ���� ������ �ȴ�
// }

public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "ȫ�浿";
		p1.age = 30;
		
		p2.name = "��浿";
		p2.age = 17;
		
		
		p1.show();
		p2.show();
		
		
		p1.eat("ġŲ");
		p2.eat("����");
	}
}
