package chapter2.ex1.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
//import java.io.PrintStream;

//2. ������ ���̳ʸ��� �ؽ�Ʈ�� �����Ѵ�. 
//3. ���̳ʸ��� �о���� ����� �˾ƺ���. 
public class Program2FileSave {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\file_save.txt");
		PrintStream fout = new PrintStream(fos);

		int x = 163;  //�ؽ�Ʈ �����⸦ ���ڵ��� �ؽ�Ʈ��, �ڵ�� �ν��ؼ� �о��ش�. �׷��� 53�� �ƽ�Ű�ڵ��� 5�� ������ �ȴ�. 
		
		fos.write(x);
		//���ʹ´� \n+\r��

		//fout.write(x);
		
		fout.close();
		fos.close();
		System.out.println("���� �Ϸ�");

	}
}
