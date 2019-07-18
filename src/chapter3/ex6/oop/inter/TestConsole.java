package chapter3.ex6.oop.inter;

public class TestConsole {
	
	private PrintListener listener;
	
	public void setListener(PrintListener listener) {
		this.listener = listener;
	}

	public void input() {
		
		
	}
	
	public void print() {
		System.out.println("1");
		System.out.println("2");
		//	System.out.println("3"); // 이 3번이 나중에 다른 것으로 바뀔 수 있도록 만들기 . 이기능을 추상 메소드처럼 자식이 만들게 하는 것이 아닌 
		//다른 애가 기능을 구현 할 수 있도록 하는 것이 인터페이스.  인터페이스는 클래스가 아니어도 된다. - 데이터를 사용하지 않는다. 
		
		//onprint가 사용되야 할 곳이 listener 이를 구현하는 것이 Printlistener,.  구현하는 애가 인터페이스 목록을 정의한다. - 함수를 여러개 묶을 수 있는 이름이 printlistener
		listener.onPrint();
		
		
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");

		
	}
	
	
	
	
	

}
