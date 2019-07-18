package chapter3.ex3.oop.hasa;

import java.util.Scanner;
/*
 * ��ü�� ���� ����
 * ��ü�� ��ü�� ������ ���
 * �ϸ� ���κο� ���
 * -------------------------
 * �츮�� ExamList�� ĸ��ȭ��� ���� �ߴ�.
 * �� ����? � ������ �ֱ淡 "ĸ��ȭ"�� ����?
 * 
 * ->�����ͱ����� ����ϴ� �Լ����� ���� ���� ���� ĸ��
 * ->�����ͱ����� ���濡 ������ �޴� �Լ����� ���� ���� ���� ĸ��
 * ->ĸ��ȭ�� ������ �ܺο����� ��ȭ�� �Լ��� ������ ���� �ʰ� �ϱ� ���� ĳ��?�� ����� ��
 * ->����, ����ȭ�� ĸ���� �ϼ���Ű�� ���� �߿��� ��� �Ǵ� ������� �� �� �ֶ߾�~~
 * 
 * ������ ������... �и��� ĸ��ȭ�� �ߴµ�....
 * Exam Ŭ�������� kor ������ �����ϸ� �� Ŭ���� �ۿ� �ִ� ExamList ���Ͽ���
 * ������ �߻��ϴ� ���� �� �� �ִ�.... �� ���� ĸ��ȭ�� �ʿ����� �ƴ��Ѱ�..
 * �� ���� �����Դϴ�.
 */

public class ExamList {
	private Exam[] list;  
	private int current;


	public ExamList() {
		this.list = new Exam[3];   
		this.current =0;
	}


	public void input() {

		Scanner scan = new Scanner(System.in);
		int current = this.current;
		Exam[] list = this.list;
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

//		list[current] = new Exam(kor, eng, math);
		
		//���� �̷��� ���� ĸ��ȭ �κп��� ������. 
//		list[current].kor = kor;
//		list[current].eng = eng;
//		list[current].math = math;
		
//  ---------------------------------------
//		exam.setKor(kor);
//		exam.setMath(math);
//		exam.setEng(eng);
// 	�̷��� �ӽú��� ����ϴ� ���� ����.
//		kor, eng, math �κ��� Exam.java���� ����� �� �̰����� ������ �߱� ������ �װ��� �����ϱ� ���� �Լ��� �־��ش�
//		Exam Ŭ������ kor, eng, math�� �Ѱܹ޴� �κ��� �־��ش�. set() ��� 
		
		Exam exam = new Exam(kor, eng, math);
		list[current] = exam;
		current ++;
		this.current = current;

		
	}

	public void output() {
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = this.current;
		Exam[] list  = this.list;
		System.out.println(current);
		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for(int i=0; i<current; i++) {
			Exam exam = list[i];
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
