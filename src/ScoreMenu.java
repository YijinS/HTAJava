import java.util.Scanner;


public class ScoreMenu {
	public static void main(String[] args0) {

		int kor1=0, kor2=0, kor3=0;
		int total=0;
		double avg = 0.0;
		total = kor1+kor2+kor3;
		avg = total/3;
		Scanner scan = new Scanner(System.in);

		
		   �󺧺�: while(true) {
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                 \"���� �޴�\"                 ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("\t1. ���� �Է�");
			System.out.println("\t2. ���� ��� ");
			System.out.println("\t3. ���� ");
			System.out.print("\t���� >");
			int menu = scan.nextInt();

			switch(menu) {
			case 1: 
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��                                          ��");
				System.out.println("��                  \"���� �Է�\"                ��");
				System.out.println("��                                          ��");
				System.out.println("����������������������������������������������������������������������������������������");

				do {
					System.out.println("kor 1:");
					kor1 = scan.nextInt();

					if(!(kor1>=0 && kor1<=100)){ 
						System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
					}
				}while(!(kor1>=0 && kor1<=100));


				do {
					System.out.println("kor 2:");
					kor2 = scan.nextInt();

					if(!(kor2>=0 && kor2<=100)){ 
						System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
					}
				}while(!(kor2>=0 && kor2<=100));


				do {
					System.out.println("kor 3:");
					kor3 = scan.nextInt();

					if(!(kor3>=0 && kor3<=100)){ 
						System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
					}
				}while(!(kor3>=0 && kor3<=100));
				break;
				
			
		
			
			case 2: 
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                  \"���� ���\"              ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.printf("kor1: %d", kor1);
			System.out.printf("kor2: %d", kor2);
			System.out.printf("kor3: %d", kor3);
			System.out.printf("total: %d", total);
			System.out.printf("avg: %lf", avg);
			break;
			
			
			case 3: 
				System.out.println("bye");
				break �󺧺�;
				
			
			default:
				System.out.println("���Է� �ϼ���");

		

	}
	}
}
}


