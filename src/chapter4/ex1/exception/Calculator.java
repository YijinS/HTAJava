package chapter4.ex1.exception;

//���������� �ٸ��뵵�� ����ϴ� ���̺귯�� 
public class Calculator {
	//�������� ���� ������ ���� 1000�� ���� �� ����. 
	
	public static int add(int x, int y) throws overThousand { //this�� ���� �ʴ� �޼ҵ���� Calculator�� ��� ��üȭ �� �ʿ䰡 ���� ������ static�� ����Ѵ�. 
		//

		int result = x + y;
		if(result>1000)
			throw new overThousand(); //������ ������ ���� throw�� ���� ���� �޴´�. overThousand�� ���� ���ܸ� ó���� �� �ִµ� ; ó���� �Ͽ� �ϳ��� ó���ϰڴٰ� ������

		return result;
	}
	
	//�и�� 0�� ������ �� �� ����. 

	public static int div(int x, int y) throws overThousand, noNegative {
		
		if(y<0)
			throw new noNegative();
		
		int result = x / y;

		return result;
	}
}
