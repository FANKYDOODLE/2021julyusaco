import java.util.Scanner;
public class Count_Clumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int j = 0; j < N; j++) {
			A[j] = in.nextInt();
		}
		in.close();

		int count = 0;
		int j = 0;
		while (j < N) {
			// find the first k so that A[j] = A[j+1] = ... = A[k-1] != A[k]
			int k = j + 1;
			while (k < N && A[k] == A[j]) {
				k++;
			}
			if (k > j + 1) {
				count++;
			}
			j = k;
		}
		System.out.println(count);
	}
}
