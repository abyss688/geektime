package org.abyss.geektime.algol;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * two-sum
 *
 * @date 2019-11-25
 */
public class Solution4 {

	//	 给定 nums = [2, 7, 11, 15], target = 9
	//	 <p>
	//	因为 nums[0] + nums[1] = 2 + 7 = 9
	//	 所以返回 [0, 1]
	public static int[] twoSum(int[] nums, int target) {
		if (nums == null) {
			return null;
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int key = target - nums[i];
			if (map.containsKey(key)) {
				return new int[]{map.get(key), i};
			}

			map.put(nums[i], i);
		}

		return null;
	}


	public static void main(String[] args) {
		int[] nums = {2, 7, 7, 15};
		int target = 17;

		int[] value = twoSum(nums, target);
		System.out.println(Arrays.toString(value));
	}


}
