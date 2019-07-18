package chapter2.ex1.cutting;

public class SuffleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "photo.jpg"; //문자열 객체가 되어씀. 
		System.out.println(fileName.length()); // .length()를 사용하면 fileName의 문자열 길이를 알 수 있다. 
		
		//파일명을 불러들이고 확장명만 떄고 이름만 사용하고 싶을 때   .jpg의 위치를 알아서 잘라야 한다. 결국 '.'의 위치를 알아야한다
		System.out.println(fileName.indexOf("."));   // .이 5번째 위치에 존재한다. 문자열 셀 때 0부터 시작해야함. 
		
		//앞의 글자를 잘라서 가져오는 방법 ex) 파일명에서 4번째 문자까지만 출력하기
		System.out.println(fileName.substring(0, fileName.indexOf(".")));   
		
		// 만약 . 까지 찍어야 되는데 파일이름.이름.확장자의 경우 문제가 발생하니 뒤에서 부터 인덱스를 찾아봐야한다. 그때 사용하는 것이 lastIndexOf()  <- 인덱스는 같고 뒤에서 부터 찾는 것 
		System.out.println(fileName.substring(0, fileName.lastIndexOf(".")));   
	
		System.out.println(fileName.substring( fileName.lastIndexOf(".")+1)); // substring(6)이라고 하면 6번째부터 그 다음번째 수까지 
		
		String data = "홍 길동.강 호동. 이 승기. 유 재석. 차 태현";
		String[] name = data.split("\\.");
		System.out.println(name[1]);  //두번째 이름 출력 
		System.out.println(name.length);		// 몇개의 문자가 나왔는지 출력이 가능해진다. 
		
		
	//	
		
		//String[] names = new String[12];
		//String[] names = {"추진협", "윤종환", "소이진", "이지연", "오성미"};		
		
	}
                   
}
