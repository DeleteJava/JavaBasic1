package interaction;

class Unit {
	String job;
	int hp, atk;
	
	Unit(String job, int hp, int atk) {
		this.job = job;
		this.hp = hp;
		this.atk = atk;
	}
	
	void showInfo() {
		String result = "%s (hp %d, atk %d)\n";
		
		System.out.printf(result, job, hp, atk);
	}
	
	void attack(Unit tar) {		// 1. this = war, tar = wiz
								// 2. this = wiz, tar = war
		tar.hp -= atk;
		
		System.out.printf("\n%s(��)�� %s(��)�� ����!!!\n", job, tar.job);
		System.out.println(atk + "��ŭ�� ���ظ� ������!!!\n");
		
		showInfo();
		tar.showInfo();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Unit war = new Unit("����", 100, 10);
		Unit wiz = new Unit("������", 70, 14);
		
		war.showInfo();
		wiz.showInfo();
		
		war.attack(wiz);		// 1. attack(war, wiz)
		
		wiz.attack(war);		// 2. attack(wiz, war)
	}
}
