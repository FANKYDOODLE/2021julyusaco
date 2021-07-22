import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(new File("ex10.out"));
		PrintWriter output = new PrintWriter(new File("ex10.out"));
		// k++ is basically k += 1
		for (int k = 0; input.hasNext(); k++) {
			double a = input.nextDouble();
			output.println(k + ":/t" + a);
		}
		output.close();
	}

}
