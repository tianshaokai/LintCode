package com.tianshaokai;

public class LintCode_146_LowercaseToUppercase {

    public static void main(String[] args) {
        String str = "abc12";
        String str1 = "aBc12";
        String str2 = "ABc12de";
        String str3 = "aBC12de";

        System.out.println(lowercaseToUppercase(str));
        System.out.println(lowercaseToUppercase(str1));
        System.out.println(lowercaseToUppercase(str2));
        System.out.println(lowercaseToUppercase(str3));
    }

    public static String lowercaseToUppercase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] -= 32;
            }
        }

        return new String(charArray);
    }
}
