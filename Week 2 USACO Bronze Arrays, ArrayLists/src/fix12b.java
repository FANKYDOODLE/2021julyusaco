import java.util.ArrayList;
import java.util.Scanner;
public class fix12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		int[] B = new int[N];
		for (int j = 0; j < N; j++) {
			int x = in.nextInt();
			if (x != 2) {
				A.add(x);
			}
			else if (x == 1) {
				B[j] = 1;
				B[j + 1] = 2;
			}
		}
		in.close();
		for (int j = 0; j < N; j++) {
			if (B[j] == -1) {
				B[j] = A.remove(0);
			}
		}

		System.out.println(A);
		for (int j = 0; j < A.size(); j++) {
			System.out.print(A.get(j) + " ");
		}
	}
}
