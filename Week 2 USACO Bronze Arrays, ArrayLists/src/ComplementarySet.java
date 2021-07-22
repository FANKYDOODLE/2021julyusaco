import java.util.ArrayList;
import java.util.Scanner;
public class ComplementarySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();

		int N = in.nextInt();
		int[] S = new int[N];
		for (int j = 0; j < N; j++) {
			S[j] = in.nextInt();
		}
		in.close();

		ArrayList<Integer> CS = new ArrayList<Integer>(B - A + 1);
		for (int x = A; x <= B; x++) {
			if (!CS.contains(x)) {
				CS.add(x);
			}
		}
		System.out.println(CS);
	}

}
