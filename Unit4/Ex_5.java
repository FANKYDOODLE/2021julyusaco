import java.util.Scanner;
public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		boolean prime = true;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = keyboard.nextInt();
		for (int i = 1; i <= a; i = i + 1) {
			if (a % i == 0) {
				counter++;
				System.out.println(i);
				if (i == 0) {
					prime = true;
				} else if (i == a) {
					System.out.println("DO NOTHING");
				} else {
					prime = false;
				}
			}
		}
		System.out.println(prime);
	}
}
