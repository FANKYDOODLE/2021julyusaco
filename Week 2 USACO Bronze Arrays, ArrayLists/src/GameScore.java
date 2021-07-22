import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class GameScore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("score.in"));
		PrintWriter out = new PrintWriter(new File("score.out"));
		// Variables Input Line 1
		int n = in.nextInt();// n<=10 # of Rounds
		int m = in.nextInt();// m<=6, # of Different Scores

		// Variables
		int DifferentScores = 0;
		int roundscore = 0;
		// ArrayList
		ArrayList<Integer> DifferentRoundScores = new ArrayList<Integer>();
		ArrayList<Integer> DifferentFinishingScores = new ArrayList<Integer>();
		// Input Line Two
		for (int i = 0; i < m; i++) {
			DifferentScores = in.nextInt();
			DifferentRoundScores.add(DifferentScores);// Adds the different types of scores into the arraylist
			DifferentScores = 0;
		}
		for (int j = 0; j < m; j++) {
			roundscore = j;

		}

	}

}