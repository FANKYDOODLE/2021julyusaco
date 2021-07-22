
public class Ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'c';
		int val = 0;
		if (letter == 'A') {
			val = 65;
		} else if (letter == 'B') {
			val = 66;
			// you may thing it is 67 but it isn't because c is not the same as C
		} else if (letter == 'C') {
			val = 67;
		} else if (letter == 'D') {
			val = 68;
		} else {
			val = 69;
		}
		System.out.println(val);

	}

}
