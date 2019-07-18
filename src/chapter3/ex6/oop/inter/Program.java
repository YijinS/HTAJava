

package chapter3.ex6.oop.inter;

public class Program{

	public static void main(String[] args)
	{
		
		//함수안에서도 클래스가 구현될 수 있지만 밖의 클래스에선 인식이 되지 않아 일회성이다
/*		class AA implements PrintListener{
			@Override
			public void onPrint() {
				System.out.println("나도 구현");

			}*/
		//익명클래스로 구현
		TestConsole console = new TestConsole();
		/* 1)
		 * console.setListener(new PrintListener() {
		 * 
		 * @Override public void onPrint() { // TODO Auto-generated method stub
		 * System.out.println("나도 구현");
		 * 
		 * } } );
		 */
		
		/* 2) 람다식
		 * console.setListener( //내부적으로 생성된다 ()-> { //->는 어떻게 구현하는지의 절차를 나타내는법(?)
		 * System.out.println("나도 구현");
		 * 
		 * } );
		 */
		
		PrintListener listen = () ->{
			 System.out.println("나도 구현");
		};
		console.setListener(listen);
		console.print();
		}
	

	

}