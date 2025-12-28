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
        if (str == null) {
            return false;
        }

        for (int i = 0; i < str.length() / 2; i++) {   // i是从第一个字符开始往后走
                                                       // i< str.length()/2 这里 ➗2 是因为 i 只需要走一半的路程
            int j = str.length() - 1 - i;              // j是从最后一个字符开始往前走 所以length()-1
                                                       // 并且 j 不需要走 i 走过的路程, 所以 -i
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
