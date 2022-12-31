package q50;

public class Pow {

	public static void main(String[] args) {

		System.out.println(myPow(0.0001, 2147483647));
	}
	public static double myPow(double x, int n) {
		if (x == 0) return 0;
		if (x == 1 || n == 0) return 1;
		if (x == -1) {
			if (n % 2 == 0) return 1;
			else return -1;
		}

		double result = 1;
		if (n > 0) {
			while (n != 0) {
				if (result >= 10000) return 10000;
				if (result <= -10000) return -10000;
				if (result == 0) return 0;
				result = result * x;
				n--;
			}
		} else {
			while (n != 0) {
				if (result == 0) return 0;
				result = result / x;
				n++;
			}
		}
		return result;
	}
}
