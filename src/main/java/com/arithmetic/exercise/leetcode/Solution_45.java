package com.arithmetic.exercise.leetcode;

/**
 * @program: leetCode-exercise
 * @description: 45. 跳跃游戏 II
 * @author: liuguohu
 * @create: 2020-05-04 21:07
 **/

public class Solution_45 {

    public int jump(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = Integer.MAX_VALUE;
        }
        res[0] = 0;
        for(int i=0; i<nums.length-1; i++){
            int len = nums[i] + i + 1> nums.length ? nums.length : nums[i] + i + 1;
            for(int j=i+1; j<len; j++){
//                int temp = res[j] == Integer.MAX_VALUE ? 0 : res[j];
                if(res[i] + 1 < res[j]){
                    res[j] = res[i] + 1;
                }
            }
        }

        return res[nums.length-1];
    }

    public int jump2(int[] nums) {
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for(int i = 0; i < nums.length - 1; i++){
            //找能跳的最远的
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }


    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        Solution_45 test = new Solution_45();
        System.out.println(test.jump2(nums));
    }
}
