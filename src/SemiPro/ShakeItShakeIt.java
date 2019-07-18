package SemiPro;

import java.util.Scanner;

public class ShakeItShakeIt {

	static int[] classCapacity = new int[100]; // Ŭ���� �ο���
	static int[] classIds = new int[100]; // Ŭ���� ���̵�
	static int choiceId; //�����Ϸ��� Ŭ���� ���̵� 
	static int[] groupCountOfClass = new int[100]; // Ŭ������ �׷��� ��
	static String[] classNames = new String[100]; // Ŭ���� �̸�
	static String[][] names = new String[100][30]; // 100���� Ŭ������ 20���� �̸��� �Է��Ѵ�.
	static Scanner scan = new Scanner(System.in);
	static int current = 0;

	public static void main(String[] args) {
		EXIT: while (true) {

			int menu = inputMainMenu(); // ���θ޴��� �Է¹ޱ� ���� - �Է¹޴� ȭ�鿡�� ��ȯ�޴� �޴���ȣ�� ����
			switch (menu) {

			case 1:
				listClass(); // 1. Select Class
				break;

			case 2: // OpenClass Ŭ���� ���� ��ȸ
				listHistory(); // history ���
				break;

			case 3: // Quit
				System.out.println("���α׷��� �����մϴ�. ");
				break EXIT;

			default:
			} // switch ����
		} // while(true) ����

	} // main ����

	// ���� �޴� ���
	private static int inputMainMenu() {
		System.out.println("#1. MAIN");
		System.out.println();
		System.out.println("                                      SHAKE IT! SHAKE IT!                          ");
		System.out.println();
		System.out.println();
		System.out.println("                   1. Class"); // listClass()
		System.out.println("                   2. History"); // listHistory()
		System.out.println("                   3. Quit");
		System.out.print("                       >>");
		int num = Integer.parseInt(scan.nextLine()); // int���� nextLine�� ����ϴ� �������� �߱� ������ ���ڸ� ���������� �ٲ��ִ°��� �ؾ��Ѵ�.
		// //nextLine�� ���� ������ �Է��� ���ڿ��� �������� �ƴ��� �Ǻ��� �����ϱ� �����̴�.

		System.out.println();
		System.out.println("====================================================");

		return num;
	} // inputMainMenu() ����

	// ������ Ŭ���� ���
	private static void listClass() { // 1.select class

		while(true) {
			System.out.println("#1. MAIN >  #Select Class");
			System.out.println();
			System.out.println(
					"                                	            	                Class List  									                        ");

			//		System.out.println("                              ������������������������������������������������������������������������               ");
			//		System.out.println("                              �� ID ��                                NAME              	             ��CAPA ��                 ");
			//		System.out.println("                            ��������������������������������������������������������������������������               ");
			if (current == 0) {// Ŭ���� ����� ���� ���
				System.out.println();
				System.out.println(
						"                             ��       ��                  Please add new class                ��             ��                ");
			} // if ����

			else { // Ŭ���� ����� ���� ���

				for (int i = 0; i < current; i++) { //for1
					System.out.printf("class ID: %3d\n", classIds[i]);
					System.out.print("name:");

					for(String name : names[i]) {
						System.out.print(name+"\t");
					} //for ����

					System.out.printf("\nCAPA: %3d\n", classCapacity[i]);

				} // for1 ����

				//	   System.out.println("                              ��������������������������������������������������������������������������                ");
			} // else ����
			System.out.println("====================================================");
			System.out.println();
			System.out.println();
			System.out.println("                   1. Shake it");
			System.out.println("                   2. Add Class	");
			System.out.println("                   3. View Class & Edit member");
			System.out.println("                   4. Delete Class	");
			System.out.println("                   5. Go main");
			System.out.print("                       >"); // class Id�� �Է��ؾ��Ѵ�.

			int menu = Integer.parseInt(scan.nextLine());
			switch (menu) {
			//�̷��� �Լ��� ��� �ҷ����� ��ø�� ������°��� ���� �� �ִ�. 

			case 1: // 1. Shake it
				shakeClass();   
			case 2: // 2. Add Class
				addClass();
				break;
			case 3: // 3. View Class & Edit member
				viewClass();
			case 4: // 4. Delete Class
				deleteClass();
			case 5: // 5. Go main

				break;

			} // switch ����

			System.out.println("====================================================");
		} //while ���� 
	} // listClass����

	private static void addClass() {
		int id; // 1.������ ���ϰڴٰ� �� ��찡 ������ ���̺�� ���õ� �������� �����ϰ� �װ��� ���� �Է��Ѵ��� 
		String name;
		String[] members;

		System.out.println();
		System.out.println();
		System.out.println("#1. MAIN > #Select Class > #Add Class");
		System.out.println();
		System.out.println();

		System.out.print("                   �� Class ID_"); // listClass()
		id =Integer.parseInt(scan.nextLine()); 

		System.out.print("                   �� Class Name_"); // listHistory()
		name = scan.nextLine();

		System.out.print("                   �� Member List_");  //Ŭ���� �ο��� �̸�
		members=scan.nextLine().split(",");

		int save; 
		do {
			System.out.println();
			System.out.println("                  Save? 1.Y  2.N");
			System.out.print("                       >>");
			save = Integer.parseInt(scan.nextLine());

			if(save ==1)  //2. ���̺긦 �� ��� �Էµ� ���� �����ϴ� ���� �ְ� current�� ������Ų��. 
			{
				classIds[current] = id;
				classNames[current] = name;
				names[current] = members;

				for(int i =0; i<members.length; i++) {
					classCapacity[current] += i;
				}
				current ++;
				//   listClass();
			} //if ���� 
			else if(save ==2) ;  //;������ ���� ������ �ȴ�.
			else {//���� ó��
				System.out.println("��� ��� :1�� �Ǵ� 2���� �Է��� �� �ֽ��ϴ�.");
			}
		}while(save != 1 && save !=2);  //1���ƴϸ鼭 2���ƴ� ��쿡 ������ �Ѵ�.

	}



	private static void deleteClass() {


	}

	private static void viewClass() { //id�� select Ŭ�������� �ԷµǸ� id ���� ���缭 view class�� ����. 
		System.out.println("#1. MAIN >  #Select Class > #View Class & Edit member");
		System.out.println();

		System.out.println("������� Ŭ������ id�� �Է��ϼ��� >> ");
		choiceId = Integer.parseInt(scan.nextLine());
		System.out.printf("                   �� Class ID_%d", choiceId); // ������ ���̵��� ��ȣ�� ��� 

		//System.out.printf("                   �� Class Name_%d"); // listHistory()
		//System.out.printf("                   �� Member List_%d");  //Ŭ���� �ο��� �̸�
	}

	

	private static void shakeClass() {
		int id;
		System.out.println("#1. MAIN > #Select Class > #Shake it!");
		System.out.println();
		System.out.println();

		System.out.print("                   �� How many groups?_"); // listClass()
		id =Integer.parseInt(scan.nextLine()); 
		System.out.println();
		System.out.println();
		System.out.print("Shaking.. ");
		
		System.out.print("(����ȭ��)");

	}

	private static void listHistory() { // history
		System.out.println("#1. MAIN >  #History");
		System.out.println();
		System.out.println("                                	            	            Shake History  									                        ");
		System.out.println();

		System.out.println("  ��No��    ��¥	  ��  Ŭ�����̸�      ����������");
		System.out.println("  -------------------------------------------------");

		//		for(int i=0; i<current; i++) {
		//			System.out.println("������������������������������������������������������");
		//			System.out.printf(" ��%3d��  %3d  ��  %20s                   ��  %3d      |"
		//					, classIds[i], date[i], classNames[i], classCapacity[i]  );
		//		}

		System.out.println();
		System.out.println();
		System.out.println("                   1. View Detail"); 
		System.out.println("                   2. Go Main"); 
		System.out.print("                       >");    //class Id�� �Է��ؾ��Ѵ�. 


		int menu2 =Integer.parseInt( scan.nextLine());  

		switch(menu2) {
		case 1: //   1. View Detail
		case 2:  //  2. Go Main
		default:

			return;
		}//switch ����

	} //listHistory ���� 

}
