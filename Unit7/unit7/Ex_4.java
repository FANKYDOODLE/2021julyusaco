package unit7;
public class Ex_4 {
	public static void main(String[] args) {
		int n = 10;

		//// white spaces
		// for(int r=n; r>0; r--) {
		// for(int c=1; c<=r; c++) {
		// System.out.print("+ ");
		// }
		// System.out.println();
		// }
		//
		//// '#'
		// for(int r=1; r<=n; r++) {
		// for(int c=1; c<=r; c++) {
		// System.out.print("# ");
		// }
		// System.out.println();
		// }

		// merge the '#' to the ' '
		for (int r = 1; r <= n; r++) {
			// display the ' '
			for (int c = 1; c <= n - r; c++) {
				System.out.print(' ');
			}

			// display the '#'
			for (int c = 1; c <= r; c++) {
				System.out.print('#');
			}

			System.out.println();
		}

	}
}