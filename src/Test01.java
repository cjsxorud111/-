import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list2.add(1);
		list2.add(1);
		list2.add(2);
		list2.add(2);
		
		list2.retainAll(list1);
		
		System.out.println(list2.toString());
		
	}

}
