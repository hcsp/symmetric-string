package com.github.hcsp.controlflow;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSymmetric("1234"));
        System.out.println(isSymmetric("1234321"));
    }

    /**
     * 判断一个字符串是否是对称字符串。一个字符串对称意味着它和它的逆序相同。
     *
     * <p>例如，"12321"和"上海自来水来自海上"是对称字符串 "1234"不是对称字符串
     *
     * @param str 给定的字符串
     * @return 若给定的字符串是对称的，返回true，否则返回false
     */
    public static boolean isSymmetric(String str) {
        char[] str1 = str.toCharArray();
        revertCharArray(str1);
        return Arrays.equals(str.toCharArray(), str1);//这里感觉有点绕弯子了，不知道怎么才能做得更好一些。。。
    }
    public static void revertCharArray(char[] str1){
        for (int i = 0; i <str1.length/2; i++) {
            char tmp = str1[i];
            str1[i] = str1[str1.length - i - 1];
            str1[str1.length - i - 1] = tmp;
        }
    }
}
