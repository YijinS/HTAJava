package ejinjo;

public class Course {
	//객체: 개념화된, 집합화된 데이터(CLASS) 
	//메모리상에 안잡힘. new를해야만 = 클래스가 인스턴스가 될 때마다 잡히는 변수로 인스턴스 변수라고 한다. 
	//static을 붙여 전역변수가되면 프로그램이 로드가 되자마자 메모리에 잡힘 
	//함수안의 변수는 호출될 때 잡힌다. 
	
	int id;
	int capacity; // 클래스 인원수
	int groupCount; // 클래스의 그룹의 수
	String[] members; //클래스안의 멤버들의 이름. 
	String name; // 클래스 이름

	


}

//static int[] classCapacity = new int[100]; // 클래스 인원수
//static int[] classIds = new int[100]; // 클래스 아이디
//static int choiceId; //선택하려는 클래스 아이디 
//static int[] groupCountOfClass = new int[100]; // 클래스의 그룹의 수
//static String[] classNames = new String[100]; // 클래스 이름
//static String[][] names = new String[100][30]; // 100개의 클래스에 20개의 이름을 입력한다