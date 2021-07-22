
//*
import java.util.ArrayList;
import java.util.Scanner;
public class Ex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true) {
			System.out.println("Please enter an integer:");
			int a = kb.nextInt();
			if(a<=0) {
				break;
			}
			list.add(a);
		}
		kb.close();
		
		int sum = 0;
		for(int j = 0; j<list.size();j++) {
			sum = sum+list.get(j);
		}
		
		int n = list.size();
		double avg = (double)sum/n;
		
		double sum2 = 0;
//		for()
	}

}
