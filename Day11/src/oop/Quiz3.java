package oop;

// ��Ŭ�� -> source -> generate constructor using fields

class Student {
	String name;
	int kor, eng, mat;
	
	Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	void showStu() {
		String result = "%s (�� : %d, �� : %d, �� : %d)\n";
		
		System.out.printf(result, name, kor, eng, mat);
	}
	
	int total() {
		return kor + eng + mat;
	}
	
	double avg() {
		double result = total() / 3.0;	// 82.66666666666667
		
		result = Math.round(result * 100) / 100.0;
		
		return result;
	}
}

public class Quiz3 {
	public static void main(String[] args) {
		// �Ʒ� �ڵ尡 ���۵ǰ� Ŭ������ ������ �ּ���
		
		Student stu = new Student("ȫ�浿", 70, 80, 98);
		// �ʵ�� �̸�, �� �� ��
		
		
		stu.showStu();		// ȫ�浿 (�� : 70, �� : 80, �� : 98)
		
		System.out.println("�հ� : " + stu.total());		// 248
		System.out.println("��� : " + stu.avg()); 		// 82.66666666666 ...
		
		
		
	}
}
