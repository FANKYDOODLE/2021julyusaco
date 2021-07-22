
public class Ex_5 {

	public static int getSum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int getDiff(int a, int b) {
		int diff = a + b;
		return diff;
	}
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("sum = " + getSum(x, y));
		System.out.println("diff = " + getDiff(x, y));
	}

}
