
public class HW_1_Unit_1 {
	// compute the account amount if simple interest is added each year
	public static double addSimpleInterest(double P, double r, int n) {
		// TBI
		double simpleInterest = P * (1 + n * r);
		return simpleInterest;
	}

	// compute the account amount if interest is compounded each year
	public static double addCompoundInterest(double P, double r, int n) {
		// TBI
		double simpleInterest = P * Math.pow(1 + r, n);
		return simpleInterest;
	}
	public static void main(String[] args) {
		// test cases
		double P1 = 1000;
		double r1 = 0.04;
		int n1 = 10;
		double P2 = 1000;
		double r2 = 0.05;
		int n2 = 8;
		System.out.println(addSimpleInterest(P1, r1, n1));
		System.out.println(addCompoundInterest(P1, r1, n1));
		System.out.println(addSimpleInterest(P2, r2, n2));
		System.out.println(addCompoundInterest(P2, r2, n2));
	}

}
