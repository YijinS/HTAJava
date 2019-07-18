package chapter2.ex1.array;
import java.util.Scanner;


public class FinalVariableProgram {
	public static void main(String[] args0) {
		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 5; 
		int kor[] = new int[SIZE];
		int total=0;
		float avg = 0;
		
		//배열 초기값 대입
		for(int i=0; i<SIZE; i++) 
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

				
				for(int j=0; j<SIZE; j++) 
				do {
					System.out.printf("kor%d:", j+1);
					kor[j] = scan.nextInt();

					if(!(kor[j]>=0 && kor[j]<=100))
						System.out.println("점수는 0~100까지의 범위만 입력이 가능합니다. 다시입력");
					
				}while(!(kor[j]>=0 && kor[j]<=100));
				
				break;
		
				
			case 2: 
				
			for(int i=0; i<SIZE; i++) 
				total += kor[i];
			avg = total/SIZE;
			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│                                          │");
			System.out.println("│                  \"성적 출력\"              │");
			System.out.println("│                                          │");
			System.out.println("└──────────────────────────────────────────┘");
			
			for(int i=0; i<SIZE; i++) 
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
		   } //while 종료 
	}	//메인종료
} //클래스 종료 




