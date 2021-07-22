
public class Ex_11 {

	public static void main(String[] args) {
		double sum = 0;
		int sign = 1;
		for (int x = 1; x <= 237; x = x + 2) {
			// TBI
			sum = sum + sign * 1.0 / x;
			sign = sign * -1;
		}
		System.out.println(sum * 4);
	}

}
