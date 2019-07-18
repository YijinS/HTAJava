package chapter4.ex1.exception;

public class noNegative extends Exception {

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "분모가 음수인 오류";
	}
}
