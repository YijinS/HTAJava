package chapter2.ex1.array;
import java.util.Scanner;
public class OmokColor2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 100;
		//변수 배열을 이용해 흑색, 백색 오목을 두자
		int[] colors = new  int[size]; 

		int[] xs = new int[size] ;
		int[] ys = new int[size] ;
		
		int current =0;
		
		
		while(true) {
			for(int y=1; y<=10; y++) {
				for(int x=1; x<=10; x++) {	
					//출력하고자 하는 문자의 순서를 정해야 한다. 특이한 케이스는 앞으로 
					//자주 출력되는 경우는 밑으로 둔다. 
					boolean put = false; //초기값 false
					
					for(int i=0; i<size; i++) 
						if(x==xs[i] && y==ys[i]) {

							if(colors[i]%2!=0)  
								System.out.printf("%c", '★')	;

							else 
								System.out.printf("%c", '☆')	;

							put = true; //true로 변경
							break;
						}

					if(put != true) { //false면 밑에 코드를 출력해라 
						if(x==1&&y==1)
							System.out.printf("%c",'┌');
						else if(x==10&&y==1)
							System.out.printf("%c",'┐');
						else if(x==1&&y==10)
							System.out.printf("%c",'└');
						else if(x==10&&y==10)
							System.out.printf("%c",'┘');
						else if(y==1)	
							System.out.printf("%c",'┬');
						else if(y==10)
							System.out.printf("%c",'┴');
						else if(x==1)
							System.out.printf("%c",'├');
						else if(x==10)
							System.out.printf("%c",'┤');
						else
							System.out.printf("%c", '┼');
					} //boolean 종료 

				}
				System.out.println();
			
			}
			System.out.println("x와 y좌표를 스페이스로 구분해서 입력>");

			xs[current] = scan.nextInt(); 
			ys[current] = scan.nextInt();
		//	colors[current] = current%2;
	
			current +=1;
			

		}
	}
}
