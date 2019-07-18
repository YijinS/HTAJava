package chapter3.ex5.oop.ISA;
//ExamConsole�� dependency object �������� ��ü ????

/* ����� UI�� ������ �����ϴ� �ڵ带 �и� - UI ���� �ڵ带 �и�(ExamConsole.java) */
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
