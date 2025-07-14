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
        int TheLengthofString = str.length();                     // 先找出字符串的长度
        String midium = String.valueOf(str.length() / 2);     // 这一步是找中间的character
        for (int i = 0; i < str.length() - 1; i++) {              // 从头开始遍历string,直到最后一个char
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {          // 但凡有一个不相同就return false
                return false;
            }
        }

        return true; //注意这一行要跟for对齐, 所有字符相等循环才结束，return true
            }
        }