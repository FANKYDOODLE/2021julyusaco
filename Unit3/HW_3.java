
public class HW_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// counter for how many numbers aren't able to be simplified when
		int counter = 1;
		// TODO Auto-generated method stub
		// For loop using all number up to 105 so that you can find the remain
		for (int i = 1; i <= 104; i = i + 1) {
			if (105 % i != 0) {
				// prints all the answers that work.
				System.out.println(i);
				counter = counter + 1;
			}
		}
		counter = 1;
		for (int i = 1; i <= 104; i = i + 1) {
			if (i % 105 != 0 && i % 5 != 0 && i % 7 != 0) {
				counter++;
			}
		}
		System.out.println(counter);
		//System.out.println(counter);
	}
}
