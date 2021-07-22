import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your name with # in the middle:");
		String fullName = kb.nextLine();
		kb.close();

		int loc = fullName.indexOf("#");
		String firstName = fullName.substring(0, loc).trim();
		String lastName = fullName.substring(loc + 1).trim();
	}

}
