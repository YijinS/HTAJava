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
		
		System.out.println("���ڿ��� �Է��ϼ��� ");
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
		 * int a = System.in.read(); //50 �Է� - �ϳ��� �о 5�� ���� //read�� prompt�� �� ������ in��
		 * �ƹ��͵� ������ �����̴�. a�� 5�� 53�� �� System.out.println(a); // 5�� �ش�Ǵ� 5/3�̶�� ���ڿ��� ���
		 * 3 System.out.write(a); //53�� �ƽ�Ű ������ 5�� ��� System.out.flush();
		 * 
		 * System.out.println();
		 * 
		 * a = System.in.read(); System.out.println(a); System.out.write(a);
		 * System.out.flush(); System.out.println();
		 * a = System.in.read(); System.out.println(a); System.out.write(a);
		 * System.out.flush(); //13���� ����Ű ���� ��µȴ�. //����Ű�� Ű������ ����- ���Ϳ� ���� �ڵ尪�� ������ ��
		 * �Ŀ��� ���ð� ������ �Ⱥ��̴� ��
		 */		
		

	}

}
