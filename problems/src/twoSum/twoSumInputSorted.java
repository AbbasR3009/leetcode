package twoSum;


import java.util.Arrays;

public class twoSumInputSorted {

    public static void main(String[] args) {
        int[] nums = {2,3,4};

        int target = 6;
        solution solution = new solution();
        int [] b = solution.sol(nums, target);
        System.out.println(Arrays.toString(b));
    }
}




