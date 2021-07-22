
public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.println(Math.pow(2, i));
			int x = (int) Math.pow(2, i);
			System.out.println(x);
		}
		for (int i = 1; i >= -10; i = i - 1) {
			System.out.println(Math.pow(2, i));
		}
	}

}
