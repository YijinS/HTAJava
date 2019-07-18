package chapter4.ex5.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import chapter3.ex1.capsule.Exam;


public class Program{
	public static void main(String[] args) {


		GList<Integer> list = new GList<Integer>();//Object클래스가 기본형은 못받기 때문에 객체 형으로 써줘야 한다.
		//GList<Integer> list = new GList<>(); or new GList(); 도 사용가능
		//GList list = new GList();<>를 없애면 기본형식인 Object형이 된다.
		list.add(2); //정수만 담을 수 있게되는 정수 전용 틀이 생김

		GList<Exam> list1 = new GList();
		list1.add(new Exam()); //이런식으로 다른 형으로 여러개 만들기도 가능 

		List<Integer> list2 = new ArrayList<>();  
		list2.add(4);
		list2.add(5);
		list2.get(0); //-> 3이 나온다
		//처음엔 ARRAY LIST를 기본으로 한다.  
		//컬렉션 종류 1. SET 계열 2. LIST 계열  3. MAP 계열 - 이셋의 차이점은 값을 식별하는 식별자. 
		for(int k : list2)
			System.out.println(k);

		Set<Integer> set = new HashSet();
		set.add(4); //list는 값을넣는데로 추가되지만 set의 경우 값이 키이기 때문에 같은 값이 중복되거나 두개 이상이면 하나만 저장된다(덮어서 써버린다)
		set.add(5);
		//set.size();
		//set.iterator().next(); //interator를 통해 순서대로 값을 꺼내온다. set이 갖고 있는 데이터를 하나씩 가져온다.
		Iterator it = set.iterator(); //iterator는 인덱스의 기능을 가지고 있고 각자 스레드가 가질 수 있도록 함.  멀티스레드일 수록 사용하는 것이 불편하니까 그를 위해 for문이 생겼다. ex. for(int x: set) - set에서 꺼내온 데이터가 인티저가 된다. sysout(x); 이렇게 출력하는 형태


		while(it.hasNext())
			System.out.println(it.next());
		// 또는
		for(int h : set) //for - each
			System.out.println(h);


		//식별자가 없어서 특정한 애를 집어서 꺼낼 수 없다. 처음부터 끝까지 출력할 수 밖에 없는데 그이유는 값이 키이기 때문

		//


		Map<String, Integer> map = new HashMap();
		map.put("번호", 4); //키와 값을 넣기 위해 add가 아닌 put을 쓴다.
		map.put("나이", 5);
		map.get("번호"); //3이 출력된다.

		for(String key: map.keySet())
			System.out.println(map.get(key));

		//모든 클래스는 열거 서비스가 따로 있다.

	}
} 
//제네릭(유연성 클래스 , 틀만 남는 것이다) - 데이터 형을 비워놓는다. 그렇게 만들면 어떤 자료형을 넣어도 만들어지는 템플렛이 된다.