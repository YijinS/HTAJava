package chapter2.ex2.suffle;

public class TestProgram1 {

	public static void main(String[] args) {
	
		Courses cls = new Courses(); //1.Value Ÿ�� ����	2. reference Ÿ�� ����
		//Ŭ������ ����Ÿ�� �����̴�. 
		//new�� ���� ��ü�� ���鶧 cls�� ������ �����. 
		//�� ������ ��ü�� �����̴�.  ex) int x �� �� x�� �� ��ü�� ������ ����
		cls.id = 3;
		cls.name = "�ڹ� Ǯ����";
		
		
		Courses[] classes = new Courses[10]; //Ŭ������ �����ϱ� ���� �����̸��� 10�� �迭�� ������������� Ŭ������� ��ü�� ������� �ƴϴ�. 
		
		// ��ü�� ������� new�� �ؾ��Ѵ�
		for(int i =0; i<classes.length; i++) {
			classes[i] = new Courses();
			}
		
		for(int j=0; j<classes.length; j++) {
			classes[j].id =3;
			System.out.printf("%d", classes[j].id);
			System.out.println();
		}
		
		
	}
}
