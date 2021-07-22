
public class Lab_Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		for (int i = 1; i <= 2021; i = i + 1) {
			if (i % 4 == 0) {
				counter = counter + 1;
			}
		}
		System.out.println(counter);
	}
}
