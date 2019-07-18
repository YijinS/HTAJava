//똑같은 것이 아닌 유사제품을 만들거면 틀로 만드는것이 좋다(추상화)
package chapter3.ex6.oop.abtract;

public abstract class Exam {//성적관리 프로그램 
	//abstract는 추상이라는 것을 알려줌. = 뼈대화 & 골격화 &공통분모화 > 코드의 집중화를 위함
	//추상 클래스 = 공통분모화된 클래스 
	//틀로써 사용하겠다 = 그 자체로 객체가 되면 안된다
	int kor; 
	int math;
	int eng;	
	
	public Exam() {
	
		this(0,0,0); //밑의 것을 가져와서 초기화
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

	protected int baseTotal() { //protected는 자식은 사용 가능하지만 그 의외의 애들은 사용 불가

		return  kor+math+eng;
	}
	//total을 사용할 수 있는 로직으로 사용. 이름을 바꿔서 서비스 함수로 기능을 사용하지 못하도록 하고 국,영, 수에 대한 것은 자식이 쓸 수 있도록 한다.
	
	public abstract int total();

	public abstract float getAvg(); //원래 제품의 avg는 빠짐. 근데 틀은 존재함. 여기서 구현하는 것은 의미가 없기 떄문에 ... 부모는 구현안하고 자식한테 구현하라고 강요
	//하는 abstract 키워드 
}
