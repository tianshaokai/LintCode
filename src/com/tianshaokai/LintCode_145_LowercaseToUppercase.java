package com.tianshaokai;

public class LintCode_145_LowercaseToUppercase {

    public static void main(String[] args) {
        char a = 'a';
        char A = 'A';

        System.out.println(lowercaseToUppercase(a));
        System.out.println(uppercaseToLowercase(A));

        System.out.println("----");
        for (char num = 'a'; num <= 'z'; num++) {
            System.out.print(charToByteAscii(num) + ",");
        }
        System.out.println("=======");
        System.out.println(byteAsciiToChar(97));
        System.out.println(byteAsciiToChar(65));

        System.out.println(sumStrAscii("abc"));
    }

    public static char lowercaseToUppercase(char character) {
        return (char) (character - 32);
    }

    public static char uppercaseToLowercase(char character) {
        return (char) (character + 32);
    }

    public static byte charToByteAscii(char ch) {
        return (byte) ch;
    }

    public static char byteAsciiToChar(int ascii) {
        return (char) ascii;
    }

    public static int sumStrAscii(String str) {
        byte[] byteArray = str.getBytes();
        int sum = 0;
        for (byte aByteArray : byteArray) {
            sum += aByteArray;
        }
        return sum;
    }
}
