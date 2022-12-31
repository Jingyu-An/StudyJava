package q9;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {

		if (x < 0 || x % 10 == 0 || x != reverseNumber(x))
			return false;

		return true;
	}

	public int reverseNumber(int x) {

		int reverseNum = 0;

		if (x == 0) return 0;

		reverseNum = (x % 10) * (int) Math.pow(10, (int) Math.log10(x));

		return reverseNum + reverseNumber(x / 10);
	}
}
