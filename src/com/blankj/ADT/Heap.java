package com.blankj.ADT;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-20 10:26
 */
public class Heap {
    public static void main(String[] args) throws Exception {
        // input
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        // process
        String[] chars = string.split(",");
        int[] array = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            array[i] = Integer.parseInt(chars[i]);
        }

        //
        int[] largeTopHeap = getLargeHeapFromBottomToTop(array);
        for (int j : largeTopHeap) {
            System.out.print(j);
        }
//        System.out.println();
////        int[] result = deleteNodeFromLargeTop(largeTopHeap, 1);
////        for (int j : result) {
////            System.out.print(j);
////        }
    }

    /**
     * From top to bottom build a heap.
     * @param array is a source array
     * @return the heap of large top
     */
    public static int[] getLargeHeap(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
            int j = i;
            while (j > 0) {
                if (result[j] > result[(j - 1) / 2]) {
                    int temp = result[j];
                    result[j] = result[(j-1)/2];
                    result[(j-1)/2] = temp;
                }
                j = (j - 1) / 2;
            }
        }
        return result;
    }

    /**
     * From top to bottom build a heap.
     * @param array the source array
     * @return the heap of small top
     */
    public static int[] getSmallHeap(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
            int j = i;
            while (j > 0) {
                if (result[j] < result[(j - 1) / 2]) {
                    int temp = result[j];
                    result[j] = result[(j-1)/2];
                    result[(j-1)/2] = temp;
                }
                j = (j - 1) / 2;
            }
        }
        return result;
    }

    /**
     * Delete the index node from the large top heap.
     * @param array the heap
     * @param index index of the delete node
     * @return the array contains the deleted node that in the end of the array
     */
    public static int[] deleteNodeFromLargeTop(int[] array, int index) throws Exception {
        int length = array.length;
        if (index >= length || index < 0) {
            throw new Exception("Invalid index");
        }

        int temp = array[length-1];
        array[length - 1] = array[index];
        array[index] = temp;

        while ((index - 1) / 2 > 0) {
            if (array[index] > array[(index - 1) / 2]) {
                int tem = array[index];
                array[index] = array[(index - 1) / 2];
                array[(index - 1) / 2] = tem;
                index = (index - 1) / 2;
            } else {
                break;
            }

        }
        while (2 * index + 2 <= length - 1) {
            int maxIndex = array[2 * index + 1] > array[2 * index + 2] ? 2 * index + 1 : 2 * index + 2;
            if (array[index] < array[maxIndex]) {
                int tem = array[index];
                array[index] = array[maxIndex];
                array[maxIndex] = tem;
                index = maxIndex;
            }else{
                break;
            }
        }
        return array;
    }

    /**
     * From bottom to top build a heap.
     * @param array the source array
     * @return the heap of large top
     */
    public static int[] getLargeHeapFromBottomToTop(int[] array) {
        int length = array.length;
        for (int i = (length - 1) / 2 - 1; i >= 0; i--) {
            heapifyOfLarge(array, i);
        }
        return array;
    }

    /**
     * Swap two position element of the array.
     * @param array source array
     * @param pOne position one
     * @param pTwo position two
     */
    private static void swap(int[] array, int pOne, int pTwo) {
        int temp = array[pOne];
        array[pOne] = array[pTwo];
        array[pTwo] = temp;
    }

    /**
     *
     * @param array
     * @return
     */
    public static int[] sort(int[] array) {
        int length = array.length-1;
        while (length >= 0) {
            swap(array,0,length);
            heapifyOfLarge(array, 0);
            length--;
        }

        return array;
    }

    /**
     * Heapity the heap
     * @param array source heap
     * @param index the position of heap
     */
    private static void heapifyOfLarge(int[] array, int index) {
        while (true) {
            int length = array.length;
            int maxPosition = index;
            if (2 * index + 1 < length && array[index] < array[2 * index + 1]) {
                maxPosition = 2 * index + 1;
            }
            if (2 * index + 2 < length && array[maxPosition] < array[2 * index + 2]) {
                maxPosition = 2 * index + 2;
            }
            if (maxPosition == index) {
                break;
            }
            swap(array, index, maxPosition);
            index = maxPosition;
        }
    }

    public static int[] topK(int[] array, int k) {
        int[] top = new int[k];


        return top;
    }

    private static void heapifyOfSmall(int[] array, int index) {
        while (true) {
            int length = array.length;
            int minPosition = index;
            if (2 * index + 1 < length && array[index] > array[2 * index + 1]) {
                minPosition = 2 * index + 1;
            }
            if (2 * index + 2 < length && array[minPosition] > array[2 * index + 2]) {
                minPosition = 2 * index + 2;
            }
            if (minPosition == index) {
                break;
            }
            swap(array, index, minPosition);
            index = minPosition;
        }
    }
}
