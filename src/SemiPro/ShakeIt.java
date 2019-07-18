package SemiPro;


import java.util.Scanner;

public class ShakeIt {

	static int[] classCapacity = new int[100];  //Ŭ���� �ο��� 
	static int[] classIds= new int[100];  //Ŭ���� ���̵�
	static int[] groupCountOfClass = new int[100]; // Ŭ������ �׷��� ��
	static String[] classNames = new String[100]; //Ŭ���� �̸� 
	static String[][]  names = new String[100][30]; //100���� Ŭ������ 20���� �̸��� �Է��Ѵ�. 
	static int current = 0; //�迭�� �� �ִ� �������� ����/ ������  �ϳ� ������ ������ ���� �����Ǵ� �� 

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		EXIT:
			while(true) {

				int menu = inputMainMenu(); //���θ޴��� �Է¹ޱ� ���� - �Է¹޴� ȭ�鿡�� ��ȯ�޴� �޴���ȣ�� ���� 
				switch(menu) {

				case 1:
					addClass(); //new class Ŭ���� ���� 
					break;


				case 2:  //OpenClass  Ŭ���� ���� ��ȸ 
					listClass();
					break;

				case 3:
					shakeIt();

				case 4:  //Quit
					System.out.println("���α׷��� �����մϴ�. ");
					break EXIT;


				default:
				} //switch ���� 
			} //while(true) ���� 




	} //main ���� 

	private static int inputMainMenu() {


		System.out.println("#1. MAIN");
		System.out.println();
		System.out.println();
		System.out.println("                                      SHAKE IT! SHAKE IT!                          ");
		System.out.println();
		System.out.println();
		System.out.println("                   1. New Class"); //Ŭ���� �߰�
		System.out.println("                   2. List Class"); //Ŭ���� ����Ʈ���� ��ȣ�� �����ϰ� �����Ѵ�. ������ �ִ� ���� ����?
		System.out.println("                   3. Quit");
		System.out.print("                       >>");
		int num =Integer.parseInt( scan.nextLine());  //int���� nextLine�� ����ϴ� �������� �߱� ������ ���ڸ� ���������� �ٲ��ִ°��� �ؾ��Ѵ�. //nextLine�� ���� ������ �Է��� ���ڿ��� �������� �ƴ��� �Ǻ��� �����ϱ� �����̴�. 
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");



		return num;
	} //inputMainMenu ����


	// next�� Integer ��ȯ�� ���� �ؾ��Ѵ�. next���� Ȯ���ϰ� Integer�� �ٲ���ϴ� ��.
	// Integer.parseInt() ����ϱ� 
	private static void  addClass() { //open class


		ex: while(true) {
			System.out.println("#2. NEW START");
			System.out.println();
			System.out.println();
			System.out.println("                                      PROGOOGLERS ");
			System.out.println();
			System.out.print("                   �� Class id:");  //Ŭ���� �ĺ���
			classIds[current] =Integer.parseInt(scan.nextLine());
			//classIds[current] = current; 	//Integer.parseInt() ����ϱ� 
			//	scan.nextLine();

			System.out.print("                   �� Class name :");
			classNames[current] = scan.nextLine();
			// ������� ���ԵǷ��� nextLine�� ���� ����Ű�� ���ۿ� ���� �ʰ� �ؾ��Ѵ�.
			// next�� ���͸� �����ͷ� �����ϰ� �Է�â�� ������� nextLine�� �ν��ع����� ������.(���͸������ͷ��ν�)
			//�̰� parseInt�� �ٲٴ� ������ �߻��ϴ� ��
			System.out.print("                   �� Total members:");  //��ü �ο��� 
			classCapacity[current] = Integer.parseInt(scan.nextLine());


			System.out.print("                    �� Total groups:"); //��ü �� �� 
			groupCountOfClass[current] =Integer.parseInt(scan.nextLine());

			System.out.print("                   �� GOOGLER names: "); //String[][] names�� �� �ο� �̸��� 
			//names[current][i] = scan.nextLine();  // �̸��� ������ �Է¹����� for���� �ƴ� ���ڸ� ������ �Է¹޾� split�� ����ؾ��Ѵ�. �Է½� ��ǥ�� �̸��� ������ �޶�� �����ؾ��Ѵ�.
			String name = scan.nextLine(); //name�� �̸��� �����̽��� ,�� �Է��� ���йް�

			String[] splitName  = name.split(","); //splitName�� ,�� ���е� �̸����� �־��ش� 

			for(int k=0; k<splitName.length; k++) { //�־��� �̸���ŭ�� ���̵��� 
				names[current][k] = splitName[k]; //�־��� �̸��� 0���� ������ names�� �ִ� �ο����� ���ϴ� k�� �ִ´�. �׷��� k���� �ο����� ����. 
			}

			System.out.println();
			System.out.println();
			//�޴� switch�� �����

			System.out.println("             �޴��� �Է��Ͻÿ�");
			System.out.println("                   1. �����ϰ� ������");
			System.out.println("                   2. �߰��� �����ϱ�"); //Ŭ���� ����Ʈ���� ��ȣ�� �����ϰ� �����Ѵ�. 
			System.out.println("                   3. ������");
			int addmenu = Integer.parseInt(scan.nextLine());
			
			switch(addmenu) {
			case 1: // 1. Shake it Shake it 	
				break;

			case 2: //2. Save class
				current ++;
//				saveClass();
				System.out.println("����Ǿ����ϴ�. ");
				break ex;

			case 3: //  3. Go back  �������� �ʰ� �ǵ��� ����. 
				System.out.println("�������� ���ư��ϴ�. ");
			
		 //break �Ƚᵵ case3 ����ǰ� default���� break �Ǽ� ������. 
			default: 
				break ex;
			
			}
		

			current ++; //Ŭ������ ���� �� �� �ִ� ����. 				

			System.out.println("--------------------------------------------------------------------------------");
		}


	}

	private static void listClass() { //classList
		/*  
		 * 
		 * 
		 * 
		 * */
		System.out.println("#3. Class list");
		System.out.println();
		System.out.println();
		System.out.println("                                     CLASS Info ");
		System.out.println();
		System.out.println("                  |   id | Name | Capacity | ");
		System.out.println();
		System.out.println("                   |  1  | �ۡۡ� |            30 | ");
		System.out.println("                   |  2  | �ۡۡ� | 			  20 | ");
		System.out.println("                   |  3  | �ۡۡ� |	          25 | ");
		//1. ���� 2. ���� 3. ����     -> ��ȣ���� - >�߰� ��  -> ���
		//1. ������ ��� ����, �ڼ��� ������ , ��� 
		//���⼭ 1�� ������ 1������ ������ ���Ű� �޴� 1��open class�� ������ id1������ ������ ��µǰ� �ϴ� ���̴�. 
		System.out.println();
		System.out.println();

		System.out.println("                   1.Open Class ");  //Ŭ���� �ĺ���
		System.out.println("                   2.Remove Class");
		System.out.println("                   3.Go back ");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");


	} //listClass ���� 

	private static void shakeIt() {

		System.out.println("#4. Shake it");
		System.out.println();
		System.out.println();
		System.out.println("                                    CLASS NAME");
		System.out.println();
		System.out.println("                  | Group | Leader | Googler names |  ");
		System.out.println();
		System.out.println("                   |  1��  | �ۡۡ� | �ۡۡ�,�ۡۡ� | ");
		System.out.println("                   1. Go back ");
		System.out.println("                  3. Go to googling ~! ");
		System.out.println();
		System.out.println();


	} //shakeIt() ���� 
	
	
//	private static void saveClass() throws FileNotFoundException {
//		FileOutputStream fos = new FileOutputStream(" D:\\java\\ramdom ");	
//		fos.write(addClass());
//		
//		
//		System.out.println("�ڸ���ġ ������ ����Ǿ����ϴ�. ");
//	} //saveClass() ���� 

} // class ShakeIt ���� 
