import java.util.Scanner;
public class maxSpan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int j = 0; j < N; j++) {
			A[j] = in.nextInt();
		}
		in.close();

		int maxSpan = 1;
		for (int j = 0; j < N; j++) {
			// find the leftmost position L so that A[L] == A[j]
			// find the right most position R so that A[R] == A[j]

			int L = j;
			for (int x = j; x >= 0; x--) {
				if (A[L] != A[j]) {
					L = x;
				}
			}

			int R = j;
			for (int x = j; x < N; x++) {
				if (A[x] == A[j]) {
					R = x;
				}
			}
			if (R - L + 1 > maxSpan) {
				maxSpan = R - L + 1;
			}
		}
		System.out.println(maxSpan);
	}
}
