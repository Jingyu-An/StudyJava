package q50;

public class Pow {

	public static void main(String[] args) {

		System.out.println(myPow(0.0001, 2147483647));
	}
	public static double myPow(double x, int n) {
		if (x == 0) return 0;
		else if (x == 1 || n == 0) return 1;
		else if (x == -1) {
			if (n % 2 == 0) return 1;
			else return -1;
		}

		double result = 1;
		int tempN = n;

		while (tempN != 0) {
			if (tempN % 2 == 0) {
				x = x * x;
				tempN /= 2;
			} else {
				result = result * x;
				if (tempN < 0) tempN += 1;
				else tempN -= 1;
			}
		}
		if (n < 0) return 1/result;
		return result;
	}
}
