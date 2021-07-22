import java.util.Scanner;
public class Loops_Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int count = 0;
		for (int a = 1; a <= N; a++) {
			for (int b = a; b <= N; b++) {
				for (int c = b; c <= N; c++) {
					if (a * a * 2 + b * b == c * c) {
						System.out.println(a + "   " + b + "   " + c + "   ");
						count++;
					}
				}
			}
		}
		System.out.println(count);
		// approach 2:
		count = 0;
		for (int a = 1; a <= N; a++) {
			for (int b = a; b <= N; b++) {
				int L = 2 * a * a + b * b;
				int rt = (int) Math.sqrt(L);
				if (rt <= N && rt * rt == L) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}