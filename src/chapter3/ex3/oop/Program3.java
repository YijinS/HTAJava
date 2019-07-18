package chapter3.ex3.oop;

import java.util.Scanner;

public class Program3 {


	public static void main(String[] args) {
		//재료

		ExamList exam = new ExamList(); //객체 생성시 딱 한번만 호출될 수 있도록 하는 역할. new ExamList(); = new ExamList +();과 같은 말
		//생성자가 처음 객체를 생성할 때 호출되서 변수들을 초기화 시켜준다. 
		//	ExamList exam = new ExamList();이 호출되면 public ExamList(){}가 출력된 것이다.
		
		
		//ExamList.init(exam); //exam.init(); 이러면 객체함수, 인스턴스 함수라고 한다.
		//exam.reset(); //객체 생성시 여러번 초기화되니 딱 한 번만 호출될 수 있도록 해야한다. 그래서 생성자를 사용해야한다. 
		// 이것을 만드는 이유는 밑의 두 exam.list와 exam.current가 ExamList 클래스에서 current와 list 값이 변경되었을때 오류가 나기 때문이다. 그래서 초기화를 해주는 함수로 선언해준다.

		//		exam.list = new Exam[3];
		//		exam.current =0;
		
		//exam.init(exam)은 잘못된 함수이다. 앞의 exam을 받는게 아님. 
		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				//ExamList.input(exam); //class이름을 붙여줘서 메소드를 사용할 수 있게  한다.
				exam.input();
				break;


			case 2:
				//ExamList.output(exam);
				exam.output();
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





}
