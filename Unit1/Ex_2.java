
public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = -128;
		byte b2 = 127;
		short s1 = -32768;
		short s2 = 32767;
		int i1 = -2000000;
		int i2 = 2000000;
		long l1 = -9 * 10 ^ 18;
		long l2 = 9 * 10 ^ 18;
		float f1 = -3 * 10 ^ 38;
		float f2 = 3 * 10 ^ 38;
		double d1 = -10 ^ 308;
		double d2 = 10 ^ 308;
		char c1 = 'A';
		char c2 = 'Z';

		System.out.println("The Max of byte is:" + b2);
		System.out.println("The Min of byte is:" + b1);
		System.out.println("The Max of short is:" + s2);
		System.out.println("The Min of short is:" + s1);
		System.out.println("The Max of int is:" + i2);
		System.out.println("The Min of int is:" + i1);
		System.out.println("The Max of long is:" + l2);
		System.out.println("The Min of long is:" + l1);
		System.out.println("The Max of float is:" + f2);
		System.out.println("The Min of float is:" + f1);
		System.out.println("The Max of double is:" + d2);
		System.out.println("The Min of double is:" + d1);
		System.out.println("The Max of char is:" + c2);
		System.out.println("The Min of char is:" + c1);
	}

}
