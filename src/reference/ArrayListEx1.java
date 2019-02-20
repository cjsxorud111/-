package reference;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);
		list.add("111");
		list.add("222");
		list.add("333");
		list.add(333);
		System.out.println(list);
		list.add(1, "¾È³çÇÏ¼¼¿©");
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println(list.get(3));
		
		System.out.println(list.indexOf(333));
	}

}
