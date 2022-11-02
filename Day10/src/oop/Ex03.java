package oop;

// class Person {
//		클래스는 같은 패키지 간에 공유가 된다
// }

public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p1.age = 30;
		
		p2.name = "김길동";
		p2.age = 17;
		
		
		p1.show();
		p2.show();
		
		
		p1.eat("치킨");
		p2.eat("보쌈");
	}
}
