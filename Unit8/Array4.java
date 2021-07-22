import java.util.Arrays;
import java.util.Random;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random(1);
		int[] A = new int[10];
		for (int j = 0; j < A.length; j++) {
			A[j] = gen.nextInt(100) - 50;
		}
		System.out.println(Arrays.toString(A));
		
		int count = 0;
				
		for(int i = 0; i < A.length; i++) {
			if(A[i]%2 == 0) {
				count++;
			}
		}
	}

}
