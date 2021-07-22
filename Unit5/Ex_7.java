import java.util.Scanner;
public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = kb.next();
		kb.close();

		for (int j = 0; j < word.length(); j++) {
			char ch = word.charAt(j);
			if (ch >= 'a' && ch <= 'z') {
				char ch2 = (char) (ch - 'a' + 'A');
				System.out.println(ch);
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println((char) (ch - 'A' + 'a'));
			} else {
				System.out.println(ch);
			}
		}
		System.out.println();
	}

	static char switchCase(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			return (char) (ch - 'a' + 'A');
		} else if (ch >= 'A' && ch <= 'Z') {
			return (char) (ch - 'A' + 'a');
		} else {
			return ch;
		}
	}
}
