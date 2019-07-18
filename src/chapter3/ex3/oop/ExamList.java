package chapter3.ex3.oop;

import java.util.Scanner;

public class ExamList {
	
	Exam[] list;  //공간을 정의하는 부분이지 값을 만드는 부분이 아니기 때문에 new를 쓰지 않는다.
	int current;

//	public static void init(ExamList exam) {   //static 에선 this를 쓸 수 없다
//		exam.list = new Exam[3];
//		exam.current =0;
//	}
	
	public ExamList() {
		this.list = new Exam[3];   //this는 필드변수를 나타낸다. 필드변수 list, current
		this.current =0;
	}

//	public void reset() { //static이 있으면 instance 메소드가 아니다. static이 있으면 매개변수를 받는데 없으면 안받?
//		this.list = new Exam[3];   //this는 필드변수를 나타낸다. 필드변수 list, current
//		this.current =0;
//	}
	
	public void input() {
		//전역 이름을 쓰면 계속 같이 동화되서 수정시 에러가 발생할 수 있다. exam에 들어가는 지역변수 명은 원하는대로 만들 수 있다. (이름을 같게 써도 다른 이름이다)
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = this.current;

		Exam[] list  = this.list;
		do {
			System.out.printf("국어 %d", current+1);
			kor = scan.nextInt();

			if	(kor < 0 || 100 < 	kor )
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(kor<0 ||kor>100);


		do {
			System.out.printf("영어 %d", current+1);
			eng = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(eng<0 ||eng>100);

		do {
			System.out.printf("수학 %d", current+1);
			math = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(math<0 ||math>100);

		list[current] = new Exam();
		list[current].kor = kor;
		list[current].eng = eng;
		list[current].math = math;

		current ++;
		this.current = current;

	}

	public void output() {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = this.current;
		Exam[] list  = this.list;
		System.out.println(current);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for(int i=0; i<current; i++) {
			kor  = list[i].kor;
			eng = list[i].eng;
			math = list[i].math;
			int total = kor + eng + math;
			float avg = total/3.0f;

			System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);

		}
		System.out.println("─────────────────────────────");
	

	}

}
