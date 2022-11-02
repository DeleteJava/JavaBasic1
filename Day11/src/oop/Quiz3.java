package oop;

// 우클릭 -> source -> generate constructor using fields

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
		String result = "%s (국 : %d, 영 : %d, 수 : %d)\n";
		
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
		// 아래 코드가 동작되게 클래스를 구성해 주세요
		
		Student stu = new Student("홍길동", 70, 80, 98);
		// 필드는 이름, 국 영 수
		
		
		stu.showStu();		// 홍길동 (국 : 70, 영 : 80, 수 : 98)
		
		System.out.println("합계 : " + stu.total());		// 248
		System.out.println("평균 : " + stu.avg()); 		// 82.66666666666 ...
		
		
		
	}
}
