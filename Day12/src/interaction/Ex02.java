package interaction;

// 서로 다른 객체 간의 상호작용
// - 사람, 자동차 객체를 만들고 상호작용을 구성
// - 자동차에 사람(= 운전자)이 없으면 자동차의 기능을 사용할 수 없게 한다

class Person {
	String name;
	
	Person(String name) {
		this.name = name;
	}
}

class Car {
	String model;
	int speed;
	Person driver;
	
	
	Car(String model) {
		this.model = model;
	}
	
	void showCar() {
		String result = "%s (%d km/h, %s)\n\n";
		
		String name = (driver == null) ? "없음" : driver.name;
		
		System.out.printf(result, model, speed, name);
	}
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			showCar();
			
			return;
		}
		
		
		this.speed += speed;
		
		System.out.println(speed + " km/h 만큼 가속!!!");
		showCar();
	}
	
	void _break(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			showCar();
			
			return;
		}
		
		
		this.speed -= speed;
		
		System.out.println(speed + " km/h 만큼 감속!!!");
		showCar();
	}
	
	void rideOn(Person driver) {
		this.driver = driver;
		
		System.out.println(driver.name + "님 탑승!!!");
		
		showCar();
	}

	void rideOff() {
		if (speed != 0) {
			System.out.println("정차 후 하차해 주세요!!!");
			showCar();
			return;
		}
		
		System.out.println(driver.name + "님이 하차 했습니다~");
		driver = null;
		
		showCar();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person hong = new Person("홍길동");
		Car morning = new Car("모닝");
		
		
		morning.showCar();
		
		morning.accel(30);
		
		morning.rideOn(hong);
		
		morning.accel(20);
		
		morning._break(20);		// 감속 메서드, 운전자가 있어야함
		
		morning.rideOff();
		// 하차 메서드. 단, 속도가 0이 아니면 하차 불가능
		
		
	}
}
