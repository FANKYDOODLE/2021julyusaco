import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class NotLastTeacherVer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("notlast.in"));
		PrintWriter out = new PrintWriter(new File("notlast.out"));

		String[] names = { "Bessie", "Elsie", "Gertie", "Annabelle", "Henrietta", "Maggie", "Daisy" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(names));
		int[] milk = new int[7];
		int N = in.nextInt();// # of records
	}

}
