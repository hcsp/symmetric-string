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
/**
 * 知识点:
 * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
 *和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，
 * 并且不产生新的未使用对象。
 * StringBuilder 类在 Java 5 中被提出，
 * 它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
 *在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
 *
 *
 * StringBuffer.reverse 颠倒反转字符
 */

        StringBuffer str1 = new StringBuffer(str);
        str1.reverse();
        if (str.contentEquals(str1)) {
            return true;
        }
        return false;
    }
}
