# 2021julyusaco
202 julyusaco we will have answer here blah blah balh lba;lkj
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Scanner and input
		Scanner in = new Scanner(new File("tttt.in"));
		PrintWriter out = new PrintWriter(new File("tttt.out"));
		String line1 = in.nextLine();
		String line2 = in.nextLine();
		String line3 = in.nextLine();
		//
		boolean check = false;
		int count = 0;
		int count1 = 0;
		// Character that adds into the Arraylist
		char n1 = 0;
		// ArrayLists
		ArrayList<Integer> Line1 = new ArrayList<Integer>();
		ArrayList<Integer> Line2 = new ArrayList<Integer>();
		ArrayList<Integer> Line3 = new ArrayList<Integer>();
		for (int i = 0; i < line1.length(); i++) {
			n1 = line1.charAt(i);
			Line1.add((int) n1);
		}
		System.out.println(Line1);
		for (int i = 0; i < line2.length(); i++) {
			n1 = line2.charAt(i);
			Line2.add((int) n1);
		}
		System.out.println(Line2);
		for (int i = 0; i < line3.length(); i++) {
			n1 = line3.charAt(i);
			Line3.add((int) n1);
		}
		System.out.println(Line3);
		// Comparing time
		// Line1 Output
		int a = Line1.get(0);
		int b = Line1.get(1);
		int c = Line1.get(2);
		if (a == b && a == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		// Line2
		a = Line2.get(0);
		b = Line2.get(1);
		c = Line2.get(2);
		if (a == b && a == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		// Line 3
		a = Line3.get(0);
		b = Line3.get(1);
		c = Line3.get(2);
		if (a == b && b == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		// Column 1
		a = Line1.get(0);
		b = Line2.get(0);
		c = Line3.get(0);
		if (a == b && b == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		// Column 2
		a = Line1.get(1);
		b = Line2.get(1);
		c = Line3.get(1);
		if (a == b && b == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		// Column 3
		a = Line1.get(2);
		b = Line2.get(2);
		c = Line3.get(2);
		if (a == b && b == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		// Diagonal 1
		a = Line1.get(0);
		b = Line2.get(1);
		c = Line3.get(2);
		if (a == b && b == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		// Diagonal 2
		a = Line1.get(2);
		c = Line3.get(0);
		if (a == b && b == c) {
			count++;
		}
		if (a == b || b == c || a == c) {
			count1++;
		}
		out.println(count);
		out.println(count1);
		out.close();
	}
}