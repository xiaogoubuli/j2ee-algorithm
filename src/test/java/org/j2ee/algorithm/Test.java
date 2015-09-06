package org.j2ee.algorithm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

import org.j2ee.algorithm.sort.MergeSort;
import org.j2ee.algorithm.sort.QuickSort;

public class Test {

    public static void main(String[] args) {
        int[] a = new int[10000000];
        for (int i = 0, len = a.length; i < len; i++) {
            a[i] = new Random().nextInt();
        }
        // System.out.println(Arrays.toString(a));
        // InsertionSort.sort(a);
        // sort(InsertionSort.class, a);
        sort(QuickSort.class, a);
        sort(MergeSort.class, a);
        // System.out.println(Arrays.toString(a));
    }

    private static void sort(Class<?> clazz, int[] array) {
        try {
            Method method = clazz.getMethod("sort", int[].class);
            long begin = System.currentTimeMillis();
            method.invoke(clazz, array);
            long end = System.currentTimeMillis();
            System.out.println(clazz.getSimpleName() + ": " + (end - begin));
            // System.out.println(Arrays.toString(array));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
