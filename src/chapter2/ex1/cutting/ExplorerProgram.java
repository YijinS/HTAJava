package chapter2.ex1.cutting;

import java.io.File;

public class ExplorerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//"D:\\java\\workspace" �� ���丮�� ����� ã�ƺ������Ѵ�. File ����ϱ� <- ���丮�� ������ �� �����̱� ����
		File file  = new File("D:\\java\\workspace" );
		
		File[] files = file.listFiles();
		
		for(int i=0; i<files.length; i++) {
			System.out.printf("%s: ���ϸ�%s\n", files[i].isDirectory(), files[i].getName()  );
		}
		
		System.out.println();
		System.out.println("�����ΰ� >>");
		for(int i=0; i<files.length; i++) {
			System.out.printf("%s: ���ϸ�%s\n", files[i].isFile(), files[i].getName()  );
		}
		// ���ϸ��� �ƴ� ���� ��ü�� �˾Ƴ��� �迭�� ���� �̾Ƴ��� ���� ���ϴ�. File[]   listFile�� ��� ���� �迭�� ������ȴ�. 
	}

}
