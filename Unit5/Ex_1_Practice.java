
public class Ex_1_Practice {
	public static void main(String[] args) {
		String str = "Hello World";
		String str2 = " ";
		System.out.println(str.charAt(0) + str2);
		System.out.println(str.charAt(1) + str2);
		System.out.println(str.charAt(2) + str2);
		System.out.println(str.charAt(3) + str2);
		System.out.println(str.charAt(4) + str2);
		System.out.println(str.charAt(5) + str2);
		System.out.println(str.charAt(6) + str2);
		System.out.println(str.charAt(7) + str2);
		System.out.println(str.charAt(8) + str2);
		System.out.println(str.charAt(9) + str2);
		System.out.println(str.charAt(10) + str2);
		System.out.println("SPLIT UP");

		// Another way to print
		for (int i = 0; i <= 10; i++) {
			// I have no idea why somebody would want to do this except if you want to print
			// some parts but other than that this is a weird way to do this
			System.out.print(str.charAt(i) + str2);
		}
	}
}
