package omokprac;




//가운데 오목판 무늬 변경
//중복
//승패 가로줄 
import java.util.Scanner;

public class ungomok {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 사용자 입력 장치
		final int WIDTH = 15;// 오목판 가로축
		final int HIGHT = 10;// 오목판 세로축
		int current = 0; // 오목을 두는 순서
		char[] deco = { '“', '”', '‘' }; // 오목판 테두리 데코

		int xs[] = new int[WIDTH * HIGHT]; // x축 오목 위치 저장 배열
		int ys[] = new int[WIDTH * HIGHT]; // y축 오목 위치 저장 배열

		char[][] board = new char[HIGHT][WIDTH];// 오목판 배열
		// 오목판 제작
		System.out.println("바둑판 데코 1.“ 2.’3.”4.기본");
		int number = sc.nextInt();
		// 오목판 제작시 데코 선택 switch문 생성
		switch (number) {
		case 0:
			for (int y = 0; y < HIGHT; y++) { // y축 반복
				for (int x = 0; x < WIDTH; x++) {// x축 반복
					board[y][x] = deco[1];// 가운데
					board[y][0] = '├';// 테두리
					board[0][x] = '┬';// 테두리
					board[HIGHT - 1][x] = '┴';// 테두리
					board[y][WIDTH - 1] = '┤';// 테두리
					board[0][0] = '┌';// 모서리
					board[0][WIDTH - 1] = '┐';// 모서리
					board[HIGHT - 1][WIDTH - 1] = '┘';// 모서리
					board[HIGHT - 1][0] = '└';// 모서리
				} // x축 반복 end
			} // y축 반복 end
			break;
		case 1:
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					board[y][x] = deco[2];
					board[y][0] = '├';
					board[0][x] = '┬';
					board[HIGHT - 1][x] = '┴';
					board[y][WIDTH - 1] = '┤';
					board[0][0] = '┌';
					board[0][WIDTH - 1] = '┐';
					board[HIGHT - 1][WIDTH - 1] = '┘';
					board[HIGHT - 1][0] = '└';
				}
			}
			break;
		case 2:
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					board[y][x] = deco[3];
					board[y][0] = '├';
					board[0][x] = '┬';
					board[HIGHT - 1][x] = '┴';
					board[y][WIDTH - 1] = '┤';
					board[0][0] = '┌';
					board[0][WIDTH - 1] = '┐';
					board[HIGHT - 1][WIDTH - 1] = '┘';
					board[HIGHT - 1][0] = '└';
				}
			}
			break;
		}// 오목판 제작시 데코 선택 switch문 생성 end

		// 오목 게임 반복
		while (true) {
			// 오목판 콘솔 출력 for문
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					System.out.print(board[y][x]);
				} // x축 반복 end
				System.out.println();// 콘솔 y축 구분 개행
			} // y축 반복 end
			//승패 확인 반복문  가로만 가능 
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					//y축이 고정일때 
					if (board[y][x] == '○') { 
						if(board[y][x]==board[y][x+1]&&
								board[y][x]==board[y][x+2]&&
								board[y][x]==board[y][x+3]&&
								board[y][x]==board[y][x+4]&&
								board[y][x]== '○') { // 연속적으로 같은돌인지 
							System.out.println("백승");
							System.out.println("게임 끝났다 그만 입력해 ");
						}
					}
					else if (board[y][x] == '●') {
						if(board[y][x]==board[y][x+1]&&
								board[y][x]==board[y][x+2]&&
								board[y][x]==board[y][x+3]&&
								board[y][x]==board[y][x+4]&&
								board[y][x]== '●') {
							System.out.println("검승");
							System.out.println("게임 끝났다 그만 입력해 ");
						}	
					}
				}
			}// 승패 확인 반복문 end
			boolean overlap = false; // 입력값이 확인 될때까지

			while (!overlap) {// 중복이 되지않을때 까지 입력 반복
				boolean nothing = true; // 중복확인
				System.out.print("x sp y >");
				xs[current] = sc.nextInt(); // 원하는 x축 입력
				ys[current] = sc.nextInt(); // 원하는 y축 입력

				for (int i = 0; i < current; i++) { // 중복값 있는지 확인
					if (xs[i] == xs[current] && ys[i] == ys[current]) {
						nothing = false; // 있다면 중복확인 해줌.
						break;// 찾으면 반복문 그만
					}
				} // 중복값 있는지 확인 end
				if (nothing && current % 2 == 0) { // 중복이없고 선자
					board[ys[current]][xs[current]] = '●'; // 오목판 검돌 위치 값 저장.
					overlap = true;
				} else if (nothing && current % 2 != 0) { // 중복이 없고 후자
					board[ys[current]][xs[current]] = '○'; // 오목판 검돌 위치 값 저장.
					overlap = true;
				} else // 중복이면 출력
					System.out.println("이미 둔 자리 다시 선택");
			} // 중복이 되지않을때 까지 입력 반복end
			current++; // 다음 순서 생성
		} // 오목 게임 반복 end








	}

}
