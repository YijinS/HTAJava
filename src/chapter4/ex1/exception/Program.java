package chapter4.ex1.exception;

public class Program {

	public static void main(String[] args) {
		//static�̶� ��üȭ �� �ʿ� ����
		
	
		//���� �޴� ������ ������ ���������� �������� �����ؾ��Ѵ�. catch�Ҳ��� try-catch�� �ٽ� �������� throw�� �� ����ȴ�. - �ڹ� ����ȯ���� ������ �ް� �ȴ�. 
		//���ܰ� �ϳ��� �ƴ� �������� �޾��� �� �ִ�. ����� ��Ƽ� �̰͸� ��ڴٰ� �����Ѵ�. 
			try {
				int x = Calculator.add(1000, 20);
				x = Calculator.div(20, -1);
				System.out.println("x : " +x);  //���⼭ �������� ������ ����. 
			} catch(noNegative e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) { //overThousand, noNegative�� �ƴ� Exception�� ����ϸ� ��� throw�� �޴´�.(��, �Ѱ��� ������ ó���� ���� ���)
				System.out.println(e.getMessage());
		
			} 
			finally {
				System.out.println("�ǵ�ġ ���� ���� �߻� ");
			}


	}

}
