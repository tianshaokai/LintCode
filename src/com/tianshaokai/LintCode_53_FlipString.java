package com.tianshaokai;

/***
 *   53 翻转字符串
 */
public class LintCode_53_FlipString {

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }


    /*
     * 给定一个字符串，逐个翻转字符串中的每个单词。
     * @param s: A string
     * @return: A string
     */
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = array.length -1; i >= 0; i --) {
            if (!array[i].equals("")) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

}
