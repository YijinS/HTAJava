package chapter2.ex1.array;
import java.util.Scanner;

public class TestProgram {
	public static void main(String[] args) {
		// ����ڷκ��� �Է¹��� ������ ��ġ�� xs, ys �迭�� ����ִ�

		int x, y=0;
		int xs[] = new int[] {3,3,4,4};
		int ys[] = new int[] {4,5,5,6};


		for( y=1; y<11; y++) 
		{ //y��   
			for(x=1; x<11; x++) //x�� 
			{

				boolean put =false;

				for(int k=0; k<4; k++) 
					if(x==xs[k]&&y==ys[k]) {
						System.out.printf("%c", '��');
						put = true;
						break;
					}

				if(!put)
				System.out.printf("%c", '��');

			}
			System.out.println();
		}


	}

}
