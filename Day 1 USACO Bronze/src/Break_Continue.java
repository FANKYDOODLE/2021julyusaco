public class Break_Continue {
	public static void main(String args[]) {
		Houston:
		for (int k = 0; k < 5; k++) {
			System.out.print(k + ": ");
			for (int j = 1; j <= 10; j++) {
				if (j == 3) {
					continue;
				}
				System.out.print(j + " ");
				if (j == 4) {
					break Houston;
				}
			}
			System.out.println();
		}
	}
}