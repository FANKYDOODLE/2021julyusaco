import java.util.Scanner;
public class Ex_1 {
	public static void main(String[] args) {
		Scanner NAME = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String a = NAME.nextLine();
		System.out.println(a);
		System.out.print("Enter a decimal: ");
		double b = NAME.nextDouble();
		System.out.println(b);
	}
}
