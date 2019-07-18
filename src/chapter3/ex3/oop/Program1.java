package chapter3.ex3.oop;
import java.util.Scanner;
/*
 * 1. 국어 성적을 관리하는 프로그램에 
 * 영어, 수학 과목을 추가한 프로그램
 * 
 * 과정 이름, 과정 번호 , 과정 일정, 과정 인원을 관리하는 프로그램의 데이터는..?  과정
 *  학생 이름, 나이, 주소, 전화번호를 관리하는 프로그램의 데이터는?  학생 
 * */

public class Program1{

	public static void main(String[] args) {

		Exam[] exam = new Exam[3]; //

		//앞으로 exam을 입력해야 할때 사용할 수 있도록 이 배열의 어느 위치에 넣으면 된다는 것을 나타내기 위해 current를 사용한다. 

		int current = 0;

		//1. 안보고 kors 배열 생성하기
		//for(int i=0; i<exam.length; i++)


	
		int menu;

		Scanner scan = new Scanner(System.in);

		라벨벨:while(true)
		{
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           메인 메뉴                   │");
			System.out.println("└───────────────────────────┘");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 종료 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			
			// switch, case 문에서는 {}를 이용해 지역화가 가능해 지역변수 선언을 따로 할 수 있다.  
			switch(menu) {           
			case 1:{

				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적  입력                   │");
				System.out.println("└───────────────────────────┘");
				System.out.println();

				int kor, eng, math;

				do {
					System.out.printf("국어%d: ", current+1);
					kor = scan.nextInt();


					if	(kor < 0 || 100 < 	kor )
						System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

				}while(	kor  < 0 || 100 <	kor );

				do {
					System.out.printf("영어%d: ", current+1);
					eng = scan.nextInt();


					if	(eng < 0 || 100 < 	eng )
						System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

				}while(	eng  < 0 || 100 <	eng );

				do {
					System.out.printf("수학%d: ", current+1);
					math = scan.nextInt();

					if	(math < 0 || 100 < 	math )
						System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

				}while(	math  < 0 || 100 <	math );

				System.out.println("─────────────────────────────");

				exam[current] = new Exam(); // 이것을 밑에 두고 일단 임시 변수에서 코드 작성하고 
				//임시변수의 값을 다시 대입하는 식으로 해서 코드를 간결하게 만들어야 한다. 
				exam[current].kor = kor;
				exam[current].eng = eng;
				exam[current].math = math;

				current ++; // current를 증가시켜서 필요할 때 생성할 수 있도록 


				break;
			}
			case 2:{

				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적  출력                   │");
				System.out.println("└───────────────────────────┘");
				System.out.println();

				// "3 이라는 반복 횟수"를 지정하면서 그것 만큼 반복하라는 문제를 낸거야...
				for(int i=0;i<current;i++) {
					int kor  = exam[i].kor;
					int eng = exam[i].eng;
					int math = exam[i].math;
					int total = kor + eng + math;
					float avg = total/3.0f;
					
						System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
												, i+1, kor, eng, math, total, avg);
				}

				System.out.println("─────────────────────────────");

				break;
			}
			
			case 3:
				System.out.println("Bye~~");
				break 라벨벨;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");

			}

		}

	}
}