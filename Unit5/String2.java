
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "compsci";
		String str1 = str.substring(2);
		System.out.println(str1);

		str1 = str.substring(2, 6);
		System.out.println(str1);

		int length = str.length();
		System.out.println(length);


		int loc = str.indexOf('c');
		System.out.println(loc);

		loc = str.lastIndexOf("c");
		System.out.println(loc);
	}
}