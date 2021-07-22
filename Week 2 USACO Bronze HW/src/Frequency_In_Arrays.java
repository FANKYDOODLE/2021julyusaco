import java.util.ArrayList;
import java.util.Scanner;
public class Frequency_In_Arrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// Creates a scanner to get input from the person
		int n = in.nextInt();// Gets the number of items for the array.
		int n1 = 0;
		int n2 = 0;
		int count = 0;
		int maxcount = 0;

		ArrayList<Integer> Frequency = new ArrayList<Integer>();
		ArrayList<Integer> Frequency2 = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			n1 = in.nextInt();
			Frequency.add(n1);
			if (!Frequency2.contains(n1)) {
				Frequency2.add(n1);
			}
		}
		System.out.println(Frequency);
		System.out.println(Frequency2);
		for (int i = 0; i < Frequency2.size(); i++) {
			n2 = Frequency2.get(i);
			for (int j = 0; j < Frequency.size(); j++) {
				if (n2 == Frequency.get(j)) {
					count++;
				}
				if (count > maxcount) {
					maxcount = count;
				}
			}
			count = 0;
		}
		System.out.println(maxcount);
	}

}
