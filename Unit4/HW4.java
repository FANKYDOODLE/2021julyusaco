import java.util.Scanner;
public class HW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the value of a3,a2,a1,a0:");
		double a3 = kb.nextDouble();
		double a2 = kb.nextDouble();
		double a1 = kb.nextDouble();
		double a0 = kb.nextDouble();

		kb.close();
		System.out.println("Possible solutions to the cubic equations are:");
		for (int i = -1000; i <= 1000; i++) {
			double c = 1 / 1000.0;
			double f = a3 * c * c * c + a2 * c * c + a1 * c + a0;

			if (Math.abs(f) < 0.001) {
				// DOESN"T PRINT?????
				System.out.println(c);
			}
		}
	}
}
