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
		
		System.out.println(speed + " km/h ����!");
		
		showCar();	// ����� �� pythontutor�� Ȯ��!!!
	}
	
	void _break(int speed) {
		this.speed -= speed;
		
		System.out.println(speed + " km/h ����!");
		
		showCar();
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		// �Ʒ� �ڵ尡 ����ǰ� Ŭ������ �ۼ��� �ּ���~
		Car morning = new Car("���");	// �� �ʵ�� �𵨸�, �ӵ��� ������
		
		morning.showCar();				// ��� (0 km/h)
		
		
		morning.accel(30);				// 30 km/h ����!
										// ��� (30 km/h)
		
		morning._break(10); 			// 10 km/h ����!
										// ��� (20 km/h)
		
		
		
		
		
	}
}
