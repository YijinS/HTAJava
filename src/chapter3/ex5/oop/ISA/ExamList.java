package chapter3.ex5.oop.ISA;
//ExamConsole의 dependency object 의존적인 객체 ????

/* 사용자 UI와 성적을 관리하는 코드를 분리 - UI 관련 코드를 분리(ExamConsole.java) */
/*add(Exam), get():Exam*/
public class ExamList {
	
	private Exam[] list;  
	private int current;

	public Exam[] getList() {
		return list;
	}


	public void setList(Exam[] list) {
		this.list = list;
	}


	public ExamList() {
		this.list = new Exam[3];   
		this.current =0;
	}


	public int getCurret() {
		return current;
	}


	public void add(Exam exam) {
		list[current] = exam;
		current ++;
	}


	public int size() {
		return current;
	}


	public Exam get(int i) {
		return list[i];
	}

	

}
