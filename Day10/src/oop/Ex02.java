package oop;

class Person {
	// 1. 필드 : 멤버 변수로 표현
	String name;
	int age;
	
	
	// 2. 메서드 : 멤버 함수로 표현
	void show() {			// void show(Person this)

		// System.out.printf("%s (%d세)\n", this.name, this.age);
		
		System.out.printf("%s (%d세)\n", name, age);
		// - 지역변수와 멤버변수가 이름이 겹치지 않으면 this를 생략할 수 있다 
	}
	
	void eat(String food) {	// void eat(Person this, String food)
		
		String result = "%s(이)가 %s(을)를 먹는다. 냠냠\n";
		
		System.out.printf(result, name, food);
	}
}


public class Ex02 {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "홍길동";	// 인스턴스의 멤버를 접근시
		p.age = 23;			// 참조 변수와 . 연사자(= 멤버 참조 연산자)를 사용
		
		System.out.println("p의 이름 : " + p.name);
		System.out.println("p의 나이 : " + p.age + "\n");
		
		
		p.show();		// show(p);
		
		p.eat("치킨");	// eat(p, "치킨");
		
		p.eat("피자");
		
		
		
	}
}
