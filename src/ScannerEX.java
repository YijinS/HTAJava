import java.util.Scanner;

public class ScannerEX {
	public static void main(String[] args) {
		int kor, kor1, kor2, total;
		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                  \"���� �Է�\"              ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("���� 1:");
			kor = scan.nextInt();

			//if(kor<0 || kor>100)
			while(!(kor>=0 && kor<=100)){ 

				System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
				System.out.println("���� 1:");
				kor = scan.nextInt();
			}



			System.out.println("���� 2:");
			kor1 = scan.nextInt();

			System.out.println("���� 3:");
			kor2 = scan.nextInt();
			total = kor + kor1 +  kor2 ;
			float avg = total/3.0f;
			System.out.println();

			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                  \"���� ���\"              ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.printf("���� 1: %d\t", kor);
			System.out.printf("���� 2: %d\t", kor1);
			System.out.printf("���� 3: %d\t", kor2);
			System.out.printf("�� ��: %d\t", total);
			System.out.printf("���: %3.1f", avg);

		}

	}
}
