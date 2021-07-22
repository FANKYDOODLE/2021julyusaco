import java.util.Arrays;
import java.util.Scanner;
public class fix12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // # of integers
		int[] A = new int[N];
		for (int j = 0; j < N; j++) {
			A[j] = in.nextInt();
		}
		in.close();

		int[] B = new int[N];
		Arrays.fill(B, -1);

		for (int j = 0; j < N; j++) {
			if (A[j] == 1) {
				B[j] = 1;
				B[j + 1] = 2;
			}
		}

		int pos = 0; // position in array B
		for (int j = 0; j < N; j++) {
			if (A[j] != 1 && A[j] != 2) {
				while (pos < N && B[pos] != -1) {
					pos++;
				}
				B[pos] = A[j];
			}
		}
		for (pos = 0; pos < N; pos++) {
			System.out.print(B[pos] + " ");
		}
		System.out.println();
	}

}
