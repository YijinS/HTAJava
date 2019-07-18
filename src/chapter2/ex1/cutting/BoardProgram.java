package chapter2.ex1.cutting;

public class BoardProgram {
	static int[] xs = new int[] {3,3,4,4}; //��������
	static int[] ys = new int[] {4,5,5,6};		
	static int[] color = new  int[] {0,1,0,1}; //0�̸� ��, 1�̸� ��

	//	[���� ��ġ(x,y)�� ����]�� 1.ã�� 2.����ϴ� �ڵ�    -> �ΰ��� ������ �����Ѵ�. 1. ���� ��ġ�� ������ ã��	int idx =  findOmok(x,y)     
	//	findOmok���� ����Ǽ� ��ȯ�� ���� idx�� ����=  ��ã���� -1, 0�̸� ã��
	
	private static void printOmok(int idx) { //idx��° ������ ������ �������� ������ ����ϴ� �κ�
		if(color[idx] == 1)  //color�� �迭 1 2 3 4 ������ ���� �� �ȿ� 0�̸� �� 1�̸� �浹 
		System.out.printf("%c", '��')	;
		else 
			System.out.printf("%c", '��');
	}
	//	2. ���� ��ġ�� ������ ����Ѵ�.void  print(int x,int  y) -> ����Ʈ�� ��ȯ�ϴ� ������ ����ϴ°� �ƴϱ� ����

	private static  int findOmok(int x, int y){
		//������ ã�� �κ� ��ȯ�� int, �Ű��� x,y <- x,y�� ���� �޴� ���̱� ������ �ڷ����� �־�� �Ѵ�. 
		// �Ű������� ���޵Ǵ� ������ () ���ο��� �����ؾ� �Ѵ�. �������� ��ȯ�ϵ��� int���� ���������� ���� ��ȯ���ִ�  return �� �����ؾ� �Ѵ�.
		//�ϴ� ��ȯ�� �տ��� private static�� �� ���̱� 
		//Ŭ������ �빮�� �Լ����� �ҹ��ڷ� �����Ѵ�. 
		for(int i=0; i<4; i++)   { //Ŭ������ �빮�� �Լ����� �ҹ��ڷ� �����Ѵ�. 
			if(x==xs[i] && y==ys[i]) 
					return i;  //ã���� �� �Ѱ��ִ� �� 
		
		}//for����

		return -1; //�� ã�������� �⺻��;
	}



	public static void main(String[] args) {
		//Top-down & Bottom-up

		for(int y=1; y<=10; y++) {
			for(int x=1; x<=10; x++) {	
				//����ϰ��� �ϴ� ������ ������ ���ؾ� �Ѵ�. Ư���� ���̽��� ������ 
				//���� ��µǴ� ���� ������ �д�. 

				int idx = findOmok(x,y);  //���� ���� ��ȯ1 2 3 4 ��
				
				if(idx != -1)
				printOmok(idx); //�ִ� ���� ���
	
				else
					if(x==1&&y==1)
						System.out.printf("%c",'��');
					else if(x==10&&y==1)
						System.out.printf("%c",'��');
					else if(x==1&&y==10)
						System.out.printf("%c",'��');
					else if(x==10&&y==10)
						System.out.printf("%c",'��');
					else if(y==1)	
						System.out.printf("%c",'��');
					else if(y==10)
						System.out.printf("%c",'��');
					else if(x==1)
						System.out.printf("%c",'��');
					else if(x==10)
						System.out.printf("%c",'��');
					else
						System.out.printf("%c", '��');
			
			}
			System.out.println();
		}

	}
}
