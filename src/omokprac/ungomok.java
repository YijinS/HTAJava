package omokprac;




//��� ������ ���� ����
//�ߺ�
//���� ������ 
import java.util.Scanner;

public class ungomok {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// ����� �Է� ��ġ
		final int WIDTH = 15;// ������ ������
		final int HIGHT = 10;// ������ ������
		int current = 0; // ������ �δ� ����
		char[] deco = { '��', '��', '��' }; // ������ �׵θ� ����

		int xs[] = new int[WIDTH * HIGHT]; // x�� ���� ��ġ ���� �迭
		int ys[] = new int[WIDTH * HIGHT]; // y�� ���� ��ġ ���� �迭

		char[][] board = new char[HIGHT][WIDTH];// ������ �迭
		// ������ ����
		System.out.println("�ٵ��� ���� 1.�� 2.��3.��4.�⺻");
		int number = sc.nextInt();
		// ������ ���۽� ���� ���� switch�� ����
		switch (number) {
		case 0:
			for (int y = 0; y < HIGHT; y++) { // y�� �ݺ�
				for (int x = 0; x < WIDTH; x++) {// x�� �ݺ�
					board[y][x] = deco[1];// ���
					board[y][0] = '��';// �׵θ�
					board[0][x] = '��';// �׵θ�
					board[HIGHT - 1][x] = '��';// �׵θ�
					board[y][WIDTH - 1] = '��';// �׵θ�
					board[0][0] = '��';// �𼭸�
					board[0][WIDTH - 1] = '��';// �𼭸�
					board[HIGHT - 1][WIDTH - 1] = '��';// �𼭸�
					board[HIGHT - 1][0] = '��';// �𼭸�
				} // x�� �ݺ� end
			} // y�� �ݺ� end
			break;
		case 1:
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					board[y][x] = deco[2];
					board[y][0] = '��';
					board[0][x] = '��';
					board[HIGHT - 1][x] = '��';
					board[y][WIDTH - 1] = '��';
					board[0][0] = '��';
					board[0][WIDTH - 1] = '��';
					board[HIGHT - 1][WIDTH - 1] = '��';
					board[HIGHT - 1][0] = '��';
				}
			}
			break;
		case 2:
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					board[y][x] = deco[3];
					board[y][0] = '��';
					board[0][x] = '��';
					board[HIGHT - 1][x] = '��';
					board[y][WIDTH - 1] = '��';
					board[0][0] = '��';
					board[0][WIDTH - 1] = '��';
					board[HIGHT - 1][WIDTH - 1] = '��';
					board[HIGHT - 1][0] = '��';
				}
			}
			break;
		}// ������ ���۽� ���� ���� switch�� ���� end

		// ���� ���� �ݺ�
		while (true) {
			// ������ �ܼ� ��� for��
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					System.out.print(board[y][x]);
				} // x�� �ݺ� end
				System.out.println();// �ܼ� y�� ���� ����
			} // y�� �ݺ� end
			//���� Ȯ�� �ݺ���  ���θ� ���� 
			for (int y = 0; y < HIGHT; y++) {
				for (int x = 0; x < WIDTH; x++) {
					//y���� �����϶� 
					if (board[y][x] == '��') { 
						if(board[y][x]==board[y][x+1]&&
								board[y][x]==board[y][x+2]&&
								board[y][x]==board[y][x+3]&&
								board[y][x]==board[y][x+4]&&
								board[y][x]== '��') { // ���������� ���������� 
							System.out.println("���");
							System.out.println("���� ������ �׸� �Է��� ");
						}
					}
					else if (board[y][x] == '��') {
						if(board[y][x]==board[y][x+1]&&
								board[y][x]==board[y][x+2]&&
								board[y][x]==board[y][x+3]&&
								board[y][x]==board[y][x+4]&&
								board[y][x]== '��') {
							System.out.println("�˽�");
							System.out.println("���� ������ �׸� �Է��� ");
						}	
					}
				}
			}// ���� Ȯ�� �ݺ��� end
			boolean overlap = false; // �Է°��� Ȯ�� �ɶ�����

			while (!overlap) {// �ߺ��� ���������� ���� �Է� �ݺ�
				boolean nothing = true; // �ߺ�Ȯ��
				System.out.print("x sp y >");
				xs[current] = sc.nextInt(); // ���ϴ� x�� �Է�
				ys[current] = sc.nextInt(); // ���ϴ� y�� �Է�

				for (int i = 0; i < current; i++) { // �ߺ��� �ִ��� Ȯ��
					if (xs[i] == xs[current] && ys[i] == ys[current]) {
						nothing = false; // �ִٸ� �ߺ�Ȯ�� ����.
						break;// ã���� �ݺ��� �׸�
					}
				} // �ߺ��� �ִ��� Ȯ�� end
				if (nothing && current % 2 == 0) { // �ߺ��̾��� ����
					board[ys[current]][xs[current]] = '��'; // ������ �˵� ��ġ �� ����.
					overlap = true;
				} else if (nothing && current % 2 != 0) { // �ߺ��� ���� ����
					board[ys[current]][xs[current]] = '��'; // ������ �˵� ��ġ �� ����.
					overlap = true;
				} else // �ߺ��̸� ���
					System.out.println("�̹� �� �ڸ� �ٽ� ����");
			} // �ߺ��� ���������� ���� �Է� �ݺ�end
			current++; // ���� ���� ����
		} // ���� ���� �ݺ� end








	}

}
