package chapter3.ex1.capsule;

import java.util.Scanner;

public class Program3 {


	public static void main(String[] args) {
		//재료

		ExamList exam = new ExamList();
		exam.list = new Exam[3];
		exam.current =0;
		
		
		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				inputTestList(exam);
//				exam.current; 
				break;


			case 2:
				outputTestList(exam);
				break;


			case 3:{
				System.out.println("종료");
				return; //while문을 나가버림
			}

			default:
				System.out.println("1~3에서만 선택하기");
				break exti;
			}

		}

	}



	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		int menu = scan.nextInt();

		return menu;
	}


	private static void inputTestList(ExamList exam) {
		//전역 이름을 쓰면 계속 같이 동화되서 수정시 에러가 발생할 수 있다. exam에 들어가는 지역변수 명은 원하는대로 만들 수 있다. (이름을 같게 써도 다른 이름이다)
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = exam.current;
	
		Exam[] list  = exam.list;
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
		exam.current = current;

	}

	private static void outputTestList(ExamList exam) {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = exam.current;
		Exam[] list  = exam.list;
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
