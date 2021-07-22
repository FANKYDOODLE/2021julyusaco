package unit7;
import java.util.Scanner;

public class Hw7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String str = in.next().toUpperCase().trim();
		in.close();

		int n = str.length();

		// The X shape:
		System.out.println();

		// row 0
		System.out.println(str);

		// loop for row 1 through row n-2
		for (int r = 1; r < n - 1; r++) {
			for (int j = 0; j < n; j++) {
				if (j == r || j == n - 1 - r) {
					System.out.print(str.charAt(j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// row n-1
		System.out.println(str);

		// The parallelogram:
		System.out.println();

		String str2 = str + str;

		for (int r = 0; r <= n; r++) {
			// add white spaces at the beginning of each row
			for (int c = 0; c < r; c++) {
				System.out.print(" ");
			}

			System.out.println(str2.substring(r, n + r));
		}
	}
}