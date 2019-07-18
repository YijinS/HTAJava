package chapter3.ex4.oop.hasa;

import java.util.Scanner;

public class ExamConsole {

	/*- list: ExamList                     input(), output() - 입력받고 추가한다. 추가하는 기능은 콘솔이 아닌 ExamList한테 있어야 한다*/
	private ExamList list;
	//코드 영역이 아니기 때문에 이곳에서 객체화 하면 안됩니다. 
	
	public ExamConsole() {
		this.list = new ExamList();
		
	}
	
	//성적을 목록에 추가하는 함수 : add();
	public void input() {

		Scanner scan = new Scanner(System.in);
		//current가 필요하니 지역변수를 잡아주고 ExamList에서 current를 get 해와서 대입해준다.
		int current = list.getCurret();
		int kor, eng, math;
		
		
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
		
		Exam exam = new Exam(kor, eng, math);

		list.add(exam);
		
		
	}

	public void output() {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int size = list.size();  //current가 아닌 반복해야 하는 개수로 size로 이름을 바꾼다. 
		
		System.out.println(size);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for(int i=0; i<size; i++) {
			//get이 이루어지는 부분 
			
			Exam exam = list.get(i);
			kor  =exam.getKor();
			eng = exam.getEng();
			math = exam.getMath();
			int total =exam.getTotal();
			float avg =exam.getAvg();

			System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);

		}
		System.out.println("─────────────────────────────");


	}
	




}
