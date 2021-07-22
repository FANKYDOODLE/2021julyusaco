import java.util.Scanner;
public class Loops_Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Type in an integer");
		int L = in.nextInt();
		System.out.println("Type in another integer");
		int R = in.nextInt();
		int count = 0;

		// count the # of times the digit 3 appears in integers between[L,R]
		for (int i = L; i <= R; i++) {
			int x = i;
			while (x > 0) {
				int ones = x % 10;
				if (ones == 3) {
					count++;
				}
				x = x / 10;
			}

		}
		System.out.println("The number of 3's in the integers between the integers you put in is:" + count);
		in.close();
	}

}
