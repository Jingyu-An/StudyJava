package q3;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("bbbbb"));
	}

	public static int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;
		else if (s.length() == 1)
			return 1;

		int maxLength = 0;
		int front = 0;
		int end = 1;

		while (end < s.length()) {
			int i;
			for (i = front; i < end; i++) {
				if (s.charAt(i) == s.charAt(end)) {
					maxLength = maxLength > end - front ? maxLength : end - front ;
					front ++;
					break;
				}
			}
			if (i == end) {
				end ++;
			}
		}

		maxLength = maxLength > end - front ? maxLength : end - front;

		return maxLength;
	}
}
