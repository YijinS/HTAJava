package chapter2.ex1.cutting;



import java.util.Random;



public class Loto2 {

	static int[] lotto = new int[6];

	static Random rand= new Random();

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		randomNum();

		lottoPrint();

		changeArray();

		System.out.println();

		lottoPrint();

		

		

		//로또 프로그램

		//1. 준비물



		

	}

	

	//1. 로또 배열에 랜덤 숫자를 채우기(중복체크)

	private static void randomNum() { // 로또 배열안에 수를 넣는다

		int i;

		for( i=0; i<6; i++) {

			 lotto[i] = rand.nextInt(45)+1;

		}

		//for(int a=0;a<i; a++) {

		//	if(a==i) 

		//		a--;

		//}

		

	}

	

	//2. 로또 배열을 출력

	private static void lottoPrint() { //로또 안의 수를 출력한다

		for(int j=0; j<6; j++)

			if(j<5)

				System.out.printf("%d,", lotto[j]);

			else

			    System.out.printf("%d", lotto[j]);

	}

	

	//3. 배열에서[0]번째 숫자와 [5]번째 숫자를 교환하기 

	private static void changeArray() {

			int a= 0;

			a = lotto[0];

			lotto[0]=lotto[5];

			lotto[5] = a;

	

	}

	



		

	

}