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
		// 2���� ��ǥ�� ǥ���� ��ü�� Ŭ������ �����Ѵ�
		// - �Ʒ� �ڵ尡 ����� �� �ְ� Ŭ������ ����� �ּ���~
		Po p1 = new Po();
		Po p2 = new Po();
		
		p1.x = 6;
		p1.y = 3;
		
		p2.x = 1;
		p2.y = 4;
		
		p1.showPoint();		// (6, 3)
		p2.showPoint();		// (1, 4)
		
		
		// �Ʒ� ��Ʈ : ��ȯ���� �� �����غ�����~
		Po p3 = p1.addPoint(p2);	// p1 + p2
		
		p3.showPoint();		// (7, 7)
		
	}
}
