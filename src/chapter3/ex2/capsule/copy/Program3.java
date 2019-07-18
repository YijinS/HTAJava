package chapter3.ex2.capsule.copy;

import java.util.Scanner;

public class Program3 {


	public static void main(String[] args) {
		//재료

		ExamList exam = new ExamList();
		
		ExamList.init(exam); // 이것을 만드는 이유는 밑의 두 exam.list와 exam.current가 ExamList 클래스에서 current와 list 
		//값이 변경되었을때 오류가 나기 때문이다. 그래서 초기화를 해주는 함수를 다시 선언해준다.
//		exam.list = new Exam[3];
//		exam.current =0;
//

		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				ExamList.input(exam); //class이름을 붙여줘서 메소드를 사용할 수 있게  한다.
				break;


			case 2:
				ExamList.output(exam);
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
