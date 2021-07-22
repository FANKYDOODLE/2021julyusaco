import java.util.Scanner;
public class Hw5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String a = keyboard.nextLine();
		String b = a.replaceAll("a", "z");
		b = b.replaceAll("A", "Z");
		b = b.replaceAll("e", "y");
		b = b.replaceAll("E", "Y");
		b = b.replaceAll("i", "x");
		b = b.replaceAll("I", "X");
		b = b.replaceAll("o", "w");
		b = b.replaceAll("O", "W");
		b = b.replaceAll("u", "v");
		b = b.replaceAll("U", "V");
		b = b.replaceAll("z", "e");
		b = b.replaceAll("Z", "E");
		b = b.replaceAll("y", "i");
		b = b.replaceAll("Y", "I");
		b = b.replaceAll("x", "o");
		b = b.replaceAll("X", "O");
		b = b.replaceAll("w", "u");
		b = b.replaceAll("W", "U");
		b = b.replaceAll("v", "a");
		b = b.replaceAll("V", "A");
		System.out.println(b);
	}
}
