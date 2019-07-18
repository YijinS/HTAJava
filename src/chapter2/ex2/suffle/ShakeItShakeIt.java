package chapter2.ex2.suffle;

import java.util.Scanner;

public class ShakeItShakeIt {
	static Courses[] classes = new Courses[100];  //�̸��� �ϰ�ó���ϱ� ����
	static int CurrentId =-1; //�����͸� ������ �� 0�� �����Ͱ� ���ٰ� �� �� ���� -1�� �����Ͱ� ���ٴ� ���� ���ϴ� �� 
	static String name;
	static String member[];
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

			case 3: 
				System.out.println("���α׷��� �����մϴ�. ");
				break EXIT;

			default:
			} // switch ����
		} // while(true) ����
	} // main ����

	//-----------------------------------------inputMainMenu-----------------------------------------------------------------------
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
		int mainMenu= Integer.parseInt(scan.nextLine()); // int���� nextLine�� ����ϴ� �������� �߱� ������ ���ڸ� ���������� �ٲ��ִ°��� �ؾ��Ѵ�.
		// //nextLine�� ���� ������ �Է��� ���ڿ��� �������� �ƴ��� �Ǻ��� �����ϱ� �����̴�.

		System.out.println();
		System.out.println("====================================================");

		return mainMenu;
	} // inputMainMenu() ����



	//-----------------------------------------listClass-----------------------------------------------------------------------
	private static void listClass() { // 1.select class

		while(true) {
			System.out.println("#1. MAIN >  #Select Class");
			System.out.println();
			System.out.println("                                	            	                Class List  									                        ");

			if (current == 0) {// Ŭ���� ����� ���� ���
				System.out.println();
				System.out.println("                     ��       ��                  Please add new class                ��             ��                ");
			} // if ����

			else { // Ŭ���� ����� ���� ���
				System.out.println("| ID  |       NAME          | CAPA    |");
				for (int i = 0; i < current; i++) {  System.out.printf("| %3d | %20s | %3d |\n", classes[i].id, classes[i].name,
						classes[i].capacity);
				//classes[i].capacity
				//				for (int i = 0; i < current; i++) { //for1
				//					//System.out.println("class ID:");
				//					System.out.printf("class ID: %3d\n", classes[i].id);
				//					System.out.printf("name: %3s\n", classes[i].name);
				//					//	for(String name : classes[i].name) {
				//					//			System.out.print(name+"\t");
				//					//					} //for ����
				//					System.out.printf("CAPA: %3d\n", classes[i].capacity);

				} // for1 ����

			} // else ����

			System.out.println();
			System.out.println("                   1. Shake it");
			System.out.println("                   2. Add Class	");
			System.out.println("                   3. View Class & Edit member");
			System.out.println("                   4. Delete Class	");
			System.out.println("                   5. Go main");
			System.out.print("                       >"); // class Id�� �Է��ؾ��Ѵ�.

			int listMenu = Integer.parseInt(scan.nextLine());
			switch (listMenu) {
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
			System.out.println();
		} //while ���� 
	} // listClass����

	//-----------------------------------------addClass-----------------------------------------------------------------------
	private static void addClass() {

		// 1.������ ���ϰڴٰ� �� ��찡 ������ ���̺�� ���õ� �������� �����ϰ� �װ��� ���� �Է��Ѵ��� 
		String name;
		String[] members;
		int id;

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
				classes[current] = new Courses(); //for������ ������ ��� classes���� 0���� �ʱ�ȭ�Ǽ� ���尪�� ������ �ʾƼ� ����������
				classes[current].id = id;
				classes[current].name = name;
				classes[current].members = members;
				classes[current].capacity =members.length;
				System.out.println();

				current ++;

			} //if ���� 
			else if(save ==2) ;  //;������ ���� ������ �ȴ�.
			else {//���� ó��
				System.out.println("��� ��� :1�� �Ǵ� 2���� �Է��� �� �ֽ��ϴ�.");
			}
		}while(save != 1 && save !=2);  //1���ƴϸ鼭 2���ƴ� ��쿡 ������ �Ѵ�.

		System.out.println("====================================================");
		System.out.println();
	} //addClass() ���� 

	//-----------------------------------------viewClass-----------------------------------------------------------------------
	private static void viewClass() { //id�� select Ŭ�������� �ԷµǸ� id ���� ���缭 view class�� ����. 
		int index = -1;
		System.out.println();
		System.out.println("#1. MAIN >  #Select Class > #View Class & Edit member");
		System.out.println();

		System.out.println("������� id�� �Է��ϼ��� >> ");
		CurrentId = Integer.parseInt(scan.nextLine());

		for(int i=0; i<current; i++) {
			if(classes[i].id == CurrentId) //���̵� �˻� �� ���̵� ���� ��ġ�ϴ��� �˻� 
				index=i;  //���̵� ��ġ�ϸ� �ε����� ����?
		}

		if(index ==-1) {
			System.out.println("���� ");
			return;
		}

		Courses course  = classes[index];

		System.out.printf("                   �� Class ID_%d", CurrentId); // ������ ���̵��� ��ȣ�� ��� 
		System.out.printf("                   �� Class Name_%s",	course.name); // listHistory()
		System.out.print("                    �� Member List_");
		for(int i=0; i< course.members.length; i++) {  
			if(i == course.members.length-1)
				System.out.printf("%s", course.members[i]);
			else
				System.out.printf("%s, ", course.members[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("                  1. Edit      2. Go back");
		//edit �Ǵ� go back ����
		int menu = Integer.parseInt(scan.nextLine());
		String[] names = null;

		if(menu==1) {
			System.out.println("                �� Member List Edit _(�̸� �Է�)	");
			names = scan.nextLine().split(",");
		}
		else if(menu==2) {}
		else 
			return;

		System.out.println("                   Save? 1.Y / 2.N");  //������ �̸� ����?
		System.out.print("                       >");
		int save = Integer.parseInt(scan.nextLine());

		if(save == 1) {
			course.members = names;
			course.capacity = names.length;
		}

		System.out.println("====================================================");
		System.out.println();
	} //viewClass() ���� 


	//-----------------------------------------deleteClass-----------------------------------------------------------------------
	private static void deleteClass() {

		System.out.println();
		System.out.println("#1. MAIN >  #Select Class > #Delete");
		System.out.println();

		System.out.println("�����ϰ� ���� id�� �Է��ϼ��� >> ");
		CurrentId = Integer.parseInt(scan.nextLine());
		//1. ������ �� �ε����� ã�´�(index ��°�� ����� ��)
		int index = -1;
		for(int i=0; i<current; i++) {
			if(classes[i].id == CurrentId) //���̵� �˻� �� ���̵� ���� ��ġ�ϴ��� �˻� 
				index=i;  
		}
		if(index ==-1) {
			System.out.println("���� ");
		}
		classes[index] =null;  //ã�� �ε��� �κ��� ������ �����ϴ� ������ null�� �ʱ�ȭ�� �� 
		/*current-index-1�� ��ġ: �̰͵� ����
		 * for(in i=0; i<current-index-1; i++)
		 * 	classes[index-1] = classes[index+1];
		 * current --;
		 * 
		 * */
		if(classes[index] ==null) {
			for(int i=index; i<current; i++) {
				if(i==current-1)
					classes[i] = null; //0~9�϶� 10�� current�� ���� 10�̵Ǽ� outpfbound ������ ��. 9�� null�� �ʱ�ȭ���ش�
				else
					classes[i] = classes[i+1];   //����� �ִ� ���� �� ������ ���� �ϴ� �ִ´�
		}
			current--; //current�� ������ �����.

			System.out.println("�����Ǿ����ϴ�.");
		}


		System.out.println("====================================================");
		System.out.println();
	}

	//-----------------------------------------shakeClass-----------------------------------------------------------------------
	private static void shakeClass() { //�ο� ����
		System.out.println("#1. MAIN > #Select Class > #Shake it!");
		System.out.println();
		System.out.println();

		System.out.print("                   �� How many groups?_"); // listClass()
		classes[current].groupCount =Integer.parseInt(scan.nextLine()); 
		System.out.println();
		System.out.println();
		System.out.print("Shaking.. "); //shaking ��� ���� ���� 
		System.out.print("(����ȭ��)");
		System.out.println("  ����   ��    ����	  ��                       ����                  ��");
		System.out.println("  ----------------------------------------------------------");


		System.out.println();
		System.out.println("                   1. Reshake!"); 
		System.out.println("                   2. Save & Go back"); 
		System.out.print("                       >");    //no�� �Է��ؾ��Ѵ�. 

		int menu3 =Integer.parseInt( scan.nextLine());  
		if(menu3 ==1)
			System.out.println("reshake");
		else if(menu3 ==2) {
			current ++;
			return;
		}
	}

	//-----------------------------------------listHistory-----------------------------------------------------------------------
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
		System.out.print("                       >");    //no�� �Է��ؾ��Ѵ�. 

		int menu2 =Integer.parseInt( scan.nextLine());  
		switch(menu2) {
		case 1: //   1. View Detail
		case 2:  //  2. Go Main
		default:

			return;
		}//switch ����

	} //listHistory ���� 

}


