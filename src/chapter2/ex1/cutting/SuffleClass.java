package chapter2.ex1.cutting;

import java.util.Random;

public class SuffleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int[] suffle = new int[12];
		int[] team = new int[3]; //�� 3���� ������
	
		String[] data = {"������", "����ȯ", "������", "������", "������", 
										"��Լ�", "������", "���μ�", "�����", "������", 
										"������", "õ����"};
		int j;
		int r =0;
		int cnt=0;
		//�������� �̸� ����
		for( j=0; j<20; j++) {
		 r = rand.nextInt(12);
		 String  a= data[r]; 
		 data[r] =data[0];
		data[0] = a;
		cnt++;
		}
		
		
		for(int i=0; i<data.length;i++) {
		System.out.println(data[i]);
}

		// 1.  �����ؼ� �̸��� ���� ���� data �迭�� ��´�
	
			 
	}
		//2. ���� �迭�� ��� �̸� ����غ��� �迭���� �̸��� ���� �Լ��� ���´�
		//3. ���� �Լ��� ���� �̸���  �� ������ ���� �ִ´�. 
	}


