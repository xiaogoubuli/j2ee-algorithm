package org.j2ee.algorithm.sort;

/**
 * 
 * 归并排序
 * 
 * @author sun
 *
 */
public class MergeSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            sort(array, begin, middle);
            sort(array, middle + 1, end);
            merge(array, begin, middle, end);
        }
    }

    private static void merge(int[] array, int begin, int middle, int end) {
        int leftLength = middle - begin + 1;
        int rightLength = end - middle;
        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];
        int i;
        int j;
        for (i = 0; i < leftLength; i++) {
            leftArray[i] = array[begin + i];
        }
        for (j = 0; j < rightLength; j++) {
            rightArray[j] = array[middle + j + 1];
        }
        i = 0;
        j = 0;
        for (int k = begin; k <= end; k++) {
            if (i >= leftLength) {
                array[k] = rightArray[j];
                j++;
            } else if (j >= rightLength) {
                array[k] = leftArray[i];
                i++;
            } else if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
        }
    }

}
