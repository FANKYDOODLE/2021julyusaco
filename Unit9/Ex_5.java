import java.util.ArrayList;
public class Ex_5 {
	public static void deleteEven(ArrayList<Integer> A) {
//		for (int j = 0; j < A.size(); j++) {
//			if (j % 2 == 0) {
//				A.remove(j);
//				j--; // let j stay
//			}
//		}
		for (int j = A.size() - 1; j >= 0; j--) {
			if (j % 2 == 0) {
				A.remove(j);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		for (int j = 1; j <= 5; j++) {
			A.add(j);
		}
		System.out.println(A);
		deleteEven(A);
		System.out.println(A);
	}
}
