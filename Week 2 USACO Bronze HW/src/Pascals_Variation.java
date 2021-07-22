import java.util.ArrayList;
import java.util.Scanner;
public class Pascals_Variation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Input Values
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int trianglelines = in.nextInt();
		int average = (number1 + number2) / 2;
		int newnumbersum = 0;
		int newnumber1 = 0;
		int newnumber2 = 0;
		int thing = 0;

		// ArrayList
		ArrayList<Integer> List1 = new ArrayList<Integer>();
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		List1.add(number1);
		List1.add(number2);
		// For loops to generate the number
		System.out.println(List1);
		List2 = List1;
		if (trianglelines >= 2) {
			List2.add(1, average);
			System.out.println(List2);
		}
		if (trianglelines >= 3) {// If the number of lines is more than 3 then run this if
			for (int i = 0; i <= trianglelines - 2; i++) {// i starts at 0 then
				// goes through the loop until they reach -2 of trianglelines
				List1.clear();// Makes the list blank to add later from list2
				List1.add(number1);//
				for (int j = 0; j < List2.size(); j++) {
					if (j <= List2.size() - 2) {
						newnumber1 = List2.get(j);
						thing = j + 1;
						newnumber2 = List2.get(thing);
						newnumbersum = newnumber2 + newnumber1;
						List1.add(newnumbersum);
						System.out.println(List1);
					} else {
						List1.add(number2);
					}
					System.out.println(List1);
				}

			}
		}
	}
}
