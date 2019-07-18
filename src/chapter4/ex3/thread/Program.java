package chapter4.ex3.thread;

import java.util.Scanner;

public class Program implements Runnable {

	public static void print(String title) {

		for(int i=0; i<10; i++) {
			System.out.printf("title:%s %d%%\n",title,  i+1);
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		for(int i=0; i<10; i++) 
			System.out.printf("print: %d\n", i+1);


		Thread th = new Thread(new Program());
		th.start();


		System.out.println("종료 ");
	}


	@Override
	public void run() {

		Scanner scan = new Scanner(System.in);
		String title;

		for(int i=0; i<10; i++) {
			System.out.println("타이틀을 입력하세요 :");
			title = scan.nextLine();
			print(title);
		}
	}

}

