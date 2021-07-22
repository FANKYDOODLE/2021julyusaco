package unit7;

public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for (int r = n; r >= 1; r--) {
			for (int c = 1; c <= n - r; c++) {
				System.out.print(' ');
			}
			for (int c = 1; c <= 2 * r - 1; c++) {
				System.out.print('*');
		}
			System.out.println();
		}
		n = 10;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n - r; c++) {
				System.out.print(' ');
			}
			for (int c = 1; c <= 2 * r - 1; c++) {
				System.out.print('*');
		}
			System.out.println();
		}
	}
}
