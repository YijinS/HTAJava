package ejinjo1;

public class Course {
	//��ü: ����ȭ��, ����ȭ�� ������(CLASS) 
	//�޸𸮻� ������. new���ؾ߸� = Ŭ������ �ν��Ͻ��� �� ������ ������ ������ �ν��Ͻ� ������� �Ѵ�. 
	//static�� �ٿ� �����������Ǹ� ���α׷��� �ε尡 ���ڸ��� �޸𸮿� ���� 
	//�Լ����� ������ ȣ��� �� ������. 
	int capacity; // Ŭ���� �ο���
	int groupCount; // Ŭ������ �׷��� ��
	String[] members; //Ŭ�������� ������� �̸�. 
	String name; // Ŭ���� �̸�
	int id;
	
	public Course(int id, int capacity, String[] members, String name) {
		this.id = id;
		this.capacity = capacity;
		this.members = members;
		this.name = name;
	}
	public Course() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getGroupCount() {
		return groupCount;
	}

	public void setGroupCount(int groupCount) {
		this.groupCount = groupCount;
	}

	public String[] getMembers() {
		return members;
	}

	public void setMembers(String[] members) {
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}

//static int[] classCapacity = new int[100]; // Ŭ���� �ο���
//static int[] classIds = new int[100]; // Ŭ���� ���̵�
//static int choiceId; //�����Ϸ��� Ŭ���� ���̵� 
//static int[] groupCountOfClass = new int[100]; // Ŭ������ �׷��� ��
//static String[] classNames = new String[100]; // Ŭ���� �̸�
//static String[][] names = new String[100][30]; // 100���� Ŭ������ 20���� �̸��� �Է��Ѵ�