import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> L = new ArrayList<>();

		for (int j = 0; j < N; j++) {
			int x = in.nextInt();
			if (!L.contains(x)) {
				L.add(x);
			}
		}
		System.out.println(L);
		in.close();
	}

}
