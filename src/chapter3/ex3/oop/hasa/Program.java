package chapter3.ex3.oop.hasa;

import java.util.Scanner;

public class Program {


	public static void main(String[] args) {
		//���
		ExamList exam = new ExamList(); 

		exti:while(true) {

			int menu = inputMenu();

			switch(menu) {

			case 1:

				exam.input();
				break;


			case 2:

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
