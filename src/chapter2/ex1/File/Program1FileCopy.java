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
			fos.write(buffer, 0, 123); //1.���ۿ��� 2.�����ġ����(off�� 0������) 3.���������(123����Ʈ)
		//write(byte[])�� ����ع����� 1024�� 2���̳� �������..



		System.out.print("���� �Ϸ�");

		fos.close();
		fis.close();

	}
}
