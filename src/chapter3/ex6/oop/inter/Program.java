

package chapter3.ex6.oop.inter;

public class Program{

	public static void main(String[] args)
	{
		
		//�Լ��ȿ����� Ŭ������ ������ �� ������ ���� Ŭ�������� �ν��� ���� �ʾ� ��ȸ���̴�
/*		class AA implements PrintListener{
			@Override
			public void onPrint() {
				System.out.println("���� ����");

			}*/
		//�͸�Ŭ������ ����
		TestConsole console = new TestConsole();
		/* 1)
		 * console.setListener(new PrintListener() {
		 * 
		 * @Override public void onPrint() { // TODO Auto-generated method stub
		 * System.out.println("���� ����");
		 * 
		 * } } );
		 */
		
		/* 2) ���ٽ�
		 * console.setListener( //���������� �����ȴ� ()-> { //->�� ��� �����ϴ����� ������ ��Ÿ���¹�(?)
		 * System.out.println("���� ����");
		 * 
		 * } );
		 */
		
		PrintListener listen = () ->{
			 System.out.println("���� ����");
		};
		console.setListener(listen);
		console.print();
		}
	

	

}