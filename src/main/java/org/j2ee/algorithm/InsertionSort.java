package org.j2ee.algorithm;

import java.util.Random;

/**
 * 
 * 插入排序
 * 
 * @author sun
 *
 */
public class InsertionSort {

    public static void sort(int[] a) {
        for (int i = 1, len = a.length; i < len; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0, len = a.length; i < len; i++) {
            a[i] = new Random().nextInt();
        }
        // System.out.println(Arrays.toString(a));
        long begin = System.currentTimeMillis();
        sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        // System.out.println(Arrays.toString(a));
    }

}
