package chapter2.ex1.array;
import java.util.Scanner;

//1. ���������� ��Ŀ(*)�� ������ �� �ֵ��� �ڵ带 ���� 
//2. ���带 �̻ڰ� �ٸ��ּ���
//3. ��¿� �迭�� �̿��Ѵ� = ��� ���۸� �̿��Ѵ�. -��ǥ ������ �����. 

public class Omok3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int WIDTH =15;
		final int HEIGHT =10;
		int size = 100;

		int[] xs = new int[size] ;
		int[] ys = new int[size] ;
		int current =0;
		
		int[] joker = new int[5]; //��Ŀ �ټ��� 
		
		char[][] board = new char[HEIGHT][WIDTH]; //HEIGHT - ��, WIDTH - ��
		//1���� �迭 : char[] board = new char[WIDTH*HEIGHT];           ex) (3,2) -> [(X-1)+(Y-1)*WIDTH]
		//Q1. (3,2) => board[y][x]  1. ��� �迭 �׸� +���ڷ� ä��� (����� ��������)
		
		
		for(int a=0; a<HEIGHT; a++) { 
			for(int b=0; b<WIDTH; b++) { 
				board[a][b] = '��';
				}
			}
		
		while(true) {
		//������ ���
	//	boolean put = false; //�ʱⰪ false	
		
		 for (int i = 0; i < board.length; i++) { 
			 System.out.println();
		      for (int j = 0; j < board[i].length; j++) { 
		        System.out.print(board[i][j] );	
		        

		      }
		    }
		 
		 System.out.println("\n");
		 //���� �Է�
		 System.out.println("x�� y��ǥ�� �����̽��� �����ؼ� �Է�>");
		 int x = scan.nextInt();
		 int y =scan.nextInt();
		  
		 xs[current] = x;     //��ǥ �Է��� ���� �� x,y �迭�� �����Ѵ�. �����ϰ� �Ǹ� �迭�ȿ� ���� �� ��ǥ���� ���δ�.  ���� ��ǥ��ε� �Ѿ��.
		 ys[current] = y;    //xs, ys�� ��� ����̵����� �� x, y ������ �ȵǳ�?
		 
		 current  +=1;
		 
		 board[x][y] = '��';
		// board[3][2] ='��';
		 //while ����
		 //2. ��ܿ� �ִ� ������ �̹��ڷ� ��ġ�ϱ� 
//		 if(board[0][WIDTH] ==0) {
//			 for(int d=0; d<WIDTH; d++)
//				 board[0][d] ='��';
//		 }
//		System.out.println(board[HEIGHT][WIDTH]);
	
	}
}
}
