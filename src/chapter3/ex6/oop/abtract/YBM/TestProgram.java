package chapter3.ex6.oop.abtract.YBM;

import chapter3.ex6.oop.abtract.ExamConsole;

public class TestProgram {

	public static void main(String[] args) {

		//Exam�� ����и�. �츮�� ���ϴ� ���� newlecExam
		//Exam�� ����и�� ����Ϸ��� new�� ����ϸ� �ȵȴ�.
		
//		Exam exam= new YBMExam(0, 0, 0);
		//�ڷ����� YBMExam ���� �������� ���� Exam���� �ϴ� ���� ������.,. 
		// �ڷ����� �ڱⰡ �������ϴ� �ɷ� ����ϴ� ���� ���⶧��. 
		//exam.getAvg�� kor, math, ���� ������� �ٲ�� �ҿ��� ������. �׷��ϱ� ���� ����� ���ְ� 
		//���빮��� �̸��տ� abstract�� ���δ�.
		ExamConsole console = new YBMExamConsole();
		//��⼭ console.onInput() �̷��� ����ϸ� �ȵ�
		console.input();
		console.output();
	}

}
