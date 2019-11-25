package org.abyss.geektime.algol;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * remove-duplicates-from-sortes-array
 *
 * @date 2019-11-22
 */
public class Solution1 {

	public static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}

		return i + 1;
	}


	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 2, 3};

		System.out.println(removeDuplicates(nums));
	}

}
