import java.util.Scanner;
public class Loops_Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int M = in.nextInt();
		int N = in.nextInt();
		in.close();

		int count = 0;
		for (int x = M; x <= N; x++) {
			for (int y = M; y <= N; y++) {
				if (-c <= a * x + b * y && a * x + b * y <= c) {
					count++;
				}
			}
		}
		System.out.println(count);
		// approach 2:
		count = 0;
		for (int x = M; x <= N; x++) {
			int ub = Math.min(N, Math.floorDiv(c - a * x, b));
			int lb = Math.max(M, (int) Math.ceil((-c - a * x) / (double) b));
			count += ub - lb + 1;
		}
		System.out.println(count);
	}

}
