package chapter2.ex1.array;
import java.util.Scanner;


public class Program {
	public static void main(String[] args0) {
		Scanner scan = new Scanner(System.in);
		
		int kor[] = new int[3];
		int total=0;
		float avg = 0;
		
		//배열 초기값 대입
		for(int i=0; i<3; i++) 
			kor[i] = 0;
		
	
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

				
				for(int j=0; j<3; j++) {
				do {
					System.out.printf("kor%d:", j+1);
					kor[j] = scan.nextInt();

					if(!(kor[j]>=0 && kor[j]<=100)){ 
						System.out.println("점수는 0~100까지의 범위만 입력이 가능합니다. 다시입력");
					}
				}while(!(kor[j]>=0 && kor[j]<=100));
				}
				break;
		
				
			case 2: 
				
			for(int i=0; i<3; i++) 
				total += kor[i];
			avg = total/3;
			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│                                          │");
			System.out.println("│                  \"성적 출력\"              │");
			System.out.println("│                                          │");
			System.out.println("└──────────────────────────────────────────┘");
			
			for(int i=0; i<3; i++) 
			System.out.printf("kor%d: %d\t", i+1, kor[i]);
			
			System.out.printf("total: %d\t", total);
			System.out.printf("avg: %.2f\t", avg);
			System.out.println();
			
			break;
			
			
			case 3: 
				System.out.println("bye");
				break 라벨벨;
				
			
			default:
				System.out.println("재입력 하세요");

		

	} //스위치 종료 
			
		}
	}
	
}




