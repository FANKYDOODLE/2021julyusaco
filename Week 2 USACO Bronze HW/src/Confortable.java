import java.util.ArrayList;
import java.util.Scanner;
public class Confortable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// My Scanner
		int number_cow = in.nextInt();// # of cows total
		int thing1 = 0;// is the x coordinate of a cow
		int thing2 = 0;// is the y coordinate of a cow
		int checkamount = 0;// checks if there are 3 cows around a cow
		int count = 0;// checks how many

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			thing1 = in.nextInt();
			x.add(thing1);
			thing2 = in.nextInt();
			y.add(thing2);
			System.out.println(0);
		}
		for (int i = 0; i < number_cow - 3; i++) {
			thing1 = in.nextInt();
			x.add(thing1);
			thing2 = in.nextInt();
			y.add(thing2);
			for (int j = 0; j < x.size(); j++) {
				a = x.get(j);
				b = y.get(j);
				for (int k = 0; k < x.size() - 1; k++) {
					c = x.get(k);
					d = y.get(k);
					if (c == a + 1 && d == b + 1 || c == a - 1 && d == b + 1 || c == a - 1 && d == b - 1
							|| c == a + 1 && d == b - 1) {
						checkamount++;
					}
				}
				if (checkamount == 3) {
					count++;
				}
				checkamount = 0;
			}

			System.out.println(count);
			count = 0;
		}
	}

}
