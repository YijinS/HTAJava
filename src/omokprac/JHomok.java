package omokprac;

import java.util.Scanner;
public class JHomok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		  �Ѽ� ������ + �ߺ����� 
		 */

		Scanner scan = new Scanner(System.in);

		final int HEIGHT=10,WIDTH=10;
		char[][] board = new char[HEIGHT][WIDTH];

		int[] xs = new int[HEIGHT*WIDTH];
		int[] ys = new int[HEIGHT*WIDTH];
		int[] colors = new int[HEIGHT*WIDTH];
		int x,y;
		int count=0;
		int ch; // ����
		int back1=1,back2=1; //������ ����Ƚ��


		for(int i=0;i<HEIGHT;i++)
			for(int j=0;j<WIDTH;j++)
				if(i==0&&j==0)
					board[i][j] = '��';
				else if(i==0&&j==WIDTH-1)
					board[i][j] = '��';
				else if(i==HEIGHT-1&&j==0)
					board[i][j] = '��';
				else if(i==HEIGHT-1&&j==WIDTH-1)
					board[i][j] = '��';
				else if(i==0)
					board[i][j] = '��';
				else if(i==HEIGHT-1)
					board[i][j] = '��';
				else if(j==0)
					board[i][j] = '��';
				else if(j==WIDTH-1)
					board[i][j] = '��';
				else
					board[i][j] = '��';

		First:while(true) {
			for(int i=0;i<HEIGHT;i++) {
				for(int j=0;j<WIDTH;j++) {
					boolean ex=true;
					for(int k=0;k<count;k++)
						if(i==ys[k]-1 && j==xs[k]-1) {
							if(colors[k]==1)
								System.out.print("��");
							else
								System.out.print("��");
							ex=false;
							break;
						}
					if(ex)
						System.out.print(board[i][j]);
				}
				System.out.println();
			} 
			// �Ѽ�������
			if(count>1 && count%2==0 && back1>0) {
				System.out.print("�� �� �� ������?\n 1.y 2.n > ");
				ch = scan.nextInt();
				if(ch==1) {
					back1--;
					count=count-2;
					continue First;
				}
			}
			else if(count>1 && count%2==1 && back2>0) {
				System.out.print("�� �� �� ������?\n 1.y 2.n > ");
				ch = scan.nextInt();
				if(ch==1) {
					back2--;
					count=count-2;
					continue First;
				}
			}
			// �Է� �� �ߺ�����
			Second:do {
				if(count%2 == 0)
					System.out.println("�� ����");
				else
					System.out.println("�� ����");
				System.out.print("x sp y > ");
				//ch = scan.nextInt();
				x = scan.nextInt();
				y = scan.nextInt();
				if(x<=0||y<=0||x>=WIDTH||y>=HEIGHT)
					System.out.printf("0<x<%d , 0<y<%d ������ ���ڸ� �Է����ּ���.\n",WIDTH,HEIGHT);
				else {
					for(int i=0;i<count;i++) {
						if(x==xs[i]&&y==ys[i]) {
							System.out.println("���� ��ġ�� ���� �� �����ϴ�.");
							continue Second;
						}
					}
					xs[count] = x;
					ys[count] = y;
					colors[count] = count%2;
					count++;
					break;
				}   
			}while(true);



		}
	}

}
