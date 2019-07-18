package ejinjo;

import java.util.Scanner;

public class ShuffleProgram {

	public static void main(String[] args) {
		CourseList courseList = new CourseList();

		EXIT: while (true) {
			int menu = inputMainMenu();

			switch (menu) {
			case 1: // New Class
				courseList.listClass(); // addClass, insertClass, regClass, createClass, appendClass, .....
				break;
			case 2: // List Class
//				listHistory(); // editClass, modifyClass, .... showClass, detailCalss, getInfoClass, ....
				break;
			case 3: // Quit
				System.out.println("Bye~~~");
				break EXIT;
			default:
			}
		}
	
	}
	public static int inputMainMenu() {
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