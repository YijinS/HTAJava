package chapter2.ex1.array;

public class OmokArray {

	public static void main(String[] args) {
		// �迭�� �̿��� ���� ���α׷�
		// ����ڷκ��� �Է¹��� ������ ��ġ�� xs, ys �迭�� ����ִ�

		int[] xs = new int[] {3,3,4,4};
		int[] ys = new int[] {4,5,5,6};		

		char board[] = new char[200];

		for(int i=0; i<200; i++)
			board[i] = '��';

		
		for(int y=0; y<10; y++) {
			for(int x=0; x<10; x++) {	
				boolean put = false;

				for(int i=0; i<4; i++) 
					if(x==xs[i] && y==ys[i]) {
						System.out.printf("%c", '��')	;
						put = true;
						break;
					}

				if(put != true) {
				if(x==0) { 
					if(y==0)
						System.out.print("��");
					else if(y==9) 
						System.out.print("��");
					else
						System.out.print("��");
				}

				else if(x==9) { 
					if(y==0)
						System.out.print("��");
					else if(y==9) 
						System.out.print("��");
					else
						System.out.print("��");
				}
				else if(y==0){
					System.out.print("��");
				}
				else if(y==9){
					System.out.print("��");
				}
				else
					System.out.printf("%c", board[y*10+x]);
			}
			}
			System.out.println();

			
		}

	}
}
