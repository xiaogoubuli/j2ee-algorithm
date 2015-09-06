package org.j2ee.algorithm.util;

/**
 * 
 * 数组元素交换工具类
 * 
 * @author sun
 *
 */
public class SwapUtils {

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
