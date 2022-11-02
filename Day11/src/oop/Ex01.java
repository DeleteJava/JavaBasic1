package oop;

class Person {
	String name;
	int age;
	double height;
	
	void showInfo() {			// void showInfo(Person this)
		String result = "%s (%d세, %.1fcm)\n";
		
		System.out.printf(result, name, age, height);
		// 지역변수가 아닌데 name 등을 사용 -> 멤버 변수를 사용하는 것
	}
	
	void study(String sub) {	// void study(Person this, String sub)
		String result = "%s(이)가 %s 과목을 공부한다\n";
		
		System.out.printf(result, name, sub);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p;			// 참조 변수 : 인스턴스를 재사용하기 위해서 가리키는 변수
		
		p = new Person();	// new로 만들어진 공간 : 인스턴스
							// - 만들어진 인스턴스는 참조변수에 대입해서 가리켜 놔야 재사용 가능
		
		p.name = "홍길동";
		p.age = 15;
		p.height = 162.3;
		
		System.out.println("p의 이름 : " + p.name + "\n");
		
		p.showInfo();		// showInfo(p);
		
		p.study("Java");	// study(p, "Java");
	}
}
