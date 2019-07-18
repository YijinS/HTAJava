package chapter3.ex2.capsule.copy;

import java.util.Scanner;

public class Program2 {


	public static void main(String[] args) {
		//재료
		Exam[] exam = new Exam[3]; 

		//앞으로 exam을 입력해야 할때 사용할 수 있도록 이 배열의 어느 위치에 넣으면 된다는 것을 나타내기 위해 current를 사용한다. 
		// 값 변수는 공유가 불가능 하다. 
		int current = 0;

		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				current = inputTest(exam, current);
				break;


			case 2:
				outputTest(exam, current);
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


	private static int inputTest(Exam[] exam, int current) {
		//전역 이름을 쓰면 계속 같이 동화되서 수정시 에러가 발생할 수 있다. exam에 들어가는 지역변수 명은 원하는대로 만들 수 있다. (이름을 같게 써도 다른 이름이다)
		Scanner scan = new Scanner(System.in);
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

		exam[current] = new Exam();
		exam[current].kor = kor;
		exam[current].eng = eng;
		exam[current].math = math;

		System.out.println();
		current ++;
		return current ;

	}

	private static void outputTest(Exam[] exam, int current) {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		System.out.println(current);
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for(int i=0; i<current; i++) {
			kor  = exam[i].kor;
			eng = exam[i].eng;
			math = exam[i].math;
			int total = kor + eng + math;
			float avg = total/3.0f;

			System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);

		}
		System.out.println("─────────────────────────────");


	}



}
