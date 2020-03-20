package com.arithmetic.exercise.leetcode;

import com.arithmetic.exercise.leetcode.dataStruct.TreeNode;
import com.arithmetic.exercise.testData.TreeNodeData;
import org.junit.Test;

import java.util.LinkedList;

/**
 * @program: leetCode-exercise
 * @description:
 * @author: liuguohu
 * @create: 2020-03-20 15:26
 **/

public class Tests {

    @Test
    public void test() {
        TreeNode root = TreeNodeData.getData1();
        Codec codec = new Codec();
        String serializeRes = codec.serialize(root);
        root = codec.deserialize(serializeRes);
        System.out.println(codec.serialize(root));
    }

    @Test
    public void test2() {
        String data = "[]";
        Codec codec = new Codec();
        System.out.println(codec.deserialize(data));
    }
}
