package chapter3.ex5.oop.ISA;

import java.util.Scanner;

public class Program {


	public static void main(String[] args) {
		//���
	//	ExamList exam = new ExamList(); 
		ExamConsole exam1 = new ExamConsole();

		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:

				exam1.input();
				break;


			case 2:

				exam1.output();
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
