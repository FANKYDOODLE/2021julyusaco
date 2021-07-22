/*
 * Display the 9x9 times table.
 */
public class Ex_11 {
	public static void main(String[] args) {
		int n = 9;
		int[][] T = new int[n][n];

		// assignment
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				T[r][c] = (r + 1) * (c + 1);
			}
		}

		// display the table
		for (int r = 0; r < n; r++) { // outer layer --> rows
			for (int c = 0; c < n; c++) { // inner layer --> columns
				System.out.printf("%4d", T[r][c]);
			}

			System.out.print("  |  ");

			int sum = 0; // sum of elements in row r
			for (int c = 0; c < n; c++) {
				sum = sum + T[r][c];
			}

			System.out.printf("%4d", sum);
			System.out.println();
		}

		// horizontal line of separation
		for (int j = 0; j < 45; j++) {
			System.out.print("-");
		}
		System.out.println();

		// display the sums for each column
		int total = 0; // total sum of all elements in the times table
		for (int c = 0; c < n; c++) {
			// print the sum of column c

			int sum = 0; // sum of elements in column c
			for (int r = 0; r < n; r++) {
				sum = sum + T[r][c];
			}
			System.out.printf("%4d", sum);
			total = total + sum;
		}

		System.out.print("  |  ");
		System.out.printf("%4d", total);
		System.out.println();
	}
}