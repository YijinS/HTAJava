package chapter4.ex5.generic;

public class GList<T> {//���� <T>�� Ÿ���� ���� ��. �ڷ����� �������� ���� Ŭ����. - ���׸�: �����̵� �� �� �ִ� Ŭ����.
	//T�� ������ ������ �츮�� ������ �Ѵ�.��
	
	private T[] list;  //�����迭 - �ʿ��Ҷ����� �迭�� �÷�����
	private int current;
	private int capacity;
	public T[] getList() {
		return list;
	}


	public void setList(T[] list) {
		this.list = list;
	}


	public GList() {
		capacity = 3; 
		list = (T[]) new Object[capacity];   //Object �������� ���� T������ �ٲ��ش�. ��ü�� �����ϴ� �κ��� T�� �� �� ����.
		this.current =0;
	}


	public int getCurret() {
		return current;
	}


	public void add(T object) {
		if(capacity==current) {//�뷮�� ���ٸ� 1. ���ο� �迭 temp�� ����(������ �ִ� capacity��+10�� Ȯ���� ���ο� �迭) 2. ����Ʈ�� �ִ� ���� temp�� �ű��. 3. temp�� �����ϴ� ���� list�� �����ϵ���(temp�� �ּҸ� list���� �ش�)
			//capa�ϰ� currnet�� ���� ���̸� �뷮�� ���� ��
			Object j= 0;
			T[] temp = (T[]) new Object[capacity+10];  //Object �������� ���� T������ �ٲ��ش�.
			
			for(int i=0; i<current;i++) {
				temp[i]= list[i];
			
			}
			list = temp;
			capacity +=10;
			
		}
		list[current] = object;
		current ++;
	}


	public int size() {
		return current;
	}


	public T get(int i) {
		return list[i];
	}

	

}
