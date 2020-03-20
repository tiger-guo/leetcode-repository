package com.arithmetic.exercise.testData;

import com.arithmetic.exercise.leetcode.dataStruct.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * @program: leetCode-exercise
 * @description: TreeNode生成测试数据
 * @author: liuguohu
 * @create: 2020-03-20 15:40
 **/

public class TreeNodeData {

    public static TreeNode getData1(){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        root.left = node2;
        root.right = node3;
        node3.left = node4;
        node3.right = node5;
        return root;
    }
}
