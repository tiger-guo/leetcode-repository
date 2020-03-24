package com.arithmetic.exercise.leetcode;

import com.arithmetic.exercise.leetcode.dataStruct.TreeNode;

/**
 * @program: leetCode-exercise
 * @description:面试题55 - I. 二叉树的深度
 * @author: liuguohu
 * @create: 2020-03-24 17:46
 **/

public class Solution_Offer_55 {
    int maxDeep = 0;
    public int maxDepth(TreeNode root) {
        if(root == null)
            return maxDeep;
        dfs(root, 0);
        return maxDeep;
    }
    private void dfs(TreeNode root, int deep){
        if(root == null){
            if(deep > maxDeep){
                maxDeep = deep;
            }
            return;
        }
        dfs(root.left, deep+1);
        dfs(root.right, deep+1);
    }
}
