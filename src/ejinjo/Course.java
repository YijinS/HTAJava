package ejinjo;

public class Course {
	//��ü: ����ȭ��, ����ȭ�� ������(CLASS) 
	//�޸𸮻� ������. new���ؾ߸� = Ŭ������ �ν��Ͻ��� �� ������ ������ ������ �ν��Ͻ� ������� �Ѵ�. 
	//static�� �ٿ� �����������Ǹ� ���α׷��� �ε尡 ���ڸ��� �޸𸮿� ���� 
	//�Լ����� ������ ȣ��� �� ������. 
	
	int id;
	int capacity; // Ŭ���� �ο���
	int groupCount; // Ŭ������ �׷��� ��
	String[] members; //Ŭ�������� ������� �̸�. 
	String name; // Ŭ���� �̸�

	


}

//static int[] classCapacity = new int[100]; // Ŭ���� �ο���
//static int[] classIds = new int[100]; // Ŭ���� ���̵�
//static int choiceId; //�����Ϸ��� Ŭ���� ���̵� 
//static int[] groupCountOfClass = new int[100]; // Ŭ������ �׷��� ��
//static String[] classNames = new String[100]; // Ŭ���� �̸�
//static String[][] names = new String[100][30]; // 100���� Ŭ������ 20���� �̸��� �Է��Ѵ�