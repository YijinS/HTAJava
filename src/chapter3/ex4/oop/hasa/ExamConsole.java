package chapter3.ex4.oop.hasa;

import java.util.Scanner;

public class ExamConsole {

	/*- list: ExamList                     input(), output() - �Է¹ް� �߰��Ѵ�. �߰��ϴ� ����� �ܼ��� �ƴ� ExamList���� �־�� �Ѵ�*/
	private ExamList list;
	//�ڵ� ������ �ƴϱ� ������ �̰����� ��üȭ �ϸ� �ȵ˴ϴ�. 
	
	public ExamConsole() {
		this.list = new ExamList();
		
	}
	
	//������ ��Ͽ� �߰��ϴ� �Լ� : add();
	public void input() {

		Scanner scan = new Scanner(System.in);
		//current�� �ʿ��ϴ� ���������� ����ְ� ExamList���� current�� get �ؿͼ� �������ش�.
		int current = list.getCurret();
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
		
		Exam exam = new Exam(kor, eng, math);

		list.add(exam);
		
		
	}

	public void output() {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int size = list.size();  //current�� �ƴ� �ݺ��ؾ� �ϴ� ������ size�� �̸��� �ٲ۴�. 
		
		System.out.println(size);
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for(int i=0; i<size; i++) {
			//get�� �̷������ �κ� 
			
			Exam exam = list.get(i);
			kor  =exam.getKor();
			eng = exam.getEng();
			math = exam.getMath();
			int total =exam.getTotal();
			float avg =exam.getAvg();

			System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);

		}
		System.out.println("����������������������������������������������������������");


	}
	




}
