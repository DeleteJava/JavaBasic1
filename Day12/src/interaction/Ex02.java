package interaction;

// ���� �ٸ� ��ü ���� ��ȣ�ۿ�
// - ���, �ڵ��� ��ü�� ����� ��ȣ�ۿ��� ����
// - �ڵ����� ���(= ������)�� ������ �ڵ����� ����� ����� �� ���� �Ѵ�

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
		
		String name = (driver == null) ? "����" : driver.name;
		
		System.out.printf(result, model, speed, name);
	}
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("�����ڰ� �����ϴ�!!!");
			showCar();
			
			return;
		}
		
		
		this.speed += speed;
		
		System.out.println(speed + " km/h ��ŭ ����!!!");
		showCar();
	}
	
	void _break(int speed) {
		if (driver == null) {
			System.out.println("�����ڰ� �����ϴ�!!!");
			showCar();
			
			return;
		}
		
		
		this.speed -= speed;
		
		System.out.println(speed + " km/h ��ŭ ����!!!");
		showCar();
	}
	
	void rideOn(Person driver) {
		this.driver = driver;
		
		System.out.println(driver.name + "�� ž��!!!");
		
		showCar();
	}

	void rideOff() {
		if (speed != 0) {
			System.out.println("���� �� ������ �ּ���!!!");
			showCar();
			return;
		}
		
		System.out.println(driver.name + "���� ���� �߽��ϴ�~");
		driver = null;
		
		showCar();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person hong = new Person("ȫ�浿");
		Car morning = new Car("���");
		
		
		morning.showCar();
		
		morning.accel(30);
		
		morning.rideOn(hong);
		
		morning.accel(20);
		
		morning._break(20);		// ���� �޼���, �����ڰ� �־����
		
		morning.rideOff();
		// ���� �޼���. ��, �ӵ��� 0�� �ƴϸ� ���� �Ұ���
		
		
	}
}
