import java.util.Scanner;
public class Ex_2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		;
		String word = kb.next();
		kb.close();

		if (word.isEmpty() || word.length() < 2) {
			System.out.println("INVALID INPUT TYPE SOMETHING LARGER THAN 2");
		}
		// first 2 chars and last 2 chars
		String s1 = word.substring(0, 2);
		String s2 = word.substring(word.length() - 2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}
}
