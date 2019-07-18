package chapter4.ex1.exception;

public class Program {

	public static void main(String[] args) {
		//static이라 객체화 할 필요 없음
		
	
		//오류 받는 곳으로 오류를 받을것인지 말것인지 설정해야한다. catch할꺼면 try-catch문 다시 던질꺼면 throw를 또 쓰면된다. - 자바 실행환경이 오류를 받게 된다. 
		//예외가 하나가 아닌 여러개가 받아질 수 있다. 블록을 잡아서 이것만 잡겠다고 설정한다. 
			try {
				int x = Calculator.add(1000, 20);
				x = Calculator.div(20, -1);
				System.out.println("x : " +x);  //여기서 업무적인 오류가 난다. 
			} catch(noNegative e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) { //overThousand, noNegative가 아닌 Exception을 사용하면 모든 throw를 받는다.(단, 한가지 오류를 처리할 때만 사용)
				System.out.println(e.getMessage());
		
			} 
			finally {
				System.out.println("의도치 않은 오류 발생 ");
			}


	}

}
