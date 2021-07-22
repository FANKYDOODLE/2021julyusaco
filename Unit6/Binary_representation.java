
public class Binary_representation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int m = 12;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));

		System.out.println(n & m);
		System.out.println(n | m);
		System.out.println(n ^ m);

		System.out.println();
		n = 5;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(n << 1));
		System.out.println(Integer.toBinaryString(n << 2));
		System.out.println(Integer.toBinaryString(n << 3));

		System.out.println();
		System.out.println(Integer.toBinaryString(n >> 1));
		System.out.println(Integer.toBinaryString(n >> 2));
		System.out.println(Integer.toBinaryString(n >> 3));
	}


}
