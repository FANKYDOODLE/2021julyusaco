
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int j = 1; j <= 1000; j++) {
			if (j % 10 == 7) {
				sum = sum + j;
			}
		}
		System.out.println(sum);
	}

}
