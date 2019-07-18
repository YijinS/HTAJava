package chapter3.ex5.oop.ISA;

public class Exam {//己利包府 橇肺弊伐 

	int kor; 
	int math;
	int eng;	
	
	public Exam() {
	
		
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng  = eng;
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getTotal() {

		return  kor+math+eng;
	}

	public float getAvg() {

		return  getTotal()/3.0f;
	}
	
}
