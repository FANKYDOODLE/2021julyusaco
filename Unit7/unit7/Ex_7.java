package unit7;

import java.util.Scanner;
public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.next();
		kb.close();

		int n = word.length();
		for (int r = 0; r <= n - 2; r++) {
			for (int c = 1; c <= n - 1 - r; c++) {
				System.out.print(' ');
			}
			System.out.print(word.charAt(r));
			for (int c = 1; c <= 2 * r - 1; c++) {
				System.out.print('+');
			}
			if (r > 0) {
				System.out.print(word.charAt(r));
			}
			System.out.println();

		}

		for (int j = word.length() - 1; j > 0; j--) {
			System.out.print(word.charAt(j));
		}
		System.out.println(word);
	}

}
