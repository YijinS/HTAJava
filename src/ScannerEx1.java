import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args0) {

		int kor;
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                  \"���� �Է�\"              ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");

			do {
				System.out.println("kor 1:");
				kor = scan.nextInt();
				
				if(!(kor>=0 && kor<=100)){ 
					System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
				}
			}while(!(kor>=0 && kor<=100));

//			do {
//				System.out.println("���� 2:");
//				kor1 = scan.nextInt();
//				if(!(kor1>=0 && kor1<=100)){ 
//					System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
//				}
//			}while(!(kor1>=0 && kor1<=100));
//
//			do {
//				System.out.println("���� 3:");
//				kor2 = scan.nextInt();
//
//				if(!(kor2>=0 && kor2<=100)){ 
//					System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
//				}
//			}while(!(kor2>=0 && kor2<=100));
//			
			
//			total = kor + kor1 + kor2  ;
//			float avg = total/3.0f;
			System.out.println();

			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                  \"���� ���\"              ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");
			
			 for(int i=0; i<3; i++) {
					System.out.printf("kor%d : %d",5-i, kor);
					System.out.println();
				}
				
//			System.out.printf("�� ��: %d\t", total);
//			System.out.printf("���: %3.1f", avg);

		}

	}

}
