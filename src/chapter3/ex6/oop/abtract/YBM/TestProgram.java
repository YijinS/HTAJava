package chapter3.ex6.oop.abtract.YBM;

import chapter3.ex6.oop.abtract.ExamConsole;

public class TestProgram {

	public static void main(String[] args) {

		//Exam은 공통분모. 우리가 원하는 것은 newlecExam
		//Exam은 공통분모로 사용하려면 new를 사용하면 안된다.
		
//		Exam exam= new YBMExam(0, 0, 0);
		//자료형을 YBMExam 으로 한정하지 말고 Exam으로 하는 것이 좋은데.,. 
		// 자료형은 자기가 쓰고자하는 걸로 사용하는 것이 좋기때문. 
		//exam.getAvg는 kor, math, 등의 과목수가 바뀌면 소용이 없어짐. 그러니까 안의 기능은 없애고 
		//공통문모로 이름앞에 abstract를 붙인다.
		ExamConsole console = new YBMExamConsole();
		//요기서 console.onInput() 이렇게 사용하면 안뎀
		console.input();
		console.output();
	}

}
