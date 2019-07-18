package chapter2.ex5.reuse;

import java.util.Scanner;

public class Shuffle {

	Scanner scan = new Scanner(System.in);
	CoursesList ejin = new CoursesList();
	
	//Jar 파일을 컴파일하고 확장한것 까지 압축해준다. runnable jar은 메인이 포함되서 run해줄 수 있는 파일이다.  
	//패키지는 컴파일되면 폴더가 된다.
	//archive 파일은 압축만 
	//library:  
	//API: 언어부분은 벗어난 부분을 사용하는 곳.함수
	//platform: 절차를 만들 때 사용할 재료/언어가 사용하는 도구.    고급언어에선 언어부분(cpu, 메모리기능), 그 외(입출력 장치)로 나뉜다.
	private static void listHistory() {
		
	}

	private static void listClass(CoursesList ejin) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			int current  =ejin.current;
			Course[] list = ejin.list;
			System.out.println("current : " + current);
			System.out.println("#MAIN > #Class");

			System.out.println("┌──┬────────────────┬───┐");
			System.out.println("│  ID │                     NAME                  │CAPA │");
			System.out.println("├──┼────────────────┼───┤");

			if(current == 0) //목록이 없을 경우
				System.out.println("│    │   Please add new class         │    │\n");
			else
				for(int i=0; i<current; i++)
					System.out.printf("│ %3d │%20s│ %3d │\n", list[i].id, list[i].name, list[i].capacity);
			//System.out.printf("│ %3d │%20s│ %3d │\n", classIds[i], classNames[i], classCapacitys[i]);

			System.out.println("└──┴────────────────┴──┘");

			System.out.println("\t1. Shake it");
			System.out.println("\t2. Add Class");
			System.out.println("\t3. View Class & Edit member");
			System.out.println("\t4. Delete Class");
			System.out.println("\t5. Go main");
			System.out.print(">");

			int menu = Integer.parseInt(scan.nextLine());

			int currentId ;
			switch(menu) {
			case 1:
				shakeClass();
				break;
			case 2:
				addClass(ejin);
				break;
			case 3:
				System.out.print("Class ID >");
				currentId  = Integer.parseInt(scan.nextLine());
				viewClass(ejin,currentId);
				break;
			case 4:
				System.out.print("Class ID >");
				currentId = Integer.parseInt(scan.nextLine());
				deleteClass(ejin,currentId);
				break;
			case 5:
				return;
			}

		}

	}
//
	private static void deleteClass(CoursesList ejin, int currentId) {
		Scanner scan = new Scanner(System.in);
		int current = ejin.current;
		Course[] list = ejin.list; 

		int index = -1;

		for(int i=0; i<current; i++)
			if(list[i].id == currentId)
				index = i;         

		if(index == -1) {
			System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
			return;
		}

		list[index] = null;

		for(int i=0; i<current-index-1; i++)
			list[index+i] = list[index+1+i];

		current--;
		ejin.current = current;



	}

	private static void viewClass(CoursesList ejin, int currentId) {
		Scanner scan = new Scanner(System.in);

		System.out.print("#MAIN > #Select Class > #View Class & Edit member");
		
		int current = ejin.current;
		Course[] list = ejin.list;
		
		int index = -1;

		for(int i=0; i<current; i++)
			if(list[i].id == currentId)
				index = i;         

		if(index == -1) {
			System.out.println("선택한 id에 대한 과정 정보가 존재하지 않습니다.");
			return;
		}

		Course course = list[index];         

		System.out.printf("▶ Class ID : %d\n", course.id);
		System.out.printf("▶ Class Name : %s\n", course.name);
		System.out.print("▶ Member List : ");

		for(int i=0; i< course.members.length; i++)
			if(i == course.members.length-1)
				System.out.printf("%s", course.members[i]);
			else
				System.out.printf("%s, ", course.members[i]);

		System.out.println();

		System.out.println("1. Edit  2. Go back");

		int menu = Integer.parseInt(scan.nextLine());
		String[] names = null;

		if(menu == 1) {         
			System.out.print("▶ Member List :");
			names = scan.nextLine().split(",");
		}
		else if(menu == 2)
			return;

		System.out.println("Save? 1.Y / 2.N");
		System.out.print(">");
		int save = Integer.parseInt(scan.nextLine());

		if(save == 1) {
			course.members = names;
		}

	}

	private static void shakeClass() {



	}

	private static void addClass(CoursesList ejin) {
		Scanner scan = new Scanner(System.in);

		int id; 
		String name;
		String[] members;
		Course[] list = ejin.list;
		int current = ejin.current;

		System.out.print("▶ Class ID");
		id = Integer.parseInt(scan.nextLine());

		System.out.print("▶ Class Name");
		name = scan.nextLine();

		System.out.print("▶ Member List");
		members = scan.nextLine().split(",");

		int save;

		do {
			System.out.print("Save? 1.Y / 2.N");
			System.out.print(">");
			save = Integer.parseInt(scan.nextLine());

			if(save == 1) {
				list[current] = new Course();
				
				list[current].id = id;
				list[current].name = name;
				list[current].members = members;
				list[current].capacity = members.length;
				current++;
				ejin.current = current;
			}
			else if(save == 2) ;
			else {
				System.out.println("사용방법 : 1 또는 2번만 입력할 수 있습니다.");
			}
		}while(!(save == 1 || save == 2)); 

	}

	private static int inputMainMenu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("#1. MAIN");
		System.out.println();
		System.out.println();
		System.out.println("      SHAKE IT! SHAKE IT!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("   1. Class");
		System.out.println("   2. History");
		System.out.println("   3. Quit");
		System.out.println("   > ");

		int menu = Integer.parseInt(scan.nextLine());

		return menu;
	}

}