package chapter3.ex3.oop;

import java.util.Scanner;

public class Program3 {


	public static void main(String[] args) {
		//���

		ExamList exam = new ExamList(); //��ü ������ �� �ѹ��� ȣ��� �� �ֵ��� �ϴ� ����. new ExamList(); = new ExamList +();�� ���� ��
		//�����ڰ� ó�� ��ü�� ������ �� ȣ��Ǽ� �������� �ʱ�ȭ �����ش�. 
		//	ExamList exam = new ExamList();�� ȣ��Ǹ� public ExamList(){}�� ��µ� ���̴�.
		
		
		//ExamList.init(exam); //exam.init(); �̷��� ��ü�Լ�, �ν��Ͻ� �Լ���� �Ѵ�.
		//exam.reset(); //��ü ������ ������ �ʱ�ȭ�Ǵ� �� �� ���� ȣ��� �� �ֵ��� �ؾ��Ѵ�. �׷��� �����ڸ� ����ؾ��Ѵ�. 
		// �̰��� ����� ������ ���� �� exam.list�� exam.current�� ExamList Ŭ�������� current�� list ���� ����Ǿ����� ������ ���� �����̴�. �׷��� �ʱ�ȭ�� ���ִ� �Լ��� �������ش�.

		//		exam.list = new Exam[3];
		//		exam.current =0;
		
		//exam.init(exam)�� �߸��� �Լ��̴�. ���� exam�� �޴°� �ƴ�. 
		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				//ExamList.input(exam); //class�̸��� �ٿ��༭ �޼ҵ带 ����� �� �ְ�  �Ѵ�.
				exam.input();
				break;


			case 2:
				//ExamList.output(exam);
				exam.output();
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





}
