import java.util.Scanner;
public class Hangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Game");
		String[] words = new String[] { "computer", "mouse", "screen", "display", "language" };
		String randomWord = words[(int) (Math.random() * words.length)];
		char[] letters = new char[randomWord.length()];
		int lives = 3;
		Scanner scanner = new Scanner(System.in);
		while (lives > 0) {
			System.out.print("Lives: ");
			for (int i = 0; i < lives; i++) {
				System.out.print("({|})");
			}
			System.out.println();
			System.out.println("Input:");
			String input = scanner.nextLine();
			char letter = input.charAt(0);
			System.out.println("Word: ");
			for (int i = 0; i < letters.length; i++) {
				System.out.println(letters[i]);
			}

		}
	}
}
