package com.arithmetic.exercise.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetCode-exercise
 * @description: 128. 最长连续序列
 * @author: liuguohu
 * @create: 2020-05-04 22:19
 **/

public class Solution_128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLong = 0;
        for(int num: nums){
            set.add(num);
        }

        for (Integer num: set){
            if(!set.contains(num)){
                int currentNum = num;
                int step = 1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    step++;
                }

                if(step>maxLong){
                    maxLong = step;
                }
            }
        }
        return maxLong;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        Solution_128 test = new Solution_128();
        test.longestConsecutive(nums);
    }
}
