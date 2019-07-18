package chapter4.ex4.collection;

import chapter3.ex1.capsule.Exam;


public class Program{
	public static void main(String[] args) {
		int x =3;
		double d = 4.323;
		Integer z = 4; //자동 박싱 
		Exam exam = new Exam();
		String s = "Hello";
	
		Object[] list = new Object[5]; //5개의 방을 만들어준다(크기를 정하는 정적 배열)
		//object는 s는 기본형만 제외하고 담는 애임. 기본형을 객체형으로 바꿔주어야 한다.
		list[0] = new Integer(x); //인티저 박스로 만들어줌 - wrapping or boxing (wrapper class)
		list[3] = new Double(d);
		list[4] = z;  //자동 박싱되서 new Integer(4)와 같다
		list[1] = exam;
		list[2] = s;
		
		//int x1 = list[4]; 오류가 나는 이유는 자동 박싱으로 인해 list[4]는 객체화 되어 참조형이 되었고 int는 기본형으로 매치가 안되는 것
		//강제 형변환으로 (Integer)list[4] 해줘야 가능해짐
		for(int i=0; i<4; i++) {
			System.out.println(list[i]);

			
			
		}//a instanceof Integer -> a가 인티저의 오브젝트인지 확인하는 것
		  int a = 7;
		  double y = 3.4;

		  Object r = a + y;
		  System.out.println(r);

		  Object result = r;
	}
} 
//제네릭(유연성 클래스 , 틀만 남는 것이다) - 데이터 형을 비워놓는다. 그렇게 만들면 어떤 자료형을 넣어도 만들어지는 템플렛이 된다.