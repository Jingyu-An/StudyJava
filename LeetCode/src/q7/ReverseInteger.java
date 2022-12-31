package q7;

public class ReverseInteger {
	public static void main(String[] args) {
		System.out.println(ReverseInteger.reverse(-123));
	}
	public static int reverse(int x) {
		if (x == 0 || x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) return 0;
		int reverseNum = 0;

		while (Math.abs(x) > 0) {
			if ((double)reverseNum*10 > Integer.MAX_VALUE || (double)reverseNum*10 < Integer.MIN_VALUE) {
				reverseNum = 0;
				break;
			}
			reverseNum = reverseNum * 10 + x % 10;
			System.out.println(reverseNum);
			x /= 10;
		}
		return reverseNum;
	}
}
