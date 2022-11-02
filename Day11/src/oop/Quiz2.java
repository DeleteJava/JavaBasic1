package oop;

class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void showCar() {
		String result = "%s (%d km/h)\n\n";
		
		System.out.printf(result, model, speed);
	}
	
	void accel(int speed) {
		this.speed += speed;
		
		System.out.println(speed + " km/h 가속!");
		
		showCar();	// 여기는 꼭 pythontutor로 확인!!!
	}
	
	void _break(int speed) {
		this.speed -= speed;
		
		System.out.println(speed + " km/h 감속!");
		
		showCar();
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// 아래 코드가 실행되게 클래스를 작성해 주세요~
		Car morning = new Car("모닝");	// ※ 필드는 모델명, 속도를 가진다
		
		morning.showCar();				// 모닝 (0 km/h)
		
		
		morning.accel(30);				// 30 km/h 가속!
										// 모닝 (30 km/h)
		
		morning._break(10); 			// 10 km/h 감속!
										// 모닝 (20 km/h)
		
		
		
		
		
	}
}
