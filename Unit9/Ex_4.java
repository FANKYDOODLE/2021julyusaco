import java.util.ArrayList;
import java.util.Random;

public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random(1);
		ArrayList<Integer> D = new ArrayList<Integer>();
		for (int j = 0; j < 10; j++) {
			D.add(gen.nextInt(100) - 50);
		}
		for (int j = D.size() - 1; j >= 0; j--) {
			if (D.get(j) < 0) {
				D.remove(j);
			}
		}
		System.out.println(D);

	}

}
