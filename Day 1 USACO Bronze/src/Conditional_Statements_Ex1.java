import java.util.Scanner;
public class Conditional_Statements_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int count = 0;
		System.out.println("Type in your beggining year");
		int FirstYear = kb.nextInt();
		System.out.println("Type in your ending year");
		int LastYear = kb.nextInt();
		for (int i = FirstYear; i <= LastYear; i++) {
			if(i%4==0) {
				count++;
			}
		}
		System.out.println("The number of leap years between the years you chose are:"+count);
	}

}
