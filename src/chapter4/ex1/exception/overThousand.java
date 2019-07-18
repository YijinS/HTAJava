package chapter4.ex1.exception;
//오로지 식별을 위해 쓴 객체 
public class overThousand extends Exception {

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "천을 넘는 오류";
	}
}
