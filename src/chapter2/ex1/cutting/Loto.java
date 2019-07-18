package chapter2.ex1.cutting;

import java.util.Random;

public class Loto {
	static Random rand= new Random();
	static int[] lotto = new int[6];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또 프로그램
		//1. 준비물
		int[] lotto = new int[6];
		int i;
		for( i=0; i<6; i++) {
			 lotto[i] = rand.nextInt(45)+1;
		}
		for(int j=0; j<i; j++) {
			if(j==i) 
				j--;
		System.out.println((j+1)+"번 째 로또 번호는 : " +lotto[j]);
		
		}
		
		
		//2. 로또 번호를 초기화
//		for(int i = 0; i<6; i++) {
//			int x = rand.nextInt(45)+1;
//		
//			System.out.println(x);
//		}
		//3. 입력
		
		//4. 출력
	}
	

}
