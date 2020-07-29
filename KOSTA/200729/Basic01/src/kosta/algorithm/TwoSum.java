package kosta.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == nums[i] + nums[j])
					return new int[] { i, j };
			}
		}
		// return null;
		throw new IllegalArgumentException("No twu sum solution");
	}

	public static int[] twoSum2(int[] nums, int target) {
		int result = 0;
		Map<Integer, Integer> int_map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
			int_map.put(nums[i], i);
		for (int i = 0; i < nums.length; i++) {
			if (int_map.containsKey(target - nums[i])) {
				result = target - nums[i];
				return new int[] { int_map.get(nums[i]), int_map.get(result) };
			}
		}
		throw new IllegalArgumentException("No twu sum solution");
	}

	public static void main(String[] args) {
		int nums[] = { 6, 4, 3, 8, 7, 5, 2 }; // ex) target: 5 -> index 반환
		int[] result = twoSum(nums, 5);
		result = twoSum2(nums, 5);
		System.out.println(result[0] + " " + result[1]);
	}

}
