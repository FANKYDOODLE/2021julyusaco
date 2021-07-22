public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trials = 0;
		int count = 0;

		while (count < 100) {
			double tmp = Math.random();
			if (tmp > 0.5) {
				count++;
			}
			trials++;
		}
		System.out.println(trials);
		count = 0;
		trials = 0;
		while (count < 100) {
			int tmp = (int) (Math.random() * 10 + 1);
			if (tmp > -6) {
				count++;
			}
			trials++;
		}
		System.out.println(trials);
	}

}
