package com.arithmetic.exercise.leetcode;

import com.arithmetic.exercise.leetcode.dataStruct.TreeNode;

/**
 * @program: leetCode-exercise
 * @description: 面试题68 - I. 二叉搜索树的最近公共祖先
 * @author: liuguohu
 * @create: 2020-03-26 16:45
 **/

public class Solution_68 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
