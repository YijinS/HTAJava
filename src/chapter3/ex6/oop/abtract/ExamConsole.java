package chapter3.ex6.oop.abtract;

import java.util.Scanner;


public abstract class ExamConsole {

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
		
		//ybmexam이던 jhtexam이던 모두 사용할 수 있도록 하는 법 
		//함수를 줄테니 직접 구현해 달라는 뜻
		//자식에게 의무를 부여하면서 부모가 만들어질 함수를 사용하게된다 
		Exam exam = newExam(); 
		
		int current = list.getCurret();
		int kor, eng, math;
		
		
		do {
			System.out.printf("국어 %d", current+1);
			kor = scan.nextInt();

			if	(kor < 0 || 100 < 	kor )
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(kor<0 ||kor>100);
			exam.setKor(kor);

		do {
			System.out.printf("영어 %d", current+1);
			eng = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(eng<0 ||eng>100);
			exam.setEng(eng);

		do {
			System.out.printf("수학 %d", current+1);
			math = scan.nextInt();

			if	(math < 0 || 100 < 	math )
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(math<0 ||math>100);
			exam.setMath(math);
		
		//과목을 새로 입력받는것은 exam의 몫이 아니고 자식에게 입력받으라고 책임지게 넘긴다.
		onInput(exam, current); //자식이 만들어야 하는 함
	
		
		list.add(exam); //exam 안에는 ybm, jhta 등에서 구현된 값도 들어가야 한다.
		
		
	}

	protected abstract void onInput(Exam exam, int current); //자식이 구현하는 것이지만 부모가 가지고 있어야 한다.

	protected abstract Exam newExam() ; //추상메소드가 된 것 
		//얘가 추상메소드면 클래스도 추상이어야 한다. abstract

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
			int total =exam.total();
			float avg =exam.getAvg();
			
			outToeic(exam);

			System.out.printf("%d, kor: %d, eng: %d, math: %d,  total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);
			
		}
		System.out.println("─────────────────────────────");


	}

	protected abstract void outToeic(Exam exam);
	




}
