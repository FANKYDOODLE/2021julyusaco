import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class cowtipping {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("cowtip.in"));
		PrintWriter out = new PrintWriter(new File("cowtip.out"));

		int N = in.nextInt();
		int[][] grid = new int[N][N];
		for (int r = 0; r < N; r++) {
			String line = in.next();

			for (int c = 0; c < N; c++) {
				grid[r][c] = line.charAt(c) - '0';
			}
		}
		int count = 0;
		for (int r = N - 1; r >= 0; r--) {
			for (int c = N - 1; c >= 0; c--) {
				if (grid[r][c] == 1) {
					count++;

					for (int x = 0; x <= r; x++) {
						for (int y = 0; y <= c; y++) {
							grid[x][y] = 1 - grid[x][y];
						}
					}
				}
			}
		}
		out.println(count);
		out.close();
	}

}
