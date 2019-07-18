import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestProgram {
	public static void main(String[] args) throws IOException {

		//FileOutputStream fos = new FileOutputStream("D:\\tools\\test1.txt");
		PrintStream fout = new PrintStream(new FileOutputStream("D:\\tools\\test1.txt"));
 		

		int k1=50, k2=65, k3 =80;
	
		int total = k1+k2+k3;
		float avg = total/3;
		
		fout.println("┌──────────────────────────────────────────┐");
		fout.println("│                                          │");
		fout.println("│                  \"성적 출력\"              │");
		fout.println("│                                          │");
		fout.println("└──────────────────────────────────────────┘");
		
		
		
		fout.close();
		//fos.close();

		System.out.println("실행 종료");
	
	}
}

