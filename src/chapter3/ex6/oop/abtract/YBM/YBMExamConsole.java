package chapter3.ex6.oop.abtract.YBM;

import java.util.Scanner;

import chapter3.ex6.oop.abtract.Exam;
import chapter3.ex6.oop.abtract.ExamConsole;

//국영수외에 확장된 기능을 위함
//국영수는 Exam의 기능을 사용
public class YBMExamConsole extends ExamConsole{

//	YBMExam exam1 = new YBMExam();
//	int toeic = exam1.getToeic();

	
	@Override
	protected Exam newExam() {
		
		return new YBMExam();
	}

	@Override
	protected void onInput(Exam exam, int num) { //YBM 콘솔 부분에서 따로 입력받고 싶은 값을 위한 구현부분 ex토익
		int toeic;
		YBMExam  YBMexam = (YBMExam) exam; //Exam의 exam을 자식껄로 강제 형변환 
		
		Scanner scan = new Scanner(System.in);

		do {
			System.out.printf("toeic %d", num+1);
			toeic = scan.nextInt();

			if	(toeic < 0 || 100 < 	toeic )
				System.out.println("toeic성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(toeic<0 ||toeic>100);
		
		//exam.setToeic(toeic);  얘 형식이 Exam 이라 오류가 난다 형식을 YBM으로 하고 강제 형변환으로 EXAM을 자식것으로 만든다
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
