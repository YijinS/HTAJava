package chapter2.ex1.array;

public class OmokArrayRe {
	public static void main(String[] args) {


		int[] xs = new int[] {3,3,4,4,3,3};
		int[] ys = new int[] {4,5,5,6,2,7};		


		for(int y=1; y<=10; y++) {
			for(int x=1; x<=10; x++) {	
				//출력하고자 하는 문자의 순서를 정해야 한다. 특이한 케이스는 앞으로 
				//자주 출력되는 경우는 밑으로 둔다. 
				boolean put = false; //초기값 false

				for(int i=0; i<6; i++) 
					if(x==xs[i] && y==ys[i]) {
						System.out.printf("%c", '○')	;
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
	
	}
}
