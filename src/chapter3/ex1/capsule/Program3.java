package chapter3.ex1.capsule;

import java.util.Scanner;

public class Program3 {


	public static void main(String[] args) {
		//���

		ExamList exam = new ExamList();
		exam.list = new Exam[3];
		exam.current =0;
		
		
		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				inputTestList(exam);
//				exam.current; 
				break;


			case 2:
				outputTestList(exam);
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


	private static void inputTestList(ExamList exam) {
		//���� �̸��� ���� ��� ���� ��ȭ�Ǽ� ������ ������ �߻��� �� �ִ�. exam�� ���� �������� ���� ���ϴ´�� ���� �� �ִ�. (�̸��� ���� �ᵵ �ٸ� �̸��̴�)
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = exam.current;
	
		Exam[] list  = exam.list;
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
		
		list[current] = new Exam();
		list[current].kor = kor;
		list[current].eng = eng;
		list[current].math = math;

		current ++;
		exam.current = current;

	}

	private static void outputTestList(ExamList exam) {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = exam.current;
		Exam[] list  = exam.list;
		System.out.println(current);
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for(int i=0; i<current; i++) {
			kor  = list[i].kor;
			eng = list[i].eng;
			math = list[i].math;
			int total = kor + eng + math;
			float avg = total/3.0f;

			System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);

		}
		System.out.println("����������������������������������������������������������");


	}



}
