package oop;

// 생성자 : 인스턴스 생성시 최초 한번만 실행되는 메서드
// - 주로, 필드를 초기화 하는 용도로 자주 사용된다
// - 생성자를 하나도 작성하지 않으면 '자바 컴파일러'가 자동으로 하나 만들어준다
// - 이를, '기본 생성자'라고 한다

class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Human() {
		name = "무명";
		age = -1;
	}
	
	Human(String name) {
		this.name = name;
		age = -1;
	}

	void showInfo() {
		String result = "%s (%d세)\n";
		
		System.out.printf(result, name, age);
	}
}

public class Ex02 {
	public static void main(String[] args) {
		
		Human h1 = new Human("홍길동", 31);
		Human h2 = new Human("김길동", 25);
		
		Human h3 = new Human();
		
		h1.showInfo();
		h2.showInfo();
		
		h3.showInfo();
		
		
		// 연습) 아래 코드가 실행되게 해주세요~
		Human h4 = new Human("이순신");
		
		h4.showInfo();	// 이순신 (-1세)
		
		
		
		
	}
}
