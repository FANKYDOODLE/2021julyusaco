import java.util.Scanner;
public class diamond {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int r1 = in.nextInt();

		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int r2 = in.nextInt();

		// [x1-r1,x1+r1]
		int count = 0;
		for (int x = x1 - r1; x <= x1 + r1; x++) {
			for (int y = y1 - r1; y <= y + 1 + r1; y++) {
				int d1 = (x - x1) * (x - x1) + (y - y1) * (y - y1);
				int d2 = Math.abs(x - x2) + Math.abs(y - y2);
				if (d1 <= r1 * r1 && d2 <= r2) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
