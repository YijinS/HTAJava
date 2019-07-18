import java.io.IOException;
import java.util.Scanner;

public class TestInputProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		//Scanner scan1 = new Scanner(System.in);
		System.out.println("kor: ");
		int a = scan.nextInt();
		System.out.printf("%d", a);
		
		System.out.println("문자열을 입력하세요 ");
		String aa = scan.nextLine();
		System.out.println(aa);
		
		System.out.println();
		
		a = scan.nextInt();
		System.out.printf("%d", a);
		
		System.out.println();
		
		a = scan.nextInt();
		System.out.printf("%d", a);
		
		/*
		 * System.out.println("kor: ");
		 * 
		 * int a = System.in.read(); //50 입력 - 하나만 읽어서 5만 읽음 //read떄 prompt가 뜬 이유는 in에
		 * 아무것도 없었기 때문이다. a는 5의 53이 들어갑 System.out.println(a); // 5에 해당되는 5/3이라는 문자열로 출력
		 * 3 System.out.write(a); //53의 아스키 문자인 5를 출력 System.out.flush();
		 * 
		 * System.out.println();
		 * 
		 * a = System.in.read(); System.out.println(a); System.out.write(a);
		 * System.out.flush(); System.out.println();
		 * a = System.in.read(); System.out.println(a); System.out.write(a);
		 * System.out.flush(); //13에서 엔터키 값이 출력된다. //엔터키도 키값으로 들어간다- 엔터에 대한 코드값이 나오고 그
		 * 후에는 나올게 없으니 안보이는 것
		 */		
		

	}

}
