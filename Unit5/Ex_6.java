import java.util.Scanner;
public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an word: ");
		String str = keyboard.nextLine();
		for (int i = str.length() - 1; i >= 1 - 1; i = i - 1) {
			System.out.print(str.charAt(i));
		}
	}

}