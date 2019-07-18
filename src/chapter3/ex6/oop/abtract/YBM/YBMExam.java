package chapter3.ex6.oop.abtract.YBM;

import chapter3.ex6.oop.abtract.Exam;

public class YBMExam extends Exam {

	private int toeic;

	public YBMExam() {
	
	}

	public YBMExam(int kor, int eng, int math, int toeic) {

		super(kor,eng, math);
		this.toeic = toeic; //super로 생성자 호출 후에 this 들어가는 순
	}

	public int getToeic() {
		return toeic;
		
	}
	
	public void setToeic(int toeic) {
		this.toeic = toeic;
	}
	

	@Override
	public int total() {

		return baseTotal() + toeic; // baseTotal 은 자식 밖에서는 사용하지 못하도록 하게 막고 자식에게 물려주기
		//protected는 패키지가 같아도 외부에서 노출되지 않도록 하는게 옳은 방식
	}
	
	@Override
	public float getAvg() {
		return  total()/4 ;
	} //틀로서 사용하겠다
	

	//getAvg 구현이 안되면 오류가 난다. 


}
