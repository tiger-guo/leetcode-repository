package com.arithmetic.exercise.leetcode;


import com.arithmetic.exercise.leetcode.dataStruct.TreeNode;

import java.util.LinkedList;

/**
 * @program: leetCode-exercise
 * @description: 剑值Offer 面试题37. 序列化二叉树
 * @author: liuguohu
 * @create: 2020-03-20 15:17
 **/

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        res.append("[");
        if(root != null) {
            LinkedList<TreeNode> queue = new LinkedList<>();
            queue.addLast(root);
            while (!queue.isEmpty()) {
                int len = queue.size();
                while (len-- > 0) {
                    TreeNode node = queue.removeFirst();
                    if (node == null) {
                        res.append("null,");
                    } else {
                        res.append(Integer.toString(node.val) + ",");
                        queue.addLast(node.left);
                        queue.addLast(node.right);
                    }
                }
            }
            res.deleteCharAt(res.length() - 1);
        }
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String res = data.substring(1, data.length() - 1);
        if(res.equals("")) {
            return null;
        }
        String[] nums = res.split(",");
        int index = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nums[index++]));
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len-- > 0) {
                TreeNode node = queue.removeFirst();
                if (!nums[index].equals("null")) {
                    int left = Integer.parseInt(nums[index++]);
                    node.left = new TreeNode(left);
                    queue.addLast(node.left);
                } else {
                    index++;
                }
                if (!nums[index].equals("null")) {
                    int right = Integer.parseInt(nums[index++]);
                    node.right = new TreeNode(right);
                    queue.addLast(node.right);
                } else {
                    index++;
                }
            }
        }

        return root;
    }
}
