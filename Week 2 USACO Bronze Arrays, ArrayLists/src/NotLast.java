
//Cows comparing the amount of milk total
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class NotLast {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stuff
		// Scanner in = new Scanner(new File("notlast.in"));
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new File("notlast.out"));
		// Basic Variables
		int log = in.nextInt();
		String name = "hello";
		int AddName = 0;

		// Cow Name Variables
		int BM = 0;
		int MM = 0;
		int EM = 0;
		int HM = 0;
		int DM = 0;
		int GM = 0;
		int AM = 0;

		// Least Variable
		int LeastMilk = 0;
		int SecondLeastMilk = 0;

		for (int i = 0; i < log; i++) {
			name = in.nextLine();
			if (name == "Bessie") {
				AddName = in.nextInt();
				BM = BM + AddName;
				System.out.println(BM);
			} else if (name == "Maggie") {
				AddName = in.nextInt();
				MM = MM + AddName;
				System.out.println(MM);
			} else if (name == "Elsie") {
				AddName = in.nextInt();
				EM = EM + AddName;
				System.out.println(EM);
			} else if (name == "Henrietta") {
				AddName = in.nextInt();
				HM = HM + AddName;
				System.out.println(HM);
			} else if (name == "Daisy") {
				AddName = in.nextInt();
				DM = DM + AddName;
				System.out.println(DM);
			} else if (name == "Gertie") {
				AddName = in.nextInt();
				GM = GM + AddName;
				System.out.println(GM);
			} else if (name == "Annabella") {
				AddName = in.nextInt();
				AM = AM + AddName;
				System.out.println(AM);
			}
			System.out.println(name);
			System.out.println(AddName);
		}
		LeastMilk = BM;

		// Maggie Compare
		if (MM < LeastMilk) {
			SecondLeastMilk = LeastMilk;
			LeastMilk = MM;
		} else if (MM > BM) {
			SecondLeastMilk = MM;
		}

		// Elsie Compare
		if (EM < LeastMilk) {
			SecondLeastMilk = LeastMilk;
			LeastMilk = EM;
		} else if (EM > LeastMilk) {
			SecondLeastMilk = EM;
		}

		// Henrietta Compare
		if (HM < LeastMilk) {
			SecondLeastMilk = LeastMilk;
			LeastMilk = HM;
		} else if (HM > LeastMilk) {
			SecondLeastMilk = HM;
		}

		// Daisy Compare
		if (DM < LeastMilk) {
			SecondLeastMilk = LeastMilk;
			LeastMilk = DM;
		} else if (DM > LeastMilk) {
			SecondLeastMilk = DM;
		}

		// Gertie Compare
		if (GM < LeastMilk) {
			SecondLeastMilk = LeastMilk;
			LeastMilk = GM;
		} else if (GM > LeastMilk) {
			SecondLeastMilk = GM;
		}

		// Annabelle Compare
		if (AM < LeastMilk) {
			SecondLeastMilk = LeastMilk;
			LeastMilk = AM;
		} else if (AM > LeastMilk) {
			SecondLeastMilk = AM;
		}
		System.out.println(BM + " " + EM + " " + HM + " " + DM + " " + GM + " " + AM);
		out.println(SecondLeastMilk);
		out.close();
	}

}
