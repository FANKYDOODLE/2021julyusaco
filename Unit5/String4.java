
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "cat";
		String s2 = "dog";
		System.out.println(s1.compareTo(s2));
		System.out.println('c' - 'd');
		s1 = "ccat";
		s2 = "ca";
		System.out.println(s1.compareTo(s2));
		System.out.println("abc".compareTo("x"));// string <--
		System.out.println('a' - 'x');// single character has '' <--
	}

}
