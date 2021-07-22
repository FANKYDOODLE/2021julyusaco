import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a long integer:");
		long n = kb.nextLong();
		kb.close();
		
		//find the sum of all digits of n
		int sum = 0;
		for(int k=0; n>0; k=k+1) {
			sum = sum + (int)(n%10);
			//System.out.println(k + "\t" + n + "\t" + sum);
			n = n/10;
		}
		System.out.println(sum);
		
		sum = 0;
		for( ; n>0; ) {
			sum = sum + (int)(n%10);
			n = n/10;
		}
		System.out.println(sum);
		
		//for part(b), leave it to Unit6 (while-loop)
	}
}
