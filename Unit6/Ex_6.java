public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1200;
		int n = 180;
		int r = m % n;

		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		System.out.println(n);
		
		m = 1200;
		n = 180;
		r = 0;
		do {
			r = m % n;
			m = n;
			n = r;
		} while (r > 0);
		System.out.println(m);
	}
}
