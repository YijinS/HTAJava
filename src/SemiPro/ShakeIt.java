package SemiPro;


import java.util.Scanner;

public class ShakeIt {

	static int[] classCapacity = new int[100];  //클래스 인원수 
	static int[] classIds= new int[100];  //클래스 아이디
	static int[] groupCountOfClass = new int[100]; // 클래스의 그룹의 수
	static String[] classNames = new String[100]; //클래스 이름 
	static String[][]  names = new String[100][30]; //100개의 클래스에 20개의 이름을 입력한다. 
	static int current = 0; //배열에 들어가 있는 데이터의 순서/ 사이즈  하나 생성될 때마다 값이 증가되는 것 

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		EXIT:
			while(true) {

				int menu = inputMainMenu(); //메인메뉴를 입력받기 위함 - 입력받는 화면에서 반환받는 메뉴번호가 존재 
				switch(menu) {

				case 1:
					addClass(); //new class 클래스 생성 
					break;


				case 2:  //OpenClass  클래스 정보 조회 
					listClass();
					break;

				case 3:
					shakeIt();

				case 4:  //Quit
					System.out.println("프로그램을 종료합니다. ");
					break EXIT;


				default:
				} //switch 종료 
			} //while(true) 종료 




	} //main 종료 

	private static int inputMainMenu() {


		System.out.println("#1. MAIN");
		System.out.println();
		System.out.println();
		System.out.println("                                      SHAKE IT! SHAKE IT!                          ");
		System.out.println();
		System.out.println();
		System.out.println("                   1. New Class"); //클래스 추가
		System.out.println("                   2. List Class"); //클래스 리스트에서 번호를 선택하고 가야한다. 기존에 있는 것을 관리?
		System.out.println("                   3. Quit");
		System.out.print("                       >>");
		int num =Integer.parseInt( scan.nextLine());  //int형에 nextLine을 사용하니 빨간줄이 뜨기 때문에 문자를 정수형으로 바꿔주는것을 해야한다. //nextLine을 쓰는 이유는 입력한 문자열이 정수인지 아닌지 판별이 가능하기 때문이다. 
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");



		return num;
	} //inputMainMenu 종료


	// next와 Integer 변환을 따로 해야한다. next에서 확인하고 Integer로 바꿔야하는 것.
	// Integer.parseInt() 사용하기 
	private static void  addClass() { //open class


		ex: while(true) {
			System.out.println("#2. NEW START");
			System.out.println();
			System.out.println();
			System.out.println("                                      PROGOOGLERS ");
			System.out.println();
			System.out.print("                   ▶ Class id:");  //클래스 식별값
			classIds[current] =Integer.parseInt(scan.nextLine());
			//classIds[current] = current; 	//Integer.parseInt() 사용하기 
			//	scan.nextLine();

			System.out.print("                   ▶ Class name :");
			classNames[current] = scan.nextLine();
			// 빈공간이 포함되려면 nextLine을 쓰고 엔터키가 버퍼에 남지 않게 해야한다.
			// next는 엔터를 데이터로 생각하고 입력창을 띄우지만 nextLine은 인식해버리고 끝낸다.(엔터를데이터로인식)
			//이걸 parseInt로 바꾸니 오류가 발생하는 것
			System.out.print("                   ▶ Total members:");  //전체 인원수 
			classCapacity[current] = Integer.parseInt(scan.nextLine());


			System.out.print("                    ▶ Total groups:"); //전체 조 수 
			groupCountOfClass[current] =Integer.parseInt(scan.nextLine());

			System.out.print("                   ▶ GOOGLER names: "); //String[][] names에 들어감 인원 이름들 
			//names[current][i] = scan.nextLine();  // 이름을 여러개 입력받을때 for문이 아닌 문자를 여러개 입력받아 split을 사용해야한다. 입력시 쉽표로 이름을 구분해 달라고 설정해야한다.
			String name = scan.nextLine(); //name에 이름을 스페이스와 ,로 입력해 구분받고

			String[] splitName  = name.split(","); //splitName에 ,로 구분된 이름들을 넣어준다 

			for(int k=0; k<splitName.length; k++) { //넣어준 이름만큼의 길이동안 
				names[current][k] = splitName[k]; //넣어준 이름을 0부터 끝까지 names에 있는 인원수를 뜻하는 k에 넣는다. 그러면 k에는 인원수가 들어간다. 
			}

			System.out.println();
			System.out.println();
			//메뉴 switch로 만들기

			System.out.println("             메뉴를 입력하시오");
			System.out.println("                   1. 저장하고 나가기");
			System.out.println("                   2. 추가로 저장하기"); //클래스 리스트에서 번호를 선택하고 가야한다. 
			System.out.println("                   3. 나가기");
			int addmenu = Integer.parseInt(scan.nextLine());
			
			switch(addmenu) {
			case 1: // 1. Shake it Shake it 	
				break;

			case 2: //2. Save class
				current ++;
//				saveClass();
				System.out.println("저장되었습니다. ");
				break ex;

			case 3: //  3. Go back  저장하지 않고 되돌아 간다. 
				System.out.println("메인으로 돌아갑니다. ");
			
		 //break 안써도 case3 실행되고 default에서 break 되서 나간다. 
			default: 
				break ex;
			
			}
		

			current ++; //클래스의 현재 들어갈 수 있는 이유. 				

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
		System.out.println("                   |  1  | ○○○ |            30 | ");
		System.out.println("                   |  2  | ○○○ | 			  20 | ");
		System.out.println("                   |  3  | ○○○ |	          25 | ");
		//1. 수정 2. 삭제 3. 수정     -> 번호선택 - >추가 등  -> 목록
		//1. 수정의 경우 수정, 자세한 페이지 , 목록 
		//여기서 1을 누르면 1에대한 내용을 고른거고 메뉴 1번open class를 누르면 id1에대한 내용이 출력되게 하는 것이다. 
		System.out.println();
		System.out.println();

		System.out.println("                   1.Open Class ");  //클래스 식별값
		System.out.println("                   2.Remove Class");
		System.out.println("                   3.Go back ");
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");


	} //listClass 종료 

	private static void shakeIt() {

		System.out.println("#4. Shake it");
		System.out.println();
		System.out.println();
		System.out.println("                                    CLASS NAME");
		System.out.println();
		System.out.println("                  | Group | Leader | Googler names |  ");
		System.out.println();
		System.out.println("                   |  1조  | ○○○ | ○○○,○○○ | ");
		System.out.println("                   1. Go back ");
		System.out.println("                  3. Go to googling ~! ");
		System.out.println();
		System.out.println();


	} //shakeIt() 종료 
	
	
//	private static void saveClass() throws FileNotFoundException {
//		FileOutputStream fos = new FileOutputStream(" D:\\java\\ramdom ");	
//		fos.write(addClass());
//		
//		
//		System.out.println("자리배치 파일이 저장되었습니다. ");
//	} //saveClass() 종료 

} // class ShakeIt 종료 
