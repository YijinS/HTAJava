package chapter4.ex1.exception;

//여러곳에서 다른용도로 사용하는 라이브러리 
public class Calculator {
	//업무적인 예외 덧셈의 합이 1000을 넘을 수 없다. 
	
	public static int add(int x, int y) throws overThousand { //this를 쓰지 않는 메소드들임 Calculator를 계속 객체화 할 필요가 없기 때문에 static을 사용한다. 
		//

		int result = x + y;
		if(result>1000)
			throw new overThousand(); //오류를 던지는 순간 throw가 제일 먼저 받는다. overThousand는 여러 예외를 처리할 수 있는데 ; 처리를 하여 하나만 처리하겠다고 끝내기

		return result;
	}
	
	//분모는 0과 음수가 될 수 없다. 

	public static int div(int x, int y) throws overThousand, noNegative {
		
		if(y<0)
			throw new noNegative();
		
		int result = x / y;

		return result;
	}
}
