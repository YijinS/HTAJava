package chapter3.ex6.oop.abtract.YBM;

import java.util.Scanner;

import chapter3.ex6.oop.abtract.Exam;
import chapter3.ex6.oop.abtract.ExamConsole;

//�������ܿ� Ȯ��� ����� ����
//�������� Exam�� ����� ���
public class YBMExamConsole extends ExamConsole{

//	YBMExam exam1 = new YBMExam();
//	int toeic = exam1.getToeic();

	
	@Override
	protected Exam newExam() {
		
		return new YBMExam();
	}

	@Override
	protected void onInput(Exam exam, int num) { //YBM �ܼ� �κп��� ���� �Է¹ް� ���� ���� ���� �����κ� ex����
		int toeic;
		YBMExam  YBMexam = (YBMExam) exam; //Exam�� exam�� �ڽĲ��� ���� ����ȯ 
		
		Scanner scan = new Scanner(System.in);

		do {
			System.out.printf("toeic %d", num+1);
			toeic = scan.nextInt();

			if	(toeic < 0 || 100 < 	toeic )
				System.out.println("toeic������ 0~100������ ������ �Է��� �����մϴ�.");

		}while(toeic<0 ||toeic>100);
		
		//exam.setToeic(toeic);  �� ������ Exam �̶� ������ ���� ������ YBM���� �ϰ� ���� ����ȯ���� EXAM�� �ڽİ����� �����
		YBMexam.setToeic(toeic);
		
	}
	
	@Override
		protected void outToeic(Exam exam) {
	//	int toeic;
		YBMExam ybmexam = (YBMExam)exam;
	//	toeic =ybmexam.getToeic();
		System.out.printf("toeic: %d\t", ybmexam.getToeic());
			
		}


}
