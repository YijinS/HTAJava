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
		//	System.out.println("3"); // �� 3���� ���߿� �ٸ� ������ �ٲ� �� �ֵ��� ����� . �̱���� �߻� �޼ҵ�ó�� �ڽ��� ����� �ϴ� ���� �ƴ� 
		//�ٸ� �ְ� ����� ���� �� �� �ֵ��� �ϴ� ���� �������̽�.  �������̽��� Ŭ������ �ƴϾ �ȴ�. - �����͸� ������� �ʴ´�. 
		
		//onprint�� ���Ǿ� �� ���� listener �̸� �����ϴ� ���� Printlistener,.  �����ϴ� �ְ� �������̽� ����� �����Ѵ�. - �Լ��� ������ ���� �� �ִ� �̸��� printlistener
		listener.onPrint();
		
		
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");

		
	}
	
	
	
	
	

}
