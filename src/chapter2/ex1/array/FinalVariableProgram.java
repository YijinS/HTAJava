package chapter2.ex1.array;
import java.util.Scanner;


public class FinalVariableProgram {
	public static void main(String[] args0) {
		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 5; 
		int kor[] = new int[SIZE];
		int total=0;
		float avg = 0;
		
		//�迭 �ʱⰪ ����
		for(int i=0; i<SIZE; i++) 
			kor[i] = 0;
		
	
		   �󺧺�: while(true) {
			
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                 \"���� �޴�\"                 ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("\t1. ���� �Է�");
			System.out.println("\t2. ���� ��� ");
			System.out.println("\t3. ���� ");
			System.out.print("\t���� >");
			int menu = scan.nextInt();   
			
			switch(menu) {
			case 1: 
				System.out.println("����������������������������������������������������������������������������������������");
				System.out.println("��                                          ��");
				System.out.println("��                  \"���� �Է�\"                ��");
				System.out.println("��                                          ��");
				System.out.println("����������������������������������������������������������������������������������������");

				
				for(int j=0; j<SIZE; j++) 
				do {
					System.out.printf("kor%d:", j+1);
					kor[j] = scan.nextInt();

					if(!(kor[j]>=0 && kor[j]<=100))
						System.out.println("������ 0~100������ ������ �Է��� �����մϴ�. �ٽ��Է�");
					
				}while(!(kor[j]>=0 && kor[j]<=100));
				
				break;
		
				
			case 2: 
				
			for(int i=0; i<SIZE; i++) 
				total += kor[i];
			avg = total/SIZE;
			System.out.println("����������������������������������������������������������������������������������������");
			System.out.println("��                                          ��");
			System.out.println("��                  \"���� ���\"              ��");
			System.out.println("��                                          ��");
			System.out.println("����������������������������������������������������������������������������������������");
			
			for(int i=0; i<SIZE; i++) 
			System.out.printf("kor%d: %d\t", i+1, kor[i]);
			
			System.out.printf("total: %d\t", total);
			System.out.printf("avg: %.2f\t", avg);
			System.out.println();
			
			break;
			
			
			case 3: 
				System.out.println("bye");
				break �󺧺�;
				
			
			default:
				System.out.println("���Է� �ϼ���");

		

	} //����ġ ���� 
		   } //while ���� 
	}	//��������
} //Ŭ���� ���� 




