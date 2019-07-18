package chapter2.ex1.File;

import java.io.FileInputStream;
import java.io.IOException;
//import java.io.PrintStream;

//2. 파일을 바이너리와 텍스트로 저장한다. 
//3. 바이너리를 읽어오는 방법을 알아본다. 
public class Program3ReadingBMPFileHeader {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\java\\workspace\\SUN.bmp");
		final int BFH = 14; // 비트맵 FILE HEADER가 14바이트
		final int BIH = 40; //비트맵 종류에 대한 INFO HEADER 40바이트
		
	
		byte filebuf[] = new byte[BFH];
		byte infobuf[] = new byte[BIH];
		
	//int로 확장  합칠떄는 or 연산 | 를 한다. 인텔 cpu는 거꾸로 되어 있어서 스몰엔디언을 사용한다. 
		
		
		fis.read(filebuf);
		fis.read(infobuf); 
		//바이트열이 담겨있고 4바이트([0]~[3]는 건너 뛰어야 한다 (filebuf)의 그래서 infobuf는 infobuf[4], [5], [6], [7]부터 info 시작 
		//읽고 출력
		System.out.println("저장 완료");
		
		int width = ((int)infobuf[4] &0xff ) <<0 |  //8bit 왼쪽 시프트 계산이유 - cpu가 사용하는 기본단위가 8-bit입니다. 
				((int)infobuf[5] &0xff  )<<8 |
				( (int)infobuf[6] &0xff  )<<16 | 
				((int)infobuf[7] &0xff  )<<24;     //각 수들은 비트이다. 확장되는 경우 앞에 비어있는 비트들이 1로 채워져 정상적인 결과가 안나올수있다. 
		//앞을 0으로 하려면 &0xff  쓰면 된다. 우선순위를 위해 괄호를 사용한다. 

		System.out.printf("%d", width);
		
		System.out.println();
		
//		infobuf의 4바이트?를 합쳐야된다. .. 
		
		
		fis.close();

	}
}
