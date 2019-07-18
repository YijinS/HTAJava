package chapter2.ex1.array;
import java.util.Scanner;

public class TestProgram {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 오목의 위치가 xs, ys 배열에 들어있다

		int x, y=0;
		int xs[] = new int[] {3,3,4,4};
		int ys[] = new int[] {4,5,5,6};


		for( y=1; y<11; y++) 
		{ //y축   
			for(x=1; x<11; x++) //x축 
			{

				boolean put =false;

				for(int k=0; k<4; k++) 
					if(x==xs[k]&&y==ys[k]) {
						System.out.printf("%c", '☆');
						put = true;
						break;
					}

				if(!put)
				System.out.printf("%c", '┼');

			}
			System.out.println();
		}


	}

}
