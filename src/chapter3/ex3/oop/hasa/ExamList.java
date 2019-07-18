package chapter3.ex3.oop.hasa;

import java.util.Scanner;
/*
 * 객체의 결합 관계
 * 객체가 객체를 가지는 상속
 * 일명 마인부우 상속
 * -------------------------
 * 우리가 ExamList를 캡슐화라는 것을 했다.
 * 왜 했지? 어떤 장점이 있길래 "캡슐화"를 했지?
 * 
 * ->데이터구조를 사용하는 함수들을 묶어 놓은 것이 캡슐
 * ->데이터구조의 변경에 영향을 받는 함수들을 묶어 놓은 것이 캡슐
 * ->캡슐화의 장점은 외부에서의 변화로 함수가 영향을 받지 않게 하기 위한 캐슬?을 만드는 것
 * ->따라서, 은닉화는 캡슐을 완성시키는 가장 중요한 방법 또는 도구라고 할 수 있뜨아~~
 * 
 * 오늘의 내용은... 분명히 캡슐화를 했는데....
 * Exam 클래스에서 kor 변수를 변경하면 그 클래스 밖에 있는 ExamList 파일에서
 * 오류가 발생하는 것을 볼 수 있다.... 이 또한 캡슐화가 필요하지 아니한가..
 * 에 대한 내용입니다.
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
			System.out.printf("국어 %d", current+1);
			kor = scan.nextInt();

			if	(kor < 0 || 100 < 	kor )
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(kor<0 ||kor>100);


		do {
			System.out.printf("영어 %d", current+1);
			eng = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(eng<0 ||eng>100);

		do {
			System.out.printf("수학 %d", current+1);
			math = scan.nextInt();

			if	(eng < 0 || 100 < 	eng )
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		}while(math<0 ||math>100);

//		list[current] = new Exam(kor, eng, math);
		
		//원래 이렇게 쓰면 캡슐화 부분에서 안좋다. 
//		list[current].kor = kor;
//		list[current].eng = eng;
//		list[current].math = math;
		
//  ---------------------------------------
//		exam.setKor(kor);
//		exam.setMath(math);
//		exam.setEng(eng);
// 	이렇게 임시변수 사용하는 것이 좋음.
//		kor, eng, math 부분이 Exam.java에서 변경될 때 이곳에서 에러가 뜨기 때문에 그것을 방지하기 위해 함수를 넣어준다
//		Exam 클래스에 kor, eng, math를 넘겨받는 부분을 넣어준다. set() 사용 
		
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
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
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
		System.out.println("─────────────────────────────");


	}

}
