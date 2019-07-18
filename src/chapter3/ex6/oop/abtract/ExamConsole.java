package chapter3.ex6.oop.abtract;

import java.util.Scanner;


public abstract class ExamConsole {

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
		
		//ybmexam�̴� jhtexam�̴� ��� ����� �� �ֵ��� �ϴ� �� 
		//�Լ��� ���״� ���� ������ �޶�� ��
		//�ڽĿ��� �ǹ��� �ο��ϸ鼭 �θ� ������� �Լ��� ����ϰԵȴ� 
		Exam exam = newExam(); 
		
		int current = list.getCurret();
		int kor, eng, math;
		
		
		do {
			System.out.printf("���� %d", current+1);
			kor = scan.nextInt();

			if	(kor < 0 || 100 < 	kor )
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		}while(kor<0 ||kor>100);
			exam.setKor(kor);

		do {
			System.out.printf("���� %d", current+1);
			eng = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

		}while(eng<0 ||eng>100);
			exam.setEng(eng);

		do {
			System.out.printf("���� %d", current+1);
			math = scan.nextInt();

			if	(math < 0 || 100 < 	math )
				System.out.println("���м����� 0~100������ ������ �Է��� �����մϴ�.");

		}while(math<0 ||math>100);
			exam.setMath(math);
		
		//������ ���� �Է¹޴°��� exam�� ���� �ƴϰ� �ڽĿ��� �Է¹������ å������ �ѱ��.
		onInput(exam, current); //�ڽ��� ������ �ϴ� ��
	
		
		list.add(exam); //exam �ȿ��� ybm, jhta ��� ������ ���� ���� �Ѵ�.
		
		
	}

	protected abstract void onInput(Exam exam, int current); //�ڽ��� �����ϴ� �������� �θ� ������ �־�� �Ѵ�.

	protected abstract Exam newExam() ; //�߻�޼ҵ尡 �� �� 
		//�갡 �߻�޼ҵ�� Ŭ������ �߻��̾�� �Ѵ�. abstract

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
			int total =exam.total();
			float avg =exam.getAvg();
			
			outToeic(exam);

			System.out.printf("%d, kor: %d, eng: %d, math: %d,  total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);
			
		}
		System.out.println("����������������������������������������������������������");


	}

	protected abstract void outToeic(Exam exam);
	




}
