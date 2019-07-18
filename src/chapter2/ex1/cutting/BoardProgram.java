package chapter2.ex1.cutting;

public class BoardProgram {
	static int[] xs = new int[] {3,3,4,4}; //전역변수
	static int[] ys = new int[] {4,5,5,6};		
	static int[] color = new  int[] {0,1,0,1}; //0이면 흑, 1이면 백

	//	[현재 위치(x,y)의 오목돌]을 1.찾아 2.출력하는 코드    -> 두개로 나눠서 구현한다. 1. 현재 위치의 오목을 찾다	int idx =  findOmok(x,y)     
	//	findOmok에서 실행되서 반환된 값이 idx에 들어간다=  못찾으면 -1, 0이면 찾음
	
	private static void printOmok(int idx) { //idx번째 오목의 색상을 기준으로 오목을 출력하는 부분
		if(color[idx] == 1)  //color의 배열 1 2 3 4 순으로 보고 그 안에 0이면 흰돌 1이면 흑돌 
		System.out.printf("%c", '★')	;
		else 
			System.out.printf("%c", '☆');
	}
	//	2. 현재 위치에 오목을 출력한다.void  print(int x,int  y) -> 프린트를 반환하는 것이지 출력하는게 아니기 때문

	private static  int findOmok(int x, int y){
		//오목을 찾는 부분 반환값 int, 매개값 x,y <- x,y도 값을 받는 것이기 때문에 자료형을 주어야 한다. 
		// 매개값으로 전달되는 변수는 () 내부에서 선언해야 한다. 정수값을 반환하도록 int형을 선언했으니 값을 반환해주는  return 도 선언해야 한다.
		//일단 반환값 앞에는 private static은 꼭 붙이기 
		//클래스는 대문자 함수명은 소문자로 시작한다. 
		for(int i=0; i<4; i++)   { //클래스는 대문자 함수명은 소문자로 시작한다. 
			if(x==xs[i] && y==ys[i]) 
					return i;  //찾았을 때 넘겨주는 값 
		
		}//for종료

		return -1; //못 찾았을때의 기본값;
	}



	public static void main(String[] args) {
		//Top-down & Bottom-up

		for(int y=1; y<=10; y++) {
			for(int x=1; x<=10; x++) {	
				//출력하고자 하는 문자의 순서를 정해야 한다. 특이한 케이스는 앞으로 
				//자주 출력되는 경우는 밑으로 둔다. 

				int idx = findOmok(x,y);  //오목 유무 반환1 2 3 4 들어감
				
				if(idx != -1)
				printOmok(idx); //있는 오목 출력
	
				else
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
			
			}
			System.out.println();
		}

	}
}
