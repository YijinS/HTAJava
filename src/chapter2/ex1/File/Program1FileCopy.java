package chapter2.ex1.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.PrintStream;


public class Program1FileCopy {

	public static void main(String[] args) throws IOException {

		//FileInputStream fis = new FileInputStream("D:\\java\\workspace\\First.java");
		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\cat.bmp");


		//FileInputStream fis = new FileInputStream("D:\\java\\workspace\\First_copy.java");
		FileOutputStream fos = new FileOutputStream("D:\\java\\workspace\\cat_copy.bmp");

		int size =0;
		byte[] buffer = new byte[1024];

		while((size=fis.read(buffer)) != -1)
			fos.write(buffer, 0, 123); //1.버퍼에서 2.어느위치에서(off는 0부터임) 3.여기까지만(123바이트)
		//write(byte[])를 사용해버리면 1024를 2번이나 내줘버림..



		System.out.print("복사 완료");

		fos.close();
		fis.close();

	}
}
