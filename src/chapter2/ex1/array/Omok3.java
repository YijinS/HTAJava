package chapter2.ex1.array;
import java.util.Scanner;

//1. 아이템으로 조커(*)도 포함할 수 있도록 코드를 수정 
//2. 보드를 이쁘게 꾸며주세요
//3. 출력에 배열을 이용한다 = 출력 버퍼를 이용한다. -좌표 개념이 생긴다. 

public class Omok3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int WIDTH =15;
		final int HEIGHT =10;
		int size = 100;

		int[] xs = new int[size] ;
		int[] ys = new int[size] ;
		int current =0;
		
		int[] joker = new int[5]; //조커 다섯개 
		
		char[][] board = new char[HEIGHT][WIDTH]; //HEIGHT - 열, WIDTH - 행
		//1차원 배열 : char[] board = new char[WIDTH*HEIGHT];           ex) (3,2) -> [(X-1)+(Y-1)*WIDTH]
		//Q1. (3,2) => board[y][x]  1. 모든 배열 항목에 +문자로 채우기 (덮어쓰기 가능해짐)
		
		
		for(int a=0; a<HEIGHT; a++) { 
			for(int b=0; b<WIDTH; b++) { 
				board[a][b] = '┼';
				}
			}
		
		while(true) {
		//오목판 출력
	//	boolean put = false; //초기값 false	
		
		 for (int i = 0; i < board.length; i++) { 
			 System.out.println();
		      for (int j = 0; j < board[i].length; j++) { 
		        System.out.print(board[i][j] );	
		        

		      }
		    }
		 
		 System.out.println("\n");
		 //오목 입력
		 System.out.println("x와 y좌표를 스페이스로 구분해서 입력>");
		 int x = scan.nextInt();
		 int y =scan.nextInt();
		  
		 xs[current] = x;     //좌표 입력한 것을 각 x,y 배열에 저장한다. 저장하게 되면 배열안에 여태 쓴 좌표들이 쌓인다.  다음 좌표들로도 넘어간다.
		 ys[current] = y;    //xs, ys가 없어도 출력이되지만 각 x, y 저장은 안되나?
		 
		 current  +=1;
		 
		 board[x][y] = '○';
		// board[3][2] ='＃';
		 //while 종료
		 //2. 상단에 있는 내용을 ㅜ문자로 대치하기 
//		 if(board[0][WIDTH] ==0) {
//			 for(int d=0; d<WIDTH; d++)
//				 board[0][d] ='┬';
//		 }
//		System.out.println(board[HEIGHT][WIDTH]);
	
	}
}
}
