import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class crossroad {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("crossroad.in"));
		PrintWriter out = new PrintWriter(new File("crossroad.out"));
		int N = in.nextInt();
		int[][] sides = new int[N][2];
		for (int j = 0; j < N; j++) {
			sides[j][0] = in.nextInt();
			sides[j][1] = in.nextInt();
		}
		in.close();
		// count the confirmed crossings
		int count = 0;
		for (int cow = 1; cow <= 10; cow++) {
			int last = -1;// haven't seen the cow yet
			for (int j = 0; j < N; j++) {
				if (sides[j][0] == cow) {
					if (last != -1 && sides[j][1] != last) {
						count++;
					}
					last = sides[j][1];
				}
			}
		}
		out.println(count);
		out.close();
	}

}
