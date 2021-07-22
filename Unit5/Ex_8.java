import java.util.Scanner;
public class Ex_8 {
	public static void main(String[] args) {
		String reverse = "";
		Boolean Palindrome = false;

		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an word: ");
		String str = keyboard.nextLine();

		for (int i = str.length() - 1; i >= 1 - 1; i = i - 1) {
			reverse = reverse + str.charAt(i);
		}

		if (reverse.compareTo(str) == 0) {
			Palindrome = true;
		}
		System.out.println(Palindrome);
	}
}
