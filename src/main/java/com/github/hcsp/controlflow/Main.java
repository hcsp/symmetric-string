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
        int length = str.length();
        if (length % 2 == 0 || length < 3) return false;
        boolean result = true;
        for (int i = 0; i <= ((length - 1) / 2) - 1; i++) {
            char leftChar = str.charAt(i);
            char rightChar = str.charAt(str.length() - 1 - i);
            System.out.println(leftChar + "," + rightChar);
            if (leftChar != rightChar) {
                result = false;
            }
        }
        return result;
    }
}
