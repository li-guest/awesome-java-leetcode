package com.blankj.ADT.sort;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-21 10:15
 */
public class QuickSorted {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4, 5};
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void quickSort(int[] array, int low, int high){
        if (array.length == 0 || low < high) {
            return ;
        }

        int index = partition(array, low, high);
        quickSort(array, low, index - 1);
        quickSort(array, index + 1, high);
    }


    private static int partition(int[] array, int low, int high) {
        int base = array[low];
        while (low != high) {
            while (array[high] >= base && low < high) {
                high--;
            }
            array[low] = array[high];
            while (array[low] <= base && low < high) {
                low++;
            }
            array[high] = array[low];
        }
        array[high] = base;
        return high;
    }
}
