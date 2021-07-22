import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = keyboard.nextInt();
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println((int) Math.pow(j, i));
			}
		}
	}

}
