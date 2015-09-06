package org.j2ee.algorithm.sort;

import org.j2ee.algorithm.util.SwapUtils;

/**
 * 
 * 快速排序
 * 
 * @author sun
 *
 */
public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int begin, int end) {
        if (begin < end) {
            int middle = partition(array, begin, end);
            sort(array, begin, middle - 1);
            sort(array, middle + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {
        int flag = array[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (array[j] <= flag) {
                i++;
                SwapUtils.swap(array, i, j);
            }
        }
        SwapUtils.swap(array, i + 1, end);

        return i + 1;
    }

}
