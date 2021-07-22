import java.util.Scanner;
public class Guessing_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int number = (int) (Math.random() * 100) + 1;
		int roundcount = 0;
		boolean correct = false;
		System.out.println("Guess:");
		int guess = kb.nextInt();
		while (correct == false) {
			if (guess == number) {
				roundcount++;
				correct = true;
			} else {
				roundcount++;
				System.out.println("You should NO that you're wrong");
				if (roundcount == 50) {
					System.out.println("You seriously can't get any worse than this can you.");
				} else if (roundcount == 25) {
					System.out.println(
							"Uh, Nobody always gets it on their first time. unless ur the luckiest person alive.");
				} else if (roundcount == 10) {
					System.out.println("Passed 10 errors come on I'm rooting for ya.");
				}
				if (guess > number) {
					System.out.println("Too big :/");
				} else if (guess < number) {
					System.out.println("Too small");
				}
				System.out.println("Guess:");
			}
		}
		if (roundcount >= 50) {
			System.out.println(
					"Finally you were taking a little too long to beat this. You had :" + roundcount + "tries");
		} else if (roundcount >= 25) {
			System.out.println("Nice job pretty fast i think *googles*. Either way you used:" + roundcount + "tries");
		} else if (roundcount >= 10) {
			System.out
					.println("Pretty fast brain for some pretty fast tries amirite. You used: " + roundcount + "tries");
		} else if (roundcount >= 1) {
			System.out.println("Okay how did you do it that fast.You used: " + roundcount + "tries");
		}
	}
}
