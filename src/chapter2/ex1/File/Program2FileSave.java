package chapter2.ex1.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
//import java.io.PrintStream;

//2. 파일을 바이너리와 텍스트로 저장한다. 
//3. 바이너리를 읽어오는 방법을 알아본다. 
public class Program2FileSave {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\file_save.txt");
		PrintStream fout = new PrintStream(fos);

		int x = 163;  //텍스트 편집기를 숫자들을 텍스트로, 코드로 인식해서 읽어준다. 그래서 53의 아스키코드인 5만 저장이 된다. 
		
		fos.write(x);
		//엔터는는 \n+\r임

		//fout.write(x);
		
		fout.close();
		fos.close();
		System.out.println("저장 완료");

	}
}
