
//If an array is included in another array for ex:
//[4,6,7,9] is included in [2,2,4,6,7,9] so its true
import java.util.Scanner;
public class ArrayInclusion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();

		int[] A = new int[N];
		for (int j = 0; j < N; j++) {
			A[j] = in.nextInt();
		}

		int[] B = new int[M];
		for (int k = 0; k < M; k++) {
			B[k] = in.nextInt();
		}
		in.close();

		int x = 0, y = 0;
		boolean isValid = true;
		while (x < N && y < M) {
			if (A[x] < B[y]) {
				x++;
			} else if (A[x] > B[y]) {
				isValid = false;
				break;
			} else {
				x++;
				y++;
			}
		}
		System.out.println(isValid);
	}
}
