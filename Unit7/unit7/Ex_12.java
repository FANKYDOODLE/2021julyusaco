package unit7;

import java.util.Scanner;
public class Ex_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a positive integer: ");
		int n = in.nextInt();
		in.close();
		
		//nested loops
		int count = 0;
		for(int a=1; a<=n; a++) {
			for(int b=a; b<=n; b++) {
				int sum = a * a * 2 + b * b;
				int c = (int) (Math.sqrt(sum) + 0.5);
				if(c<=n && c*c == sum) {
					System.out.println(a + "\t" + b + "\t" + c);
					count++;
				}
			}
		}
		System.out.println("Total # of triples: " + count);
	}
}
