package chapter3.ex2.capsule.copy;

import java.util.Scanner;

public class Program2 {


	public static void main(String[] args) {
		//���
		Exam[] exam = new Exam[3]; 

		//������ exam�� �Է��ؾ� �Ҷ� ����� �� �ֵ��� �� �迭�� ��� ��ġ�� ������ �ȴٴ� ���� ��Ÿ���� ���� current�� ����Ѵ�. 
		// �� ������ ������ �Ұ��� �ϴ�. 
		int current = 0;

		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				current = inputTest(exam, current);
				break;


			case 2:
				outputTest(exam, current);
				break;


			case 3:{
				System.out.println("����");
				return; //while���� ��������
			}

			default:
				System.out.println("1~3������ �����ϱ�");
				break exti;
			}

		}

	}



	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �޴�                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();

		return menu;
	}


	private static int inputTest(Exam[] exam, int current) {
		//���� �̸��� ���� ��� ���� ��ȭ�Ǽ� ������ ������ �߻��� �� �ִ�. exam�� ���� �������� ���� ���ϴ´�� ���� �� �ִ�. (�̸��� ���� �ᵵ �ٸ� �̸��̴�)
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;

		do {
			System.out.printf("���� %d", current+1);
			kor = scan.nextInt();

			if	(kor < 0 || 100 < 	kor )
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		}while(kor<0 ||kor>100);


		do {
			System.out.printf("���� %d", current+1);
			eng = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		}while(eng<0 ||eng>100);

		do {
			System.out.printf("���� %d", current+1);
			math = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");

		}while(math<0 ||math>100);

		exam[current] = new Exam();
		exam[current].kor = kor;
		exam[current].eng = eng;
		exam[current].math = math;

		System.out.println();
		current ++;
		return current ;

	}

	private static void outputTest(Exam[] exam, int current) {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		System.out.println(current);
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for(int i=0; i<current; i++) {
			kor  = exam[i].kor;
			eng = exam[i].eng;
			math = exam[i].math;
			int total = kor + eng + math;
			float avg = total/3.0f;

			System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);

		}
		System.out.println("����������������������������������������������������������");


	}



}
