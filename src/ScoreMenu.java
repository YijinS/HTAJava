import java.util.Scanner;


public class ScoreMenu {
	public static void main(String[] args0) {

		int kor1=0, kor2=0, kor3=0;
		int total=0;
		double avg = 0.0;
		total = kor1+kor2+kor3;
		avg = total/3;
		Scanner scan = new Scanner(System.in);

		
		   라벨벨: while(true) {
			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│                                          │");
			System.out.println("│                 \"메인 메뉴\"                 │");
			System.out.println("│                                          │");
			System.out.println("└──────────────────────────────────────────┘");
			System.out.println("\t1. 성적 입력");
			System.out.println("\t2. 성적 출력 ");
			System.out.println("\t3. 종료 ");
			System.out.print("\t선택 >");
			int menu = scan.nextInt();

			switch(menu) {
			case 1: 
				System.out.println("┌──────────────────────────────────────────┐");
				System.out.println("│                                          │");
				System.out.println("│                  \"성적 입력\"                │");
				System.out.println("│                                          │");
				System.out.println("└──────────────────────────────────────────┘");

				do {
					System.out.println("kor 1:");
					kor1 = scan.nextInt();

					if(!(kor1>=0 && kor1<=100)){ 
						System.out.println("점수는 0~100까지의 범위만 입력이 가능합니다. 다시입력");
					}
				}while(!(kor1>=0 && kor1<=100));


				do {
					System.out.println("kor 2:");
					kor2 = scan.nextInt();

					if(!(kor2>=0 && kor2<=100)){ 
						System.out.println("점수는 0~100까지의 범위만 입력이 가능합니다. 다시입력");
					}
				}while(!(kor2>=0 && kor2<=100));


				do {
					System.out.println("kor 3:");
					kor3 = scan.nextInt();

					if(!(kor3>=0 && kor3<=100)){ 
						System.out.println("점수는 0~100까지의 범위만 입력이 가능합니다. 다시입력");
					}
				}while(!(kor3>=0 && kor3<=100));
				break;
				
			
		
			
			case 2: 
			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│                                          │");
			System.out.println("│                  \"성적 출력\"              │");
			System.out.println("│                                          │");
			System.out.println("└──────────────────────────────────────────┘");
			System.out.printf("kor1: %d", kor1);
			System.out.printf("kor2: %d", kor2);
			System.out.printf("kor3: %d", kor3);
			System.out.printf("total: %d", total);
			System.out.printf("avg: %lf", avg);
			break;
			
			
			case 3: 
				System.out.println("bye");
				break 라벨벨;
				
			
			default:
				System.out.println("재입력 하세요");

		

	}
	}
}
}


