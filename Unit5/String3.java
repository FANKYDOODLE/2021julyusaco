
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2);

		String str3 = new String("Hello");// non-primitive
		System.out.println(str3);
		System.out.println(str1);
		System.out.println(str1 == str3);

		System.out.println(str1.equals(str3));
		// checking whether two string have the same content, use
		// .equals() rather than "=="!
		System.out.println(str1.equals(str2));
	}

}
