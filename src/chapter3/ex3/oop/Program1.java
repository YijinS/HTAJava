package chapter3.ex3.oop;
import java.util.Scanner;
/*
 * 1. ���� ������ �����ϴ� ���α׷��� 
 * ����, ���� ������ �߰��� ���α׷�
 * 
 * ���� �̸�, ���� ��ȣ , ���� ����, ���� �ο��� �����ϴ� ���α׷��� �����ʹ�..?  ����
 *  �л� �̸�, ����, �ּ�, ��ȭ��ȣ�� �����ϴ� ���α׷��� �����ʹ�?  �л� 
 * */

public class Program1{

	public static void main(String[] args) {

		Exam[] exam = new Exam[3]; //

		//������ exam�� �Է��ؾ� �Ҷ� ����� �� �ֵ��� �� �迭�� ��� ��ġ�� ������ �ȴٴ� ���� ��Ÿ���� ���� current�� ����Ѵ�. 

		int current = 0;

		//1. �Ⱥ��� kors �迭 �����ϱ�
		//for(int i=0; i<exam.length; i++)


	
		int menu;

		Scanner scan = new Scanner(System.in);

		�󺧺�:while(true)
		{
			System.out.println("����������������������������������������������������������");
			System.out.println("��           ���� �޴�                   ��");
			System.out.println("����������������������������������������������������������");
			System.out.println("\t1. �����Է� ");
			System.out.println("\t2. ������� ");
			System.out.println("\t3. ���� ");
			System.out.println("\t����> ");
			menu = scan.nextInt();

			
			// switch, case �������� {}�� �̿��� ����ȭ�� ������ �������� ������ ���� �� �� �ִ�.  
			switch(menu) {           
			case 1:{

				System.out.println("����������������������������������������������������������");
				System.out.println("��           ����  �Է�                   ��");
				System.out.println("����������������������������������������������������������");
				System.out.println();

				int kor, eng, math;

				do {
					System.out.printf("����%d: ", current+1);
					kor = scan.nextInt();


					if	(kor < 0 || 100 < 	kor )
						System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

				}while(	kor  < 0 || 100 <	kor );

				do {
					System.out.printf("����%d: ", current+1);
					eng = scan.nextInt();


					if	(eng < 0 || 100 < 	eng )
						System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

				}while(	eng  < 0 || 100 <	eng );

				do {
					System.out.printf("����%d: ", current+1);
					math = scan.nextInt();

					if	(math < 0 || 100 < 	math )
						System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");

				}while(	math  < 0 || 100 <	math );

				System.out.println("����������������������������������������������������������");

				exam[current] = new Exam(); // �̰��� �ؿ� �ΰ� �ϴ� �ӽ� �������� �ڵ� �ۼ��ϰ� 
				//�ӽú����� ���� �ٽ� �����ϴ� ������ �ؼ� �ڵ带 �����ϰ� ������ �Ѵ�. 
				exam[current].kor = kor;
				exam[current].eng = eng;
				exam[current].math = math;

				current ++; // current�� �������Ѽ� �ʿ��� �� ������ �� �ֵ��� 


				break;
			}
			case 2:{

				System.out.println("����������������������������������������������������������");
				System.out.println("��           ����  ���                   ��");
				System.out.println("����������������������������������������������������������");
				System.out.println();

				// "3 �̶�� �ݺ� Ƚ��"�� �����ϸ鼭 �װ� ��ŭ �ݺ��϶�� ������ ���ž�...
				for(int i=0;i<current;i++) {
					int kor  = exam[i].kor;
					int eng = exam[i].eng;
					int math = exam[i].math;
					int total = kor + eng + math;
					float avg = total/3.0f;
					
						System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
												, i+1, kor, eng, math, total, avg);
				}

				System.out.println("����������������������������������������������������������");

				break;
			}
			
			case 3:
				System.out.println("Bye~~");
				break �󺧺�;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");

			}

		}

	}
}