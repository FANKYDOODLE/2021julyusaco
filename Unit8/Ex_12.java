
public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		char[][] A = new char[n][n];
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				A[r][c] = '#';
			}
		}

		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if (r + c <= n - 1) {
					A[r][c] = '*';
				}
			}
		}
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				System.out.println(A[r][c] + " ");
			}
			System.out.println();
		}
	}

}
