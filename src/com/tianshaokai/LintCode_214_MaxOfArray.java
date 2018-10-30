package com.tianshaokai;

/***
 * 返回数组最大值
 */
public class LintCode_214_MaxOfArray {

    public static void main(String[] args) {
        float[] array = {1.0f, 2.1f, -3.3f};
        System.out.println(maxOfArray(array));
    }

    private static float maxOfArray(float[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        float max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
