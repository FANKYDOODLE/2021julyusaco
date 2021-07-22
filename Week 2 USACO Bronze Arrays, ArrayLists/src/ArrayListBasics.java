import java.util.ArrayList;
public class ArrayListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(2021);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2021);
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(list1==list2);
		System.out.println(list1.equals(list2));
	}

}
