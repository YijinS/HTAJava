package chapter3.ex2.capsule.copy;

import java.util.Scanner;

public class Program3 {


	public static void main(String[] args) {
		//���

		ExamList exam = new ExamList();
		
		ExamList.init(exam); // �̰��� ����� ������ ���� �� exam.list�� exam.current�� ExamList Ŭ�������� current�� list 
		//���� ����Ǿ����� ������ ���� �����̴�. �׷��� �ʱ�ȭ�� ���ִ� �Լ��� �ٽ� �������ش�.
//		exam.list = new Exam[3];
//		exam.current =0;
//

		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:
				ExamList.input(exam); //class�̸��� �ٿ��༭ �޼ҵ带 ����� �� �ְ�  �Ѵ�.
				break;


			case 2:
				ExamList.output(exam);
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
