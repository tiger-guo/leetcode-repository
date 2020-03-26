package com.arithmetic.exercise.leetcode;

import com.arithmetic.exercise.leetcode.dataStruct.TreeNode;
import com.arithmetic.exercise.testData.TreeNodeData;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;

/**
 * @program: leetCode-exercise
 * @description:
 * @author: liuguohu
 * @create: 2020-03-20 15:26
 **/

public class Tests {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class classz = Son.class;
        Method method = classz.getMethod("ageIncrement");
        method.invoke(new Son(), null);
    }
}

class Parent{
    static int age = 0;
    static String name = null;


    public static void ageIncrement(){
        age = 1;
    }

}

class Son extends Parent{

    public static void ageIncrement() {
        name = "haha";
        System.out.println(name);
    }
}

