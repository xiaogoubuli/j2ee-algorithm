package org.j2ee.algorithm.sort;

import org.j2ee.algorithm.util.SwapUtils;

/**
 * 
 * 选择排序
 * 
 * @author sun
 *
 */
public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0, len = array.length; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (i != min) {
                SwapUtils.swap(array, i, min);
            }
        }
    }

}
