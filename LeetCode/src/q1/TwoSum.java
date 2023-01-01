package q1;


import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int[] a1 = {2,7,11,15};
		int[] a2 = {3,2,4};
		int[] a3 = {3,3};
		int[] result = twoSum(a1, 9);

		System.out.println("[" + result[0] + ", " + result[1] + "]");
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		HashMap<Integer, Integer> numsArr = new HashMap<>();

		for(int i = 0; i < nums.length; i++) {
			if (i == 0) {
				numsArr.put(nums[i], i);
				continue;
			}

			if (numsArr.containsKey(target - nums[i]) ){
				result[0] = numsArr.get(target - nums[i]);
				result[1] = i;
				break;
			}

			numsArr.put(nums[i], i);
		}

		return result;
	}
}
