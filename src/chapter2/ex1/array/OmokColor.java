package chapter2.ex1.array;

public class OmokColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �迭�� �̿��� ���, ��� ������ ����
		int[] colors = new  int[] {0,1,0,1,1,0}; //0�̸� ��, 1�̸� ��
		int[] xs = new int[] {3,3,4,4,5,6};
		int[] ys = new int[] {4,5,5,6,3,4};		


		for(int y=1; y<=10; y++) {
			for(int x=1; x<=10; x++) {	
				//����ϰ��� �ϴ� ������ ������ ���ؾ� �Ѵ�. Ư���� ���̽��� ������ 
				//���� ��µǴ� ���� ������ �д�. 
				boolean put = false; //�ʱⰪ false

				for(int i=0; i<6; i++) 
					if(x==xs[i] && y==ys[i]) {
						
						if(colors[i]==0) 
						System.out.printf("%c", '��')	;
						
						else 
						System.out.printf("%c", '��')	;
						
						put = true; //true�� ����
						break;
					}

				if(put != true) { //false�� �ؿ� �ڵ带 ����ض� 
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
				} //boolean ���� 

			}
			System.out.println();


		}
	
	}

}
