
public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] B = new int[10][9];
		for (int r = 0; r < B.length; r++) {
			for (int c = 0; c < B[r].length; c++) {
				B[r][c] = r + c;
			}
		}
		for (int r = 0; r < B.length; r++) {
			for (int c = 0; c < B[r].length; c++) {
				System.out.printf("%3d", B[r][c]);
			}
			System.out.println();
		}
	}


}
