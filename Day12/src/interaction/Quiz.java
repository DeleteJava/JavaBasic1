package interaction;

// 어린이 둘이서 공을 주고 받는 상호작용을 구성
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
		String result = "%s (공 : %s)\n";
		String type = "x";
		
		if (ball != null) { 
			type = ball.type; 
		}
		
		System.out.printf(result, name, type);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;
		
		String result = "\n%s(이)가 %s을 얻었다\n";
		
		System.out.printf(result, name, ball.type);
	}
	
	void throwBall(Child tar) {		// this = minsu, tar = jinho
		
		tar.ball = ball;
		
		
		String result = "\n%s(이)가 %s에게 %s을 던졌다~\n";
		
		System.out.printf(result, name, tar.name, ball.type);
		
		ball = null;
	}
}

public class Quiz {
	public static void main(String[] args) {
		Child minsu = new Child("민수");
		Child jinho = new Child("진호");
		
		minsu.showInfo(); 		// 민수 (공 : x)
		jinho.showInfo();		// 진호 (공 : x)
		
		Ball base = new Ball("야구공");
		
		
		minsu.takeBall(base);	// 민수가 야구공을 얻었다!
		
		minsu.showInfo(); 		// 민수 (공 : 야구공)
		jinho.showInfo();		// 진호 (공 : x)
		
		
		minsu.throwBall(jinho);	// 민수가 진호에게 야구공을 던짐
		
		
		minsu.showInfo(); 		// 민수 (공 : x)
		jinho.showInfo();		// 진호 (공 : 야구공)
		
	}
}
