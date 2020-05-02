package com.arithmetic.exercise.leetcode;

/**
 * @program: leetCode-exercise
 * @description: 33. 搜索旋转排序数组
 * @author: liuguohu
 * @create: 2020-05-02 21:07
 **/

public class Solution_33 {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int n = nums.length;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution_33 test = new Solution_33();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(test.search(nums,3 ));
    }
}
