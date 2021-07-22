import java.util.ArrayList;
import java.util.Scanner;
public class flowers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> Petals = new ArrayList<Integer>();// takes in the number of petals from the var flowerpetal
		ArrayList<Integer> Pairs = new ArrayList<Integer>();// Makes the arraylist for a pairs
		Scanner in = new Scanner(System.in);// takes in the input from

		int TotalFlowers = in.nextInt();// Gets the first line of input
		int FlowerPetal = 0;// the number of variable
		int PetalNumber;// Finds the value of petals for each flower and puts it into ArrayList Pairs
		float Avg = 0;// the average for the pair
		int Count = 0;// The total number of pairs
		int CheckNumber = 0;
		int Compare;
		boolean True = false;

		// Input File Format
		// 4
		// 1 1 2 3

		for (int x = 0; x < TotalFlowers; x++) {
			FlowerPetal = in.nextInt();
			Petals.add(FlowerPetal);
			// System.out.println(Petals);
		}
		in.close();
		for (int i = 0; i < TotalFlowers; i++) {
			for (int j = i; j < TotalFlowers; j++) {
				Avg = 0;
				for (int k = i; k <= j; k++) { // In this loop we get the numbers in the pair
					PetalNumber = Petals.get(k);
					Avg += PetalNumber;
				}
				Avg = Avg / (j - i + 1);// This gets the average
				// System.out.println(i + " " + j + " " + Avg);
				if (Avg == Math.ceil(Avg)) {// Checks whether it is a fraction

					for (int l = i; l <= j; l++) {// Runs a for loop through the pair again
						Compare = Petals.get(l);// Gets a number from the pair
						if (Compare == (int) Avg) {// Checks if the number is equal to the
							True = true;
							// System.out.println(Compare);
						}
					}
					if (True == true) {
						Count++;
					}
					True = false;
				}
			}
		}
		System.out.println(Count);
	}
}
