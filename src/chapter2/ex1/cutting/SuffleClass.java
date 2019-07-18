package chapter2.ex1.cutting;

import java.util.Random;

public class SuffleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int[] suffle = new int[12];
		int[] team = new int[3]; //팀 3조로 나누기
	
		String[] data = {"추진협", "윤종환", "소이진", "이지연", "오성미", 
										"방규석", "정지혜", "조민서", "장웅희", "이준혁", 
										"유지예", "천윤희"};
		int j;
		int r =0;
		int cnt=0;
		//랜덤으로 이름 섞기
		for( j=0; j<20; j++) {
		 r = rand.nextInt(12);
		 String  a= data[r]; 
		 data[r] =data[0];
		data[0] = a;
		cnt++;
		}
		
		
		for(int i=0; i<data.length;i++) {
		System.out.println(data[i]);
}

		// 1.  구분해서 이름을 따로 따로 data 배열에 담는다
	
			 
	}
		//2. 따로 배열에 담긴 이름 출력해보고 배열안의 이름을 랜덤 함수로 섞는다
		//3. 랜덤 함수로 섞인 이름을  각 팀마다 따로 넣는다. 
	}


