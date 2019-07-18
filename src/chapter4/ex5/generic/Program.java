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


		GList<Integer> list = new GList<Integer>();//ObjectŬ������ �⺻���� ���ޱ� ������ ��ü ������ ����� �Ѵ�.
		//GList<Integer> list = new GList<>(); or new GList(); �� ��밡��
		//GList list = new GList();<>�� ���ָ� �⺻������ Object���� �ȴ�.
		list.add(2); //������ ���� �� �ְԵǴ� ���� ���� Ʋ�� ����

		GList<Exam> list1 = new GList();
		list1.add(new Exam()); //�̷������� �ٸ� ������ ������ ����⵵ ���� 

		List<Integer> list2 = new ArrayList<>();  
		list2.add(4);
		list2.add(5);
		list2.get(0); //-> 3�� ���´�
		//ó���� ARRAY LIST�� �⺻���� �Ѵ�.  
		//�÷��� ���� 1. SET �迭 2. LIST �迭  3. MAP �迭 - �̼��� �������� ���� �ĺ��ϴ� �ĺ���. 
		for(int k : list2)
			System.out.println(k);

		Set<Integer> set = new HashSet();
		set.add(4); //list�� �����ִµ��� �߰������� set�� ��� ���� Ű�̱� ������ ���� ���� �ߺ��ǰų� �ΰ� �̻��̸� �ϳ��� ����ȴ�(��� �������)
		set.add(5);
		//set.size();
		//set.iterator().next(); //interator�� ���� ������� ���� �����´�. set�� ���� �ִ� �����͸� �ϳ��� �����´�.
		Iterator it = set.iterator(); //iterator�� �ε����� ����� ������ �ְ� ���� �����尡 ���� �� �ֵ��� ��.  ��Ƽ�������� ���� ����ϴ� ���� �����ϴϱ� �׸� ���� for���� �����. ex. for(int x: set) - set���� ������ �����Ͱ� ��Ƽ���� �ȴ�. sysout(x); �̷��� ����ϴ� ����


		while(it.hasNext())
			System.out.println(it.next());
		// �Ǵ�
		for(int h : set) //for - each
			System.out.println(h);


		//�ĺ��ڰ� ��� Ư���� �ָ� ��� ���� �� ����. ó������ ������ ����� �� �ۿ� ���µ� �������� ���� Ű�̱� ����

		//


		Map<String, Integer> map = new HashMap();
		map.put("��ȣ", 4); //Ű�� ���� �ֱ� ���� add�� �ƴ� put�� ����.
		map.put("����", 5);
		map.get("��ȣ"); //3�� ��µȴ�.

		for(String key: map.keySet())
			System.out.println(map.get(key));

		//��� Ŭ������ ���� ���񽺰� ���� �ִ�.

	}
} 
//���׸�(������ Ŭ���� , Ʋ�� ���� ���̴�) - ������ ���� ������´�. �׷��� ����� � �ڷ����� �־ ��������� ���÷��� �ȴ�.