package chapter4.ex4.collection;

import chapter3.ex1.capsule.Exam;


public class Program{
	public static void main(String[] args) {
		int x =3;
		double d = 4.323;
		Integer z = 4; //�ڵ� �ڽ� 
		Exam exam = new Exam();
		String s = "Hello";
	
		Object[] list = new Object[5]; //5���� ���� ������ش�(ũ�⸦ ���ϴ� ���� �迭)
		//object�� s�� �⺻���� �����ϰ� ��� ����. �⺻���� ��ü������ �ٲ��־�� �Ѵ�.
		list[0] = new Integer(x); //��Ƽ�� �ڽ��� ������� - wrapping or boxing (wrapper class)
		list[3] = new Double(d);
		list[4] = z;  //�ڵ� �ڽ̵Ǽ� new Integer(4)�� ����
		list[1] = exam;
		list[2] = s;
		
		//int x1 = list[4]; ������ ���� ������ �ڵ� �ڽ����� ���� list[4]�� ��üȭ �Ǿ� �������� �Ǿ��� int�� �⺻������ ��ġ�� �ȵǴ� ��
		//���� ����ȯ���� (Integer)list[4] ����� ��������
		for(int i=0; i<4; i++) {
			System.out.println(list[i]);

			
			
		}//a instanceof Integer -> a�� ��Ƽ���� ������Ʈ���� Ȯ���ϴ� ��
		  int a = 7;
		  double y = 3.4;

		  Object r = a + y;
		  System.out.println(r);

		  Object result = r;
	}
} 
//���׸�(������ Ŭ���� , Ʋ�� ���� ���̴�) - ������ ���� ������´�. �׷��� ����� � �ڷ����� �־ ��������� ���÷��� �ȴ�.