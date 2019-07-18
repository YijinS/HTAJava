package chapter4.ex4.collection;

public class ObjectList { //가변적 배열을 구현해 준다
	
	private Object[] list;  //동적배열 - 필요할때마다 배열을 늘려간다
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
		if(capacity==current) {//용량이 없다면 1. 새로운 배열 temp를 생성(기존에 있는 capacity값+10개 확장한 새로운 배열) 2. 리스트에 있는 것을 temp로 옮긴다. 3. temp가 참조하는 것을 list가 참조하도록(temp의 주소를 list에게 준다)
			//capa하고 currnet가 같은 값이면 용량이 없는 것
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
