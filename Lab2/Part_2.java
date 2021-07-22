import java.util.Scanner;
public class Part_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int number = (int) (Math.random() * 100) + 1;
		int roundcount = 0;
		boolean correct = false;
		while(correct == false) {
			//Guess
			Scanner SCAN = new Scanner(System.in);
			System.out.println("Guess:");
			roundcount++;
			int guess = kb.nextInt();
			//Check if correct
			if(guess == number) 
			{
				System.out.println("Congrats! You beat it with " + roundcount + " tries. STUPID MESSAGE INCOMING");
				//Special comment
				if(roundcount > 50) {
					System.out.println("But like, HOW COULD YOU DO THIS BAD do better jeez");
				}
				else if(roundcount > 25) {
					System.out.println("Errrr,nice job?");
				}
				else if(roundcount < 25 && roundcount > 10) {
					System.out.println("Pretty fast for a fast brain");
				}
				else if(roundcount == 3) {
					System.out.println("Third times the charm");
				}
				else if(roundcount == 1) {
					System.out.println("An almost impossible score woohoo. Confetti for you!");
				}
				else {
					System.out.println("First ten tries decently good.");
				}
			}
			//Wrong
			else 
			{
				System.out.println("I guess you should NO that you did not get the right answer *wink.");
				//special comment
				if(roundcount > 50) {
					System.out.println("You seriously cannot do any worse than this unless you're trying to fail");
				}
				else if(roundcount > 25) {
					System.out.println("You can do it I believe in you.");
				}
				else if(roundcount > 10) {
					System.out.println("You're early in game don't rush youself to get it wrong");
				}
				else if(roundcount < 10) {
					System.out.println("Believe in yourself victory is waiting");
				}
				if(guess > number) {
					System.out.println("Too high try again");
				}
				else if(guess < number){
					System.out.println("Too low try again");
				}
			}
		}
	}
}