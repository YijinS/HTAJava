//�Ȱ��� ���� �ƴ� ������ǰ�� ����Ÿ� Ʋ�� ����°��� ����(�߻�ȭ)
package chapter3.ex6.oop.abtract;

public abstract class Exam {//�������� ���α׷� 
	//abstract�� �߻��̶�� ���� �˷���. = ����ȭ & ���ȭ &����и�ȭ > �ڵ��� ����ȭ�� ����
	//�߻� Ŭ���� = ����и�ȭ�� Ŭ���� 
	//Ʋ�ν� ����ϰڴ� = �� ��ü�� ��ü�� �Ǹ� �ȵȴ�
	int kor; 
	int math;
	int eng;	
	
	public Exam() {
	
		this(0,0,0); //���� ���� �����ͼ� �ʱ�ȭ
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

	protected int baseTotal() { //protected�� �ڽ��� ��� ���������� �� �ǿ��� �ֵ��� ��� �Ұ�

		return  kor+math+eng;
	}
	//total�� ����� �� �ִ� �������� ���. �̸��� �ٲ㼭 ���� �Լ��� ����� ������� ���ϵ��� �ϰ� ��,��, ���� ���� ���� �ڽ��� �� �� �ֵ��� �Ѵ�.
	
	public abstract int total();

	public abstract float getAvg(); //���� ��ǰ�� avg�� ����. �ٵ� Ʋ�� ������. ���⼭ �����ϴ� ���� �ǹ̰� ���� ������ ... �θ�� �������ϰ� �ڽ����� �����϶�� ����
	//�ϴ� abstract Ű���� 
}
