package chapter3.ex5.oop.ISA;

import java.util.Scanner;

public class Program {


	public static void main(String[] args) {
		//재료
	//	ExamList exam = new ExamList(); 
		ExamConsole exam1 = new ExamConsole();

		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:

				exam1.input();
				break;


			case 2:

				exam1.output();
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
