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

		

		

		//�ζ� ���α׷�

		//1. �غ�



		

	}

	

	//1. �ζ� �迭�� ���� ���ڸ� ä���(�ߺ�üũ)

	private static void randomNum() { // �ζ� �迭�ȿ� ���� �ִ´�

		int i;

		for( i=0; i<6; i++) {

			 lotto[i] = rand.nextInt(45)+1;

		}

		//for(int a=0;a<i; a++) {

		//	if(a==i) 

		//		a--;

		//}

		

	}

	

	//2. �ζ� �迭�� ���

	private static void lottoPrint() { //�ζ� ���� ���� ����Ѵ�

		for(int j=0; j<6; j++)

			if(j<5)

				System.out.printf("%d,", lotto[j]);

			else

			    System.out.printf("%d", lotto[j]);

	}

	

	//3. �迭����[0]��° ���ڿ� [5]��° ���ڸ� ��ȯ�ϱ� 

	private static void changeArray() {

			int a= 0;

			a = lotto[0];

			lotto[0]=lotto[5];

			lotto[5] = a;

	

	}

	



		

	

}