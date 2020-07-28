package com.blankj.ByteDance;

import java.util.Scanner;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-19 16:37
 */
public class Advance {
    /**
     * 在先升后降的波动数组中，使用二分查找算法找到其中的最大值。
     */

    public static int binSearchMax(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        int low = 0;
        int high = array.length - 1;
        int mid = (low+high)/2;

        while (mid > 0 && mid < array.length-1) {
            if (array[mid-1] < array[mid] && array[mid+1] < array[mid]) {
                return array[mid];
            } else if (array[mid] > array[mid - 1]) {
                low = mid + 1;
                mid = (low + high) >> 2;
            } else {
                high = mid - 1;
                mid = (low + high) >> 2;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        // 测试用例输入
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String array[] = string.split(",");
        int nums[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }

        // 测试用例输出
        int maxNumber = binSearchMax(nums);
        System.out.println(maxNumber);

    }
}
