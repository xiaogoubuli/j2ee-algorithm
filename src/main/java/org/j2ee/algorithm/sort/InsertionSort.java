package org.j2ee.algorithm.sort;

/**
 * 
 * 插入排序
 * 
 * @author sun
 *
 */
public class InsertionSort {

    public static void sort(int[] array) {
        for (int i = 1, len = array.length; i < len; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

}
