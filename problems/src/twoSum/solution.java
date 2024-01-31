package twoSum;

import java.util.Arrays;

public class solution {
    public int[] sol(int[] nums, int target) {


        int left = 0, right = nums.length - 1;

        while (left < right) {
            int current = nums[left] + nums[right];
            if (target == current) {
                return new int[]{left, right};
            }
            if (current < target) {
                left++;
            } else if (current > target) {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
