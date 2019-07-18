package chapter2.ex1.cutting;

import java.io.File;

public class ExplorerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//"D:\\java\\workspace" 이 디렉토리의 목록을 찾아보도록한다. File 사용하기 <- 디렉토리도 파일의 한 종류이기 때문
		File file  = new File("D:\\java\\workspace" );
		
		File[] files = file.listFiles();
		
		for(int i=0; i<files.length; i++) {
			System.out.printf("%s: 파일명%s\n", files[i].isDirectory(), files[i].getName()  );
		}
		
		System.out.println();
		System.out.println("파일인가 >>");
		for(int i=0; i<files.length; i++) {
			System.out.printf("%s: 파일명%s\n", files[i].isFile(), files[i].getName()  );
		}
		// 파일명이 아닌 파일 객체로 알아낼때 배열을 통해 뽑아내는 것이 편하다. File[]   listFile일 경우 파일 배열을 받으면된다. 
	}

}
