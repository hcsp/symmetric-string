package com.github.hcsp.controlflow;

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
        /*
            再一次看了优秀答案后，发现大家是真的优秀
            感觉就我，是零基础班里的零基础（手动捂脸）
            居然就用一条语句就完成了我要用十多条语句的事情，而且还是重复造轮子
            下面就参看非最优秀的答案（不用StringBuilder类），来修改答案
         */
        char[] chArr = str.toCharArray();
        int length = chArr.length;
        //用length/2,可以减少一半的运算，如果是对称字符串的话
        for (int i = 0; i < length / 2; i++) {
            if (chArr[i] != chArr[length - (i + 1)]) {
                return false;
            }
        }
        return true;
    }
}
