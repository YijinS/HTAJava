package chapter4.ex5.generic;

public class GList<T> {//아직 <T>의 타입이 뭔지 모름. 자료형이 정해지지 않은 클래스. - 제네릭: 무엇이든 될 수 있는 클래스.
	//T는 형식이 없으니 우리가 만들어야 한다.ㄴ
	
	private T[] list;  //동적배열 - 필요할때마다 배열을 늘려간다
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
		list = (T[]) new Object[capacity];   //Object 형식으로 만들어서 T형으로 바꿔준다. 객체를 생성하는 부분은 T로 쓸 수 없다.
		this.current =0;
	}


	public int getCurret() {
		return current;
	}


	public void add(T object) {
		if(capacity==current) {//용량이 없다면 1. 새로운 배열 temp를 생성(기존에 있는 capacity값+10개 확장한 새로운 배열) 2. 리스트에 있는 것을 temp로 옮긴다. 3. temp가 참조하는 것을 list가 참조하도록(temp의 주소를 list에게 준다)
			//capa하고 currnet가 같은 값이면 용량이 없는 것
			Object j= 0;
			T[] temp = (T[]) new Object[capacity+10];  //Object 형식으로 만들어서 T형으로 바꿔준다.
			
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
