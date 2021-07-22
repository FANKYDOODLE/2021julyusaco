import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Conditional_Statements_FensePainting {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("pasture.in"));
		PrintWriter out = new PrintWriter(new File("pasture.out"));

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		int ans = 0;
		if (a < c) {
			if (b < c) {
				ans = b - a + d - c;
			} else if (b < d) {
				ans = d - a;
			} else {
				ans = b - a;
			}
		} else if (a < d) {
			if (b < d) {
				ans = d - c;
			} else {
				ans = b - c;
			}
		} else {
			ans = b - a + d - c;

		}
		out.println(ans);
		out.close();
	}
}
