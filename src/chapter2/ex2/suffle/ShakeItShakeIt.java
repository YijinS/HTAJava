package chapter2.ex2.suffle;

import java.util.Scanner;

public class ShakeItShakeIt {
	static Courses[] classes = new Courses[100];  //이름을 일괄처리하기 위함
	static int CurrentId =-1; //데이터를 가져올 때 0이 데이터가 없다고 할 수 없다 -1은 데이터가 없다는 것을 말하는 것 
	static String name;
	static String member[];
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

			case 3: 
				System.out.println("프로그램을 종료합니다. ");
				break EXIT;

			default:
			} // switch 종료
		} // while(true) 종료
	} // main 종료

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
		int mainMenu= Integer.parseInt(scan.nextLine()); // int형에 nextLine을 사용하니 빨간줄이 뜨기 때문에 문자를 정수형으로 바꿔주는것을 해야한다.
		// //nextLine을 쓰는 이유는 입력한 문자열이 정수인지 아닌지 판별이 가능하기 때문이다.

		System.out.println();
		System.out.println("====================================================");

		return mainMenu;
	} // inputMainMenu() 종료



	//-----------------------------------------listClass-----------------------------------------------------------------------
	private static void listClass() { // 1.select class

		while(true) {
			System.out.println("#1. MAIN >  #Select Class");
			System.out.println();
			System.out.println("                                	            	                Class List  									                        ");

			if (current == 0) {// 클래스 목록이 없을 경우
				System.out.println();
				System.out.println("                     │       │                  Please add new class                │             │                ");
			} // if 종료

			else { // 클래스 목록이 있을 경우
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
				//					//					} //for 종료
				//					System.out.printf("CAPA: %3d\n", classes[i].capacity);

				} // for1 종료

			} // else 종료

			System.out.println();
			System.out.println("                   1. Shake it");
			System.out.println("                   2. Add Class	");
			System.out.println("                   3. View Class & Edit member");
			System.out.println("                   4. Delete Class	");
			System.out.println("                   5. Go main");
			System.out.print("                       >"); // class Id를 입력해야한다.

			int listMenu = Integer.parseInt(scan.nextLine());
			switch (listMenu) {
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
			System.out.println();
		} //while 종료 
	} // listClass종료

	//-----------------------------------------addClass-----------------------------------------------------------------------
	private static void addClass() {

		// 1.저장을 안하겠다고 할 경우가 있으니 세이브와 관련된 변수들을 선언하고 그곳에 값을 입력한다음 
		String name;
		String[] members;
		int id;

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
				classes[current] = new Courses(); //for문으로 돌리면 계속 classes값이 0부터 초기화되서 저장값이 쌓이지 않아서 오류난거임
				classes[current].id = id;
				classes[current].name = name;
				classes[current].members = members;
				classes[current].capacity =members.length;
				System.out.println();

				current ++;

			} //if 종료 
			else if(save ==2) ;  //;찍으면 문장 없음이 된다.
			else {//예외 처리
				System.out.println("사용 방법 :1번 또는 2번만 입력할 수 있습니다.");
			}
		}while(save != 1 && save !=2);  //1도아니면서 2도아닌 경우에 나가야 한다.

		System.out.println("====================================================");
		System.out.println();
	} //addClass() 종료 

	//-----------------------------------------viewClass-----------------------------------------------------------------------
	private static void viewClass() { //id가 select 클래스에서 입력되면 id 값에 맞춰서 view class에 들어간다. 
		int index = -1;
		System.out.println();
		System.out.println("#1. MAIN >  #Select Class > #View Class & Edit member");
		System.out.println();

		System.out.println("보고싶은 id를 입력하세요 >> ");
		CurrentId = Integer.parseInt(scan.nextLine());

		for(int i=0; i<current; i++) {
			if(classes[i].id == CurrentId) //아이디 검색 후 아이디 값이 일치하는지 검사 
				index=i;  //아이디가 일치하면 인덱스를 증가?
		}

		if(index ==-1) {
			System.out.println("없어 ");
			return;
		}

		Courses course  = classes[index];

		System.out.printf("                   ▶ Class ID_%d", CurrentId); // 선택한 아이디의 번호를 출력 
		System.out.printf("                   ▶ Class Name_%s",	course.name); // listHistory()
		System.out.print("                    ▶ Member List_");
		for(int i=0; i< course.members.length; i++) {  
			if(i == course.members.length-1)
				System.out.printf("%s", course.members[i]);
			else
				System.out.printf("%s, ", course.members[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("                  1. Edit      2. Go back");
		//edit 또는 go back 선택
		int menu = Integer.parseInt(scan.nextLine());
		String[] names = null;

		if(menu==1) {
			System.out.println("                ▶ Member List Edit _(이름 입력)	");
			names = scan.nextLine().split(",");
		}
		else if(menu==2) {}
		else 
			return;

		System.out.println("                   Save? 1.Y / 2.N");  //수정한 이름 저장?
		System.out.print("                       >");
		int save = Integer.parseInt(scan.nextLine());

		if(save == 1) {
			course.members = names;
			course.capacity = names.length;
		}

		System.out.println("====================================================");
		System.out.println();
	} //viewClass() 종료 


	//-----------------------------------------deleteClass-----------------------------------------------------------------------
	private static void deleteClass() {

		System.out.println();
		System.out.println("#1. MAIN >  #Select Class > #Delete");
		System.out.println();

		System.out.println("삭제하고 싶은 id를 입력하세요 >> ");
		CurrentId = Integer.parseInt(scan.nextLine());
		//1. 지워야 할 인덱스를 찾는다(index 번째를 지우는 것)
		int index = -1;
		for(int i=0; i<current; i++) {
			if(classes[i].id == CurrentId) //아이디 검색 후 아이디 값이 일치하는지 검사 
				index=i;  
		}
		if(index ==-1) {
			System.out.println("없어 ");
		}
		classes[index] =null;  //찾은 인덱스 부분을 기존에 참조하는 값에서 null로 초기화한 것 
		/*current-index-1이 위치: 이것도 가능
		 * for(in i=0; i<current-index-1; i++)
		 * 	classes[index-1] = classes[index+1];
		 * current --;
		 * 
		 * */
		if(classes[index] ==null) {
			for(int i=index; i<current; i++) {
				if(i==current-1)
					classes[i] = null; //0~9일때 10에 current가 들어가면 10이되서 outpfbound 오류가 뜸. 9를 null로 초기화해준다
				else
					classes[i] = classes[i+1];   //비워져 있는 곳에 그 이후의 값을 일단 넣는다
		}
			current--; //current를 앞으로 땡긴다.

			System.out.println("삭제되었습니다.");
		}


		System.out.println("====================================================");
		System.out.println();
	}

	//-----------------------------------------shakeClass-----------------------------------------------------------------------
	private static void shakeClass() { //인원 섞기
		System.out.println("#1. MAIN > #Select Class > #Shake it!");
		System.out.println();
		System.out.println();

		System.out.print("                   ▶ How many groups?_"); // listClass()
		classes[current].groupCount =Integer.parseInt(scan.nextLine()); 
		System.out.println();
		System.out.println();
		System.out.print("Shaking.. "); //shaking 결과 파일 츨력 
		System.out.print("(실행화면)");
		System.out.println("  │조   │    조장	  │                       조원                  │");
		System.out.println("  ----------------------------------------------------------");


		System.out.println();
		System.out.println("                   1. Reshake!"); 
		System.out.println("                   2. Save & Go back"); 
		System.out.print("                       >");    //no를 입력해야한다. 

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
		System.out.print("                       >");    //no를 입력해야한다. 

		int menu2 =Integer.parseInt( scan.nextLine());  
		switch(menu2) {
		case 1: //   1. View Detail
		case 2:  //  2. Go Main
		default:

			return;
		}//switch 종료

	} //listHistory 종료 

}


