package com.arithmetic.exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: leetCode-exercise
 * @description: 3. 无重复字符的最长子串
 * @author: liuguohu
 * @create: 2020-03-25 20:17
 **/

public class Solution_3 {

    public int lengthOfLongestSubstring(String s) {
        int start=0,max=0;
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            start = Math.max(start, map.getOrDefault(s.charAt(i),-1)+1);
            map.put(s.charAt(i), i);
            max = Math.max(max, i-start+1);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution_3 test = new Solution_3();
        System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
    }
}
