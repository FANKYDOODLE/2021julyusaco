import java.util.Arrays;
import java.util.Random;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random(1);
		int[] A = new int[10];
		for(int j=0; j<A.length; j++) {
			A[j] = gen.nextInt(100) - 50;
		}
		
		System.out.println(Arrays.toString(A));
		
		int minVal = A[0];
		for(int i = 0; i < A.length; i++) {
			if (A[i] < minVal) {
				minVal = A[i];
			}
		}
		int diff = 0;
	}

}
