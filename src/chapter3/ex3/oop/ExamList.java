package chapter3.ex3.oop;

import java.util.Scanner;

public class ExamList {
	
	Exam[] list;  //������ �����ϴ� �κ����� ���� ����� �κ��� �ƴϱ� ������ new�� ���� �ʴ´�.
	int current;

//	public static void init(ExamList exam) {   //static ���� this�� �� �� ����
//		exam.list = new Exam[3];
//		exam.current =0;
//	}
	
	public ExamList() {
		this.list = new Exam[3];   //this�� �ʵ庯���� ��Ÿ����. �ʵ庯�� list, current
		this.current =0;
	}

//	public void reset() { //static�� ������ instance �޼ҵ尡 �ƴϴ�. static�� ������ �Ű������� �޴µ� ������ �ȹ�?
//		this.list = new Exam[3];   //this�� �ʵ庯���� ��Ÿ����. �ʵ庯�� list, current
//		this.current =0;
//	}
	
	public void input() {
		//���� �̸��� ���� ��� ���� ��ȭ�Ǽ� ������ ������ �߻��� �� �ִ�. exam�� ���� �������� ���� ���ϴ´�� ���� �� �ִ�. (�̸��� ���� �ᵵ �ٸ� �̸��̴�)
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		int current = this.current;

		Exam[] list  = this.list;
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

		list[current] = new Exam();
		list[current].kor = kor;
		list[current].eng = eng;
		list[current].math = math;

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
			kor  = list[i].kor;
			eng = list[i].eng;
			math = list[i].math;
			int total = kor + eng + math;
			float avg = total/3.0f;

			System.out.printf("%d, kor: %d, eng: %d, math: %d, total: %d, avg: %f\n"
					, i+1, kor, eng, math, total, avg);

		}
		System.out.println("����������������������������������������������������������");
	

	}

}
