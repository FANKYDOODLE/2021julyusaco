
public class Loop_Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int current = 0;
		for (int pow = 0; pow <= 1000; pow++) {
			long numberpower = (long) Math.pow(3, pow);
			int m = (int) numberpower / 10000;
			int one = m % 10;
			int ten = m / 10 % 10;
			int hum = m / 100 % 10;
			int thou = m / 1000 % 10;
			int sum = one + ten + hum + thou;
			current = sum;
			if (current > max) {
				max = current;
			}
		}
		System.out.println("The max sum is:" + max);

		// find the sum of digits of power
		int maxSum = 1;
		int power = 1;
		for (int n = 1; n <= 1000; n++) {
			power = power * 3;
			power = power % 10000;
			int sum = power % 10;
			sum += power / 10 % 10;
			sum += power / 100 % 10;

		}
	}

}
