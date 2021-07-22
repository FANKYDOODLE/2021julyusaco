public class Ex_3 {

	public static void main(String[] args) {
		int n = 10;
		int count = 0;

		for (int k = 1; k <= n; k++) {
			if (n % k == 0) {
				count++;
			}
		}
		count = 0;
		int k = 1;
		while (k < n) {
			if (n % k == 0) {
				count++;
			}
			k++;
		}
		System.out.println(count);
	}

}
