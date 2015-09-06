package org.j2ee.algorithm.sort;

import org.j2ee.algorithm.util.SwapUtils;

/**
 * 
 * 冒泡排序
 * 
 * @author sun
 *
 */
public class BubbleSort {

    public static void sort(int[] array) {
        for (int i = 0, len = array.length; i < len - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    SwapUtils.swap(array, j, j - 1);
                }
            }
        }
    }

}
