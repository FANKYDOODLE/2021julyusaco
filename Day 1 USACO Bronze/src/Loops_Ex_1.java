/*
 ARmstrang
 */
public class Loops_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0; // # of 3-digit Armstrong numbers
		for (int n = 100; n <= 999; n++) {
			// check if n is an Armstrong number
			int ones = n % 10;
			int tens = n / 10 % 10;// not the same as n /(10%10)
			int hundreds = n / 100;

			if (ones * ones * ones + tens * tens * tens + hundreds * hundreds * hundreds == n) {
				count++;
				System.out.println(n);
			}
		}
		System.out.println(count);
		// approach 2:
		count = 0;
		for (int a = 1; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					if (100 * a + 10 * b + c == a * a * a + b * b * b + c * c * c) {
						count++;
						System.out.println(100 * a + 10 * b + c);
					}
				}
			}
		}
		System.out.println(count);
	}

}
