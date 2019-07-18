package chapter3.ex1.capsule;
import java.util.Scanner;

public class Program{

	public static void main(String[] args) {

		//1. 안보고 kors 배열 생성하기
		int[] kors = new int[3];

		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		// 2. 배열 초기 값(0=기본값)을 대입하는 코드를 반복문으로 안보고 고치기
		kors[0] = 0;
		kors[1] = 0;
		kors[2] = 0;

		for(int i=0; i<3; i++)
			kors[i] = 0;

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

			switch(menu) {           
			case 1:

				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적  입력                   │");
				System.out.println("└───────────────────────────┘");
				System.out.println();

				for(int i=0; i<3; i++)
					do {
						System.out.printf("국어%d : ", i+1);
						kors[i] = scan.nextInt();

						//만약에 kor1의 값이 100보다 크다면
						if(kors[i] < 0 || 100 < kors[i])
							System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

					}while(kors[i] < 0 || 100 < kors[i]);

				System.out.println("─────────────────────────────");

				break;
			case 2:

				total = kor1 + kor2 + kor3;

				for(int i=0; i<3; i++)
					total = total + kors[i];

				avg = total / 3;

				System.out.println("┌───────────────────────────┐");
				System.out.println("│           성적  출력                   │");
				System.out.println("└───────────────────────────┘");
				System.out.println();

				// "3 이라는 반복 횟수"를 지정하면서 그것 만큼 반복하라는 문제를 낸거야...
				for(int i=0;i<3;i++)
					System.out.printf("국어 %d : %3d\n", 3-i, kors[i]);              

				System.out.printf("총점 : %3d\n", total);
				System.out.printf("평균 : %6.2f\n", avg);
				System.out.println("─────────────────────────────");

				break;
			case 3:
				System.out.println("Bye~~");
				break 라벨벨;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");

			}

		}

	}
}