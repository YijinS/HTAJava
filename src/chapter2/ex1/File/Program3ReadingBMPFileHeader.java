package chapter2.ex1.File;

import java.io.FileInputStream;
import java.io.IOException;
//import java.io.PrintStream;

//2. ������ ���̳ʸ��� �ؽ�Ʈ�� �����Ѵ�. 
//3. ���̳ʸ��� �о���� ����� �˾ƺ���. 
public class Program3ReadingBMPFileHeader {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\SUN.bmp");
		final int BFH = 14; // ��Ʈ�� FILE HEADER�� 14����Ʈ
		final int BIH = 40; //��Ʈ�� ������ ���� INFO HEADER 40����Ʈ
		
	
		byte filebuf[] = new byte[BFH];
		byte infobuf[] = new byte[BIH];
		
	//int�� Ȯ��  ��ĥ���� or ���� | �� �Ѵ�. ���� cpu�� �Ųٷ� �Ǿ� �־ ����������� ����Ѵ�. 
		
		
		fis.read(filebuf);
		fis.read(infobuf); 
		//����Ʈ���� ����ְ� 4����Ʈ([0]~[3]�� �ǳ� �پ�� �Ѵ� (filebuf)�� �׷��� infobuf�� infobuf[4], [5], [6], [7]���� info ���� 
		//�а� ���
		System.out.println("���� �Ϸ�");
		
		int width = ((int)infobuf[4] &0xff ) <<0 |  //8bit ���� ����Ʈ ������� - cpu�� ����ϴ� �⺻������ 8-bit�Դϴ�. 
				((int)infobuf[5] &0xff  )<<8 |
				( (int)infobuf[6] &0xff  )<<16 | 
				((int)infobuf[7] &0xff  )<<24;     //�� ������ ��Ʈ�̴�. Ȯ��Ǵ� ��� �տ� ����ִ� ��Ʈ���� 1�� ä���� �������� ����� �ȳ��ü��ִ�. 
		//���� 0���� �Ϸ��� &0xff  ���� �ȴ�. �켱������ ���� ��ȣ�� ����Ѵ�. 

		System.out.printf("%d", width);
		
		System.out.println();
		
//		infobuf�� 4����Ʈ?�� ���ľߵȴ�. .. 
		
		
		fis.close();

	}
}
