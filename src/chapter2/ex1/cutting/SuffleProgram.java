package chapter2.ex1.cutting;

public class SuffleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "photo.jpg"; //���ڿ� ��ü�� �Ǿ. 
		System.out.println(fileName.length()); // .length()�� ����ϸ� fileName�� ���ڿ� ���̸� �� �� �ִ�. 
		
		//���ϸ��� �ҷ����̰� Ȯ��� ���� �̸��� ����ϰ� ���� ��   .jpg�� ��ġ�� �˾Ƽ� �߶�� �Ѵ�. �ᱹ '.'�� ��ġ�� �˾ƾ��Ѵ�
		System.out.println(fileName.indexOf("."));   // .�� 5��° ��ġ�� �����Ѵ�. ���ڿ� �� �� 0���� �����ؾ���. 
		
		//���� ���ڸ� �߶� �������� ��� ex) ���ϸ��� 4��° ���ڱ����� ����ϱ�
		System.out.println(fileName.substring(0, fileName.indexOf(".")));   
		
		// ���� . ���� ���� �Ǵµ� �����̸�.�̸�.Ȯ������ ��� ������ �߻��ϴ� �ڿ��� ���� �ε����� ã�ƺ����Ѵ�. �׶� ����ϴ� ���� lastIndexOf()  <- �ε����� ���� �ڿ��� ���� ã�� �� 
		System.out.println(fileName.substring(0, fileName.lastIndexOf(".")));   
	
		System.out.println(fileName.substring( fileName.lastIndexOf(".")+1)); // substring(6)�̶�� �ϸ� 6��°���� �� ������° ������ 
		
		String data = "ȫ �浿.�� ȣ��. �� �±�. �� �缮. �� ����";
		String[] name = data.split("\\.");
		System.out.println(name[1]);  //�ι�° �̸� ��� 
		System.out.println(name.length);		// ��� ���ڰ� ���Դ��� ����� ����������. 
		
		
	//	
		
		//String[] names = new String[12];
		//String[] names = {"������", "����ȯ", "������", "������", "������"};		
		
	}
                   
}
