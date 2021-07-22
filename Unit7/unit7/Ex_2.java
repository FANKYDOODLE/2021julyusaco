package unit7;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int r = 1; r <= n; r++) { // rows
			for (int c = 1; c <= r; c++) { // columns
				System.out.print("&");
			}
			System.out.println();
		}
	}

}
