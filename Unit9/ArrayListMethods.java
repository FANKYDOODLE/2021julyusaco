import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		//add(item)
		//You can also do ArrayList<Integer> to add integers
		ArrayList<String> Example = new ArrayList<String>();
		Example.add("Hello");
		Example.add(", World");
		System.out.println(Example);
		//add(spot,item)
		ArrayList<String> Example_2 = new ArrayList<String>();
		Example.add("World");
		Example.add(0, "Hello");
		// get
		Example.get(0);
		// returns the size of the list
		int x = Example.size();
		System.out.println(x);
		// remove
		Example.remove(1);
		Example.remove("Hello");
		System.out.println(Example);
		// clear
		Example.clear();
		System.out.println(Example);
		// equals
		ArrayList<String> Example_1 = new ArrayList<String>();
		boolean x1 = Example.equals(Example_1);
		System.out.println(x1);
	}

}
