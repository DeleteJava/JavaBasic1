package interaction;

// ��� ���̼� ���� �ְ� �޴� ��ȣ�ۿ��� ����
class Ball {
	String type;
	
	Ball(String type) {
		this.type = type;
	}
}

class Child {
	String name;
	Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		String result = "%s (�� : %s)\n";
		String type = "x";
		
		if (ball != null) { 
			type = ball.type; 
		}
		
		System.out.printf(result, name, type);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;
		
		String result = "\n%s(��)�� %s�� �����\n";
		
		System.out.printf(result, name, ball.type);
	}
	
	void throwBall(Child tar) {		// this = minsu, tar = jinho
		
		tar.ball = ball;
		
		
		String result = "\n%s(��)�� %s���� %s�� ������~\n";
		
		System.out.printf(result, name, tar.name, ball.type);
		
		ball = null;
	}
}

public class Quiz {
	public static void main(String[] args) {
		Child minsu = new Child("�μ�");
		Child jinho = new Child("��ȣ");
		
		minsu.showInfo(); 		// �μ� (�� : x)
		jinho.showInfo();		// ��ȣ (�� : x)
		
		Ball base = new Ball("�߱���");
		
		
		minsu.takeBall(base);	// �μ��� �߱����� �����!
		
		minsu.showInfo(); 		// �μ� (�� : �߱���)
		jinho.showInfo();		// ��ȣ (�� : x)
		
		
		minsu.throwBall(jinho);	// �μ��� ��ȣ���� �߱����� ����
		
		
		minsu.showInfo(); 		// �μ� (�� : x)
		jinho.showInfo();		// ��ȣ (�� : �߱���)
		
	}
}
