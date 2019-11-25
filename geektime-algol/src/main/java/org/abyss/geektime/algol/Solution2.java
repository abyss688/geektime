package org.abyss.geektime.algol;

import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * rotate-array
 *
 * @date 2019-11-23
 */
public class Solution2 {

	public static void rotate(int[] nums, int k) {
		System.out.println(Arrays.toString(nums));

		if (nums == null) {
			return;
		}

		int temp, previous;

		for (int i = 0; i < k; i++) {
			previous = nums[nums.length - 1];

			for (int j = 0; j < nums.length; j++) {
				temp = nums[j];
				nums[j] = previous;
				previous = temp;
			}

		}

		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		int k = 1;

		rotate(nums, k);
	}


}
