package com.github.hcsp.controlflow;

import java.util.ArrayList;

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
        ArrayList<String> arr;
        arr = new ArrayList<>();
        ArrayList<String> rra;
        rra = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            arr.add(String.valueOf(str.charAt(i)));
        }//将str顺序存入一个列表
         for (int j = 0; j <str.length() ; j++) {
            rra.add(String.valueOf(str.charAt(str.length()-j-1)));
        }//将str逆序存入一个列表
//        for (int k = 0; k <str.length() ; k++) {
//          if (arr.get(k).equals(rra.get(k))) {
//              System.out.println("相等");
//            }
//        }
        return arr.equals(rra);
    }
}
