public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 11;
		switch (num) {
		// only works in the number is = to 10
		case 10:
			System.out.println("num==10");
			break;
		// only works if the number is exactly 20
		case 20:
			System.out.println("num==20");
			break;
		// only works if the number is exactly 30
		case 30:
			System.out.println("num==30");
			break;
		// only works if the number is exactly 40
		case 40:
			System.out.println("num==40");
			break;
		// Anything that isn't one of those test cases goes to default
		default:
			System.out.println("not equal");
		}
	}
}
