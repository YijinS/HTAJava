package chapter2.ex2.suffle;

public class TestProgram1 {

	public static void main(String[] args) {
	
		Courses cls = new Courses(); //1.Value 타입 변수	2. reference 타입 변수
		//클래스는 참조타입 변수이다. 
		//new를 통해 객체를 만들때 cls에 공간이 생긴다. 
		//값 변수는 자체가 공간이다.  ex) int x 일 떄 x는 그 자체가 공간인 것임
		cls.id = 3;
		cls.name = "자바 풀스택";
		
		
		Courses[] classes = new Courses[10]; //클래스를 참조하기 위한 참조이름만 10개 배열로 만들어진것으로 클래스라는 객체를 만든것이 아니다. 
		
		// 객체로 만들려면 new를 해야한다
		for(int i =0; i<classes.length; i++) {
			classes[i] = new Courses();
			}
		
		for(int j=0; j<classes.length; j++) {
			classes[j].id =3;
			System.out.printf("%d", classes[j].id);
			System.out.println();
		}
		
		
	}
}
