package chapter2.ex1.array;
import java.util.Scanner;
public class OmokColor2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 100;
		//���� �迭�� �̿��� ���, ��� ������ ����
		int[] colors = new  int[size]; 

		int[] xs = new int[size] ;
		int[] ys = new int[size] ;
		
		int current =0;
		
		
		while(true) {
			for(int y=1; y<=10; y++) {
				for(int x=1; x<=10; x++) {	
					//����ϰ��� �ϴ� ������ ������ ���ؾ� �Ѵ�. Ư���� ���̽��� ������ 
					//���� ��µǴ� ���� ������ �д�. 
					boolean put = false; //�ʱⰪ false
					
					for(int i=0; i<size; i++) 
						if(x==xs[i] && y==ys[i]) {

							if(colors[i]%2!=0)  
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
			System.out.println("x�� y��ǥ�� �����̽��� �����ؼ� �Է�>");

			xs[current] = scan.nextInt(); 
			ys[current] = scan.nextInt();
		//	colors[current] = current%2;
	
			current +=1;
			

		}
	}
}
