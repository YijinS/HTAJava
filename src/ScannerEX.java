import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		int kor, kor1, kor2, total;
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│                                          │");
			System.out.println("│                  \"성적 입력\"              │");
			System.out.println("│                                          │");
			System.out.println("└──────────────────────────────────────────┘");
			System.out.println("국어 1:");
			kor = scan.nextInt();

			//if(kor<0 || kor>100)
			while(!(kor>=0 && kor<=100)){ 

				System.out.println("점수는 0~100까지의 범위만 입력이 가능합니다. 다시입력");
				System.out.println("국어 1:");
				kor = scan.nextInt();
			}



			System.out.println("국어 2:");
			kor1 = scan.nextInt();

			System.out.println("국어 3:");
			kor2 = scan.nextInt();
			total = kor + kor1 +  kor2 ;
			float avg = total/3.0f;
			System.out.println();

			System.out.println("┌──────────────────────────────────────────┐");
			System.out.println("│                                          │");
			System.out.println("│                  \"성적 출력\"              │");
			System.out.println("│                                          │");
			System.out.println("└──────────────────────────────────────────┘");
			System.out.printf("국어 1: %d\t", kor);
			System.out.printf("국어 2: %d\t", kor1);
			System.out.printf("국어 3: %d\t", kor2);
			System.out.printf("총 점: %d\t", total);
			System.out.printf("평균: %3.1f", avg);

		}

	}
}
