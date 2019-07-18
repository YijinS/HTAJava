package chapter3.ex6.oop.abtract.YBM;

import chapter3.ex6.oop.abtract.Exam;

public class YBMExam extends Exam {

	private int toeic;

	public YBMExam() {
	
	}

	public YBMExam(int kor, int eng, int math, int toeic) {

		super(kor,eng, math);
		this.toeic = toeic; //super�� ������ ȣ�� �Ŀ� this ���� ��
	}

	public int getToeic() {
		return toeic;
		
	}
	
	public void setToeic(int toeic) {
		this.toeic = toeic;
	}
	

	@Override
	public int total() {

		return baseTotal() + toeic; // baseTotal �� �ڽ� �ۿ����� ������� ���ϵ��� �ϰ� ���� �ڽĿ��� �����ֱ�
		//protected�� ��Ű���� ���Ƶ� �ܺο��� ������� �ʵ��� �ϴ°� ���� ���
	}
	
	@Override
	public float getAvg() {
		return  total()/4 ;
	} //Ʋ�μ� ����ϰڴ�
	

	//getAvg ������ �ȵǸ� ������ ����. 


}
