package chapter4.ex4.collection;

public class ObjectList { //������ �迭�� ������ �ش�
	
	private Object[] list;  //�����迭 - �ʿ��Ҷ����� �迭�� �÷�����
	private int current;
	private int capacity;
	public Object[] getList() {
		return list;
	}


	public void setList(Object[] list) {
		this.list = list;
	}


	public ObjectList() {
		capacity = 3; 
		list = new Object[capacity];   
		this.current =0;
	}


	public int getCurret() {
		return current;
	}


	public void add(Object object) {
		if(capacity==current) {//�뷮�� ���ٸ� 1. ���ο� �迭 temp�� ����(������ �ִ� capacity��+10�� Ȯ���� ���ο� �迭) 2. ����Ʈ�� �ִ� ���� temp�� �ű��. 3. temp�� �����ϴ� ���� list�� �����ϵ���(temp�� �ּҸ� list���� �ش�)
			//capa�ϰ� currnet�� ���� ���̸� �뷮�� ���� ��
			Object j= 0;
			Object[] temp = new Object[capacity+10];
			
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


	public Object get(int i) {
		return list[i];
	}

	

}
