package SemiPro;

import java.util.Scanner;

public class ShakeItShakeIt {

	static int[] classCapacity = new int[100]; // 클래스 인원수
	static int[] classIds = new int[100]; // 클래스 아이디
	static int choiceId; //선택하려는 클래스 아이디 
	static int[] groupCountOfClass = new int[100]; // 클래스의 그룹의 수
	static String[] classNames = new String[100]; // 클래스 이름
	static String[][] names = new String[100][30]; // 100개의 클래스에 20개의 이름을 입력한다.
	static Scanner scan = new Scanner(System.in);
	static int current = 0;

	public static void main(String[] args) {
		EXIT: while (true) {

			int menu = inputMainMenu(); // 메인메뉴를 입력받기 위함 - 입력받는 화면에서 반환받는 메뉴번호가 존재
			switch (menu) {

			case 1:
				listClass(); // 1. Select Class
				break;

			case 2: // OpenClass 클래스 정보 조회
				listHistory(); // history 목록
				break;

			case 3: // Quit
				System.out.println("프로그램을 종료합니다. ");
				break EXIT;

			default:
			} // switch 종료
		} // while(true) 종료

	} // main 종료

	// 메인 메뉴 출력
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
		int num = Integer.parseInt(scan.nextLine()); // int형에 nextLine을 사용하니 빨간줄이 뜨기 때문에 문자를 정수형으로 바꿔주는것을 해야한다.
		// //nextLine을 쓰는 이유는 입력한 문자열이 정수인지 아닌지 판별이 가능하기 때문이다.

		System.out.println();
		System.out.println("====================================================");

		return num;
	} // inputMainMenu() 종료

	// 선택한 클래스 출력
	private static void listClass() { // 1.select class

		while(true) {
			System.out.println("#1. MAIN >  #Select Class");
			System.out.println();
			System.out.println(
					"                                	            	                Class List  									                        ");

			//		System.out.println("                              ────────────────────────────────────               ");
			//		System.out.println("                              │ ID │                                NAME              	             │CAPA │                 ");
			//		System.out.println("                            ─────────────────────────────────────               ");
			if (current == 0) {// 클래스 목록이 없을 경우
				System.out.println();
				System.out.println(
						"                             │       │                  Please add new class                │             │                ");
			} // if 종료

			else { // 클래스 목록이 있을 경우

				for (int i = 0; i < current; i++) { //for1
					System.out.printf("class ID: %3d\n", classIds[i]);
					System.out.print("name:");

					for(String name : names[i]) {
						System.out.print(name+"\t");
					} //for 종료

					System.out.printf("\nCAPA: %3d\n", classCapacity[i]);

				} // for1 종료

				//	   System.out.println("                              └───────────────────────────────────┘                ");
			} // else 종료
			System.out.println("====================================================");
			System.out.println();
			System.out.println();
			System.out.println("                   1. Shake it");
			System.out.println("                   2. Add Class	");
			System.out.println("                   3. View Class & Edit member");
			System.out.println("                   4. Delete Class	");
			System.out.println("                   5. Go main");
			System.out.print("                       >"); // class Id를 입력해야한다.

			int menu = Integer.parseInt(scan.nextLine());
			switch (menu) {
			//이렇게 함수를 계속 불러내면 중첩이 깊어지는것을 막을 수 있다. 

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

			} // switch 종료

			System.out.println("====================================================");
		} //while 종료 
	} // listClass종료

	private static void addClass() {
		int id; // 1.저장을 안하겠다고 할 경우가 있으니 세이브와 관련된 변수들을 선언하고 그곳에 값을 입력한다음 
		String name;
		String[] members;

		System.out.println();
		System.out.println();
		System.out.println("#1. MAIN > #Select Class > #Add Class");
		System.out.println();
		System.out.println();

		System.out.print("                   ▶ Class ID_"); // listClass()
		id =Integer.parseInt(scan.nextLine()); 

		System.out.print("                   ▶ Class Name_"); // listHistory()
		name = scan.nextLine();

		System.out.print("                   ▶ Member List_");  //클래스 인원들 이름
		members=scan.nextLine().split(",");

		int save; 
		do {
			System.out.println();
			System.out.println("                  Save? 1.Y  2.N");
			System.out.print("                       >>");
			save = Integer.parseInt(scan.nextLine());

			if(save ==1)  //2. 세이브를 할 경우 입력된 값을 존재하는 곳에 넣고 current를 증가시킨다. 
			{
				classIds[current] = id;
				classNames[current] = name;
				names[current] = members;

				for(int i =0; i<members.length; i++) {
					classCapacity[current] += i;
				}
				current ++;
				//   listClass();
			} //if 종료 
			else if(save ==2) ;  //;찍으면 문장 없음이 된다.
			else {//예외 처리
				System.out.println("사용 방법 :1번 또는 2번만 입력할 수 있습니다.");
			}
		}while(save != 1 && save !=2);  //1도아니면서 2도아닌 경우에 나가야 한다.

	}



	private static void deleteClass() {


	}

	private static void viewClass() { //id가 select 클래스에서 입력되면 id 값에 맞춰서 view class에 들어간다. 
		System.out.println("#1. MAIN >  #Select Class > #View Class & Edit member");
		System.out.println();

		System.out.println("보고싶은 클래스의 id를 입력하세요 >> ");
		choiceId = Integer.parseInt(scan.nextLine());
		System.out.printf("                   ▶ Class ID_%d", choiceId); // 선택한 아이디의 번호를 출력 

		//System.out.printf("                   ▶ Class Name_%d"); // listHistory()
		//System.out.printf("                   ▶ Member List_%d");  //클래스 인원들 이름
	}

	

	private static void shakeClass() {
		int id;
		System.out.println("#1. MAIN > #Select Class > #Shake it!");
		System.out.println();
		System.out.println();

		System.out.print("                   ▶ How many groups?_"); // listClass()
		id =Integer.parseInt(scan.nextLine()); 
		System.out.println();
		System.out.println();
		System.out.print("Shaking.. ");
		
		System.out.print("(실행화면)");

	}

	private static void listHistory() { // history
		System.out.println("#1. MAIN >  #History");
		System.out.println();
		System.out.println("                                	            	            Shake History  									                        ");
		System.out.println();

		System.out.println("  │No│    날짜	  │  클래스이름      │조개수│");
		System.out.println("  -------------------------------------------------");

		//		for(int i=0; i<current; i++) {
		//			System.out.println("───────────────────────────");
		//			System.out.printf(" │%3d│  %3d  │  %20s                   │  %3d      |"
		//					, classIds[i], date[i], classNames[i], classCapacity[i]  );
		//		}

		System.out.println();
		System.out.println();
		System.out.println("                   1. View Detail"); 
		System.out.println("                   2. Go Main"); 
		System.out.print("                       >");    //class Id를 입력해야한다. 


		int menu2 =Integer.parseInt( scan.nextLine());  

		switch(menu2) {
		case 1: //   1. View Detail
		case 2:  //  2. Go Main
		default:

			return;
		}//switch 종료

	} //listHistory 종료 

}
