package oop;

class Po {
	int x, y;
	
	void showPoint() {
		System.out.printf("(%d, %d)\n", x, y);
	}
	
	Po addPoint(Po p) {		// this = p1, p = p2
		Po tmp = new Po();
		
		tmp.x = this.x + p.x;
		tmp.y = this.y + p.y;
		
		return tmp;
	}
}

public class Quiz {
	public static void main(String[] args) {
		// 2차원 좌표를 표현할 객체를 클래스로 선언한다
		// - 아래 코드가 실행될 수 있게 클래스를 만들어 주세요~
		Po p1 = new Po();
		Po p2 = new Po();
		
		p1.x = 6;
		p1.y = 3;
		
		p2.x = 1;
		p2.y = 4;
		
		p1.showPoint();		// (6, 3)
		p2.showPoint();		// (1, 4)
		
		
		// 아래 힌트 : 반환형을 잘 생각해보세요~
		Po p3 = p1.addPoint(p2);	// p1 + p2
		
		p3.showPoint();		// (7, 7)
		
	}
}
